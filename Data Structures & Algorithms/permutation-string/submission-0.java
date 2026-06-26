class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        // If s1 is longer than s2, s2 cannot contain a permutation of s1
        if (len1 > len2) return false;
        
        // Frequency arrays for lowercase English letters
        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];
        
        // 1. Populate frequencies for s1 and the first window of s2
        for (int i = 0; i < len1; i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }
        
        // 2. Check if the first window matches
        if (matches(s1Counts, s2Counts)) return true;
        
        // 3. Slide the window across s2
        for (int i = len1; i < len2; i++) {
            // Add the incoming character to the window
            s2Counts[s2.charAt(i) - 'a']++;
            // Remove the outgoing character from the window
            s2Counts[s2.charAt(i - len1) - 'a']--;
            
            // Check if current window matches s1's frequencies
            if (matches(s1Counts, s2Counts)) return true;
        }
        
        return false;
    }
    
    // Helper method to compare two frequency arrays
    private boolean matches(int[] s1Counts, int[] s2Counts) {
        for (int i = 0; i < 26; i++) {
            if (s1Counts[i] != s2Counts[i]) return false;
        }
        return true;
    }
}
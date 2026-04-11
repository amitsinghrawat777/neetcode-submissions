class Solution {
   public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    
    // Check each character of the first string
    for (int i = 0; i < strs[0].length(); i++) {
        char c = strs[0].charAt(i);
        
        // Compare it against the same position in other strings
        for (int j = 1; j < strs.length; j++) {
            // Stop if current string is shorter OR characters mismatch
            if (i == strs[j].length() || strs[j].charAt(i) != c) {
                return strs[0].substring(0, i);
            }
        }
    }
    return strs[0];
}
}
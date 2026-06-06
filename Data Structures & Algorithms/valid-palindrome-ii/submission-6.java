class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPerfectPalindrome(s,l+1,r)||isPerfectPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean isPerfectPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
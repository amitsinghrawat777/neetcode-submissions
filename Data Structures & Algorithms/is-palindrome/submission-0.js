class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        let sml= s.toLocaleLowerCase().replace(/[^a-z0-9]/g, '');
        let pal = Array.from(sml);
        let l=0;
        let r=pal.length-1
        while(l<r){
            if(pal[l]!==pal[r]){
                return false
            }
            l++;
            r--;
        }
        return true
    }
}

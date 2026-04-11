class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const map = new Set(nums);
        let count=0;
        for(let i of nums){
            if(!map.has(i-1)){
                let c=i;
                let s=1;
                while(map.has(c+1)){
                    c+=1;
                    s+=1;
                }
                count = Math.max(count,s)
            }
        }
        return count;
    }
}

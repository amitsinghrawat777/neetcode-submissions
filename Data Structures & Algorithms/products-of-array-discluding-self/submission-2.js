class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        let res=[];
        let n=nums.length
        let pre=1;
        for(let i=0;i<n;i++){
            res[i]=pre;
            pre*=nums[i];
        }
        let pos=1;
        for(let i=n-1;i>=0;i--){
            res[i]*=pos;
            pos*=nums[i]
        }
        return res;
    }
}

class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        const res=[]
        for(let i=0;i<nums.length;i++){
            let k=1
            for(let j=0;j<nums.length;j++){
                if(i===j){
                    continue
                }
                k*=nums[j]
            }
            res.push(k)
        }
        return res
    }
}
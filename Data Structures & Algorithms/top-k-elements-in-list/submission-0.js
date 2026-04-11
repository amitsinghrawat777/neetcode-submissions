class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const seen = new Map()
        for(let i=0;i<nums.length;i++){
            const num = nums[i]
            const counter = seen.get(num) || 0
            seen.set(num,counter+1)
        }
        const pairs = Array.from(seen.entries())
        pairs.sort((a,b)=>b[1]-a[1])//sort decending 
        return pairs.slice(0,k).map(pairs=>pairs[0])
    }
}
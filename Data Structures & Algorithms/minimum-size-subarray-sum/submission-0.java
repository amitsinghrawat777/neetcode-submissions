class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            
                sum+=nums[j];
                j++;
            while(sum>=target){
                count = Math.min(count,j-i);
                sum-=nums[i];
                i++;
            }
        }
        return count== Integer.MAX_VALUE ? 0:count;
    }
}
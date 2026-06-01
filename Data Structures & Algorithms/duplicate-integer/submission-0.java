class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> Dup =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(Dup.contains(nums[i])){
                return true;
            }
            else{
                Dup.add(nums[i]);
            }
        }
        return false;
    }
}
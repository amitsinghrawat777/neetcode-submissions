class Solution {
    public int trap(int[] height) {
        int l=0,ml=0;
        int r=height.length-1,mr=0;
        int total=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=ml){
                    ml=height[l];
                }
                else total+=ml-height[l];
                l++;
            }
            else{
                if(height[r]>=mr){
                    mr=height[r];
                }
                else total+=mr-height[r];
                r--;
            }
        }
        return total;
    }
}

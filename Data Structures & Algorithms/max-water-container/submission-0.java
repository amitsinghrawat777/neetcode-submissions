class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right= heights.length-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int water=width*Math.min(heights[left],heights[right]);
            max=Math.max(water,max);

            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }
}

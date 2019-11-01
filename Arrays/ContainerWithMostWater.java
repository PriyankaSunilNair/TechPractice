class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int start = 0;
        int end = height.length - 1;
        while(start<end) {
            maxWater = Math.max(maxWater, Math.min(height[start], height[end]) * (end-start));
            if(height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxWater;
    }
}
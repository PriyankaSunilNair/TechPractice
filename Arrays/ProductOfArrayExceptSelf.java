class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        int len = nums.length;
        int[] result = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        right[len-1] = 1;
        for(int i=1; i<len; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        for(int j=len-2; j>=0; j--) {
            right[j] = right[j+1] * nums[j+1];
        }
        for(int i=0; i<len; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
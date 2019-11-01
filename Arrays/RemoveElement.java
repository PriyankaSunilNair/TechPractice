class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int start = 0, end = length-1;
        if(nums == null || length == 0) {
            return 0;
        }
        while(start<end) {
            if(nums[start] == val && nums[end] != val) {
                nums[start++] = nums[end--];
                length--;
            }
            else if(nums[start] != val) {
                start++;
            }
            else {
                length--;
                end--;
            }
        }
        if(nums[start] == val) {
            length--;
        }
        return length;
    }
}
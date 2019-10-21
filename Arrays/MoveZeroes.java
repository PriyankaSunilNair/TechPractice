class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == 0) {
                int count = 0;
                while(i+count < nums.length-1 && nums[i+count] == 0) {
                    count++;
                }
                nums[i] = nums[i+count];
                nums[i+count] = 0;
            }
        }
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-1 && nums[i] == nums[i+1]){
            i=i+2;
        }
        return nums[i];
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] nums = new int[length];
        int a1=0, a2=0, result=0;
        while(a1 < nums1.length && a2 < nums2.length) {
            if(nums1[a1] < nums2[a2]) {
                nums[result++] = nums1[a1++];
            }
            else {
                nums[result++] = nums2[a2++];
            }
        }
        while(a1 < nums1.length) {
            nums[result++] = nums1[a1++];
        }
        while(a2 < nums2.length) {
            nums[result++] = nums2[a2++];
        }
        double ans = 0;
        if(length % 2 != 0) {
            ans = nums[length/2];
        }
        else {
            int mid = length/2;
            ans = (double)(nums[mid-1]+nums[mid])/2;
        }
        return ans;
    }
}
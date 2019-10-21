class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int shorter = nums1.length < nums2.length ? nums1.length : nums2.length;
        int result[] = new int[shorter];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                i++;
            }
        }
        return Arrays.copyOf(result,k);
    }
}
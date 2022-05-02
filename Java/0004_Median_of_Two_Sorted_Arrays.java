class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int sumLen = nums1Len + nums2Len;

        if(sumLen % 2 != 0) {
            return findKthSmallest(nums1, nums1Len, 0, nums2, nums2Len, 0, sumLen / 2 + 1);
        }
        else {
            return (findKthSmallest(nums1, nums1Len, 0, nums2, nums2Len, 0, sumLen / 2)
                    + findKthSmallest(nums1, nums1Len, 0, nums2, nums2Len, 0, sumLen / 2 + 1)) / 2.0;
        }
    }

    public static int findKthSmallest(int[] a, int m, int begin1, int[] b, int n, int begin2, int k) {

    }
}

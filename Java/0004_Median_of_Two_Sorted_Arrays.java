class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null && nums2 == null) {
            return 0;
        }

        if(nums1 == null) {
            int n = nums2.length;
            return nums2[(n - 1) / 2] * 0.5 + nums2[n / 2] * 0.5;
        }
    }
}

// Hints
// https://ganeshpr227.medium.com/logarithmic-algorithm-for-finding-median-of-two-sorted-arrays-of-different-sizes-aaecf302057e
// https://www.youtube.com/watch?v=LPFhl65R7ww

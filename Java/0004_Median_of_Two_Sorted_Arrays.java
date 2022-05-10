class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1len = nums1.length;
        int nums2len = nums2.length;
        int sumLen = nums1len + nums2len;

        if (sumLen % 2 != 0) {
            return findKthSmallest(nums1, nums1len, 0, nums2, nums2len, 0, sumLen / 2 + 1);
        } else {
            return (findKthSmallest(nums1, nums1len, 0, nums2, nums2len, 0, sumLen / 2)
                    + findKthSmallest(nums1, nums1len, 0, nums2, nums2len, 0, sumLen / 2 + 1)) / 2.0;
        }
    }
    
    public static int findKthSmallest(int[] nums1, int len1, int begin1, int[] nums2, int len2, int begin2, int kth) {
        if (len1 > len2)
            return findKthSmallest(nums2, len2, begin2, nums1, len1, begin1, kth);
        if (len1 == 0)
            return nums2[begin2 + kth - 1];
        if (kth == 1)
            return Integer.min(nums1[begin1], nums2[begin2]);

        int nums1part = Integer.min(kth / 2, len1);
        int nums2part = kth - nums1part;
        if (nums1[begin1 + nums1part - 1] == nums2[begin2 + nums2part - 1])
            return nums1[begin1 + nums1part - 1];
        else if (nums1[begin1 + nums1part - 1] > nums2[begin2 + nums2part - 1])
            return findKthSmallest(nums1, len1, begin1, nums2, len2 - nums2part, begin2 + nums2part, kth - nums2part);
        else
            return findKthSmallest(nums1, len1 - nums1part, begin1 + nums1part, nums2, len2, begin2, kth - nums1part);
    }
}



// References
// https://www.youtube.com/watch?v=LPFhl65R7ww
// https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/2471/Very-concise-O(log(min(MN)))-iterative-solution-with-detailed-explanation

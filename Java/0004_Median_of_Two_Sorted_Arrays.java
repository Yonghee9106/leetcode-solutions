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

    public static int findKthSmallest(int[] nums1, int len1, int begin1, int[] nums2, int len2, int begin2, int kth) {
        if(len1 > len2)
            return findKthSmallest(nums2, len2, begin2, nums1, len1, begin1, kth);
        if(len1 == 0)
            return nums2[begin2 + kth - 1];
        if(kth == 1)
            return Integer.min(nums1[begin1], nums2[begin2]);

        int nums1Part = Integer.min(kth/2, len1);
        int nums2Part = kth = nums1Part;

        if(nums1[begin1 + nums1Part - 1] == nums2[begin2 + nums2Part - 1])
            return nums1[begin1 + nums1Part - 1];
        else if(nums1[begin1 + nums1Part - 1] > nums2[begin2 + nums2Part - 1])
            return findKthSmallest(nums1, nums1Part, begin1, nums2, len2 - nums2Part, begin2 + nums2Part, kth - nums2Part);
        else
            return findKthSmallest(nums1, len1 - nums1Part, begin1 + nums1Part, nums2, nums2Part, begin2, kth - nums1Part);
    }
}

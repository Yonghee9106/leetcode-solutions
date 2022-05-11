class Solution {
    public double findMedianSortedArrays(int nums1[], int nums2[]) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        
        if (nums1Len > nums2Len) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int nums1Low = 0;
        int nums1High = nums1Len;
        while (nums1Low <= nums1High) {
            int nums1Partition = (nums1Low + nums1High)/2;
            int nums2Partition = (nums1Len + nums2Len + 1)/2 - nums1Partition;

            int nums1LeftMax = (nums1Partition == 0) ? Integer.MIN_VALUE : nums1[nums1Partition - 1];
            int nums1MinRight = (nums1Partition == nums1Len) ? Integer.MAX_VALUE : nums1[nums1Partition];

            int nums2LeftMax = (nums2Partition == 0) ? Integer.MIN_VALUE : nums2[nums2Partition - 1];
            int nums2RightMin = (nums2Partition == nums2Len) ? Integer.MAX_VALUE : nums2[nums2Partition];

            if (nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1MinRight) {
                if ((nums1Len + nums2Len) % 2 == 0) {
                    return ((double)Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1MinRight, nums2RightMin))/2;
                } else {
                    return (double)Math.max(nums1LeftMax, nums2LeftMax);
                }
            } else if (nums1LeftMax > nums2RightMin) {
                nums1High = nums1Partition - 1;
            } else {
                nums1Low = nums1Partition + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}



// References
// https://www.youtube.com/watch?v=LPFhl65R7ww
// https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/2471/Very-concise-O(log(min(MN)))-iterative-solution-with-detailed-explanation

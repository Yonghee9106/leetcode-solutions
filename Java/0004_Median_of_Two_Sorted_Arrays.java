class Solution {
    public double findMedianSortedArrays(int nums1[], int nums2[]) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        
        // if length of nums1 is bigger than nums2, the nums2 partition can be out of bounds for nums2
        if (nums1Len > nums2Len) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int nums1Low = 0;
        int nums1High = nums1Len;
        // find the partition where all left side numbers of nums1 and nums2 are smaller than right side numbers
        while (nums1Low <= nums1High) {
            int nums1Partition = (nums1Low + nums1High)/2;
            int nums2Partition = (nums1Len + nums2Len + 1)/2 - nums1Partition;

            int nums1LeftMax = (nums1Partition == 0) ? Integer.MIN_VALUE : nums1[nums1Partition - 1];
            int nums1RightMin = (nums1Partition == nums1Len) ? Integer.MAX_VALUE : nums1[nums1Partition];

            int nums2LeftMax = (nums2Partition == 0) ? Integer.MIN_VALUE : nums2[nums2Partition - 1];
            int nums2RightMin = (nums2Partition == nums2Len) ? Integer.MAX_VALUE : nums2[nums2Partition];

            // if all left side numbers are smaller than right side numbers
            if (nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
                if ((nums1Len + nums2Len) % 2 == 0) {           // if length of two arrays is even
                    return ((double)Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin))/2;
                } else {                                        // if length of two arrays is odd
                    return (double)Math.max(nums1LeftMax, nums2LeftMax);
                }
            } else if (nums1LeftMax > nums2RightMin) {          // if nums1's left max is bigger than nums2's right min
                nums1High = nums1Partition - 1;                 // move nums1 partition to left side
            } else {                                            // if nums2's left max is bigger than nums1's right min
                nums1Low = nums1Partition + 1;                  // move nums1 partition to right side
            }
        }
        throw new IllegalArgumentException();
    }
}



// References
// https://www.youtube.com/watch?v=LPFhl65R7ww
// https://github.com/mission-peace/interview/blob/master/src/com/interview/binarysearch/MedianOfTwoSortedArrayOfDifferentLength.java

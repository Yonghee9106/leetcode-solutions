/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let nums1Len = nums1.length;
    let nums2Len = nums2.length;

    // if length of nums1 is bigger than nums2, the nums2 partition can be out of bounds for nums2
    if(nums1.length > nums2.length) {
        return findMedianSortedArrays(nums2, nums1);
    }

    let nums1Low = 0;
    let nums1High = nums1Len;
    // find the partition where all left side numbers of nums1 and nums2 are smaller than right side numbers
    while(nums1Low <= nums1High) {
        const nums1Partition = Math.floor((nums1Low+nums1High)/2);
        const nums2Partition = Math.floor((nums1Len+nums2Len+1)/2) - nums1Partition;

        const nums1LeftMax = (nums1Partition == 0) ? Number.NEGATIVE_INFINITY : nums1[nums1Partition - 1];
        const nums1RightMin = (nums1Partition == nums1Len) ? Number.POSITIVE_INFINITY : nums1[nums1Partition];

        const nums2LeftMax = (nums2Partition == 0) ? Number.NEGATIVE_INFINITY : nums2[nums2Partition - 1];
        const nums2RightMin = (nums2Partition == nums2Len) ? Number.POSITIVE_INFINITY : nums2[nums2Partition];

        // if all left side numbers are smaller than right side numbers
        if(nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
            const lowMax = Math.max(nums1LeftMax, nums2LeftMax);
            if((nums1Len + nums2Len) % 2 == 1) {                            // if length of two arrays is odd
                return lowMax;
            }
            return (lowMax + Math.min(nums1RightMin, nums2RightMin)) / 2    // if length of two arrays is even
        } else if(nums1LeftMax > nums2RightMin) {       // if nums1's left max is bigger than nums2's right min
            nums1High = nums1Partition - 1;             // move nums1 partition to left side
        } else {                                        // if nums2's left max is bigger than nums1's right min
            nums1Low = nums1Partition + 1;              // move nums1 partition to right side
        }
    }
};



// References
// https://www.youtube.com/watch?v=LPFhl65R7ww

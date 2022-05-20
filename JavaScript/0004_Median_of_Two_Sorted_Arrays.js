/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
 var findMedianSortedArrays = function(nums1, nums2) {
    
    if(nums1.length > nums2.length) {
        return findMedianSortedArrays(nums2, nums1);
    }

    let nums1Len = nums1.length;
    let nums2Len = nums2.length;
    let nums1Low = 0;
    let nums1High = nums1Len;

    while(nums1Low <= nums1High) {
        const nums1Partition = Math.floor((nums1Low+nums1High)/2);
        const nums2Partition = Math.floor((nums1Len+nums2Len+1)/2) - nums1Partition;

        const nums1LeftMax = nums1Partition == 0 ? Number.NEGATIVE_INFINITY : nums1[nums1Partition - 1];
        const nums1RightMin = (nums1Partition == nums1Len) ? Number.POSITIVE_INFINITY : nums1[nums1Partition];
    }
};

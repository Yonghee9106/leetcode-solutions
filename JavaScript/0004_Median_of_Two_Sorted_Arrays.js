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

        const nums1LeftMax = (nums1Partition == 0) ? Number.NEGATIVE_INFINITY : nums1[nums1Partition - 1];
        const nums1RightMin = (nums1Partition == nums1Len) ? Number.POSITIVE_INFINITY : nums1[nums1Partition];

        const nums2LeftMax = (nums2Partition == 0) ? Number.NEGATIVE_INFINITY : nums2[nums2Partition - 1];
        const nums2RightMin = (nums2Partition == nums2Len) ? Number.POSITIVE_INFINITY : nums2[nums2Partition];

        if(nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
            const lowMax = Math.max(nums1LeftMax, nums2LeftMax)
            if( (nums1Len + nums2Len) % 2 == 1)
                return lowMax
            return (lowMax + Math.min(nums1RightMin, nums2RightMin)) / 2
        } else if(nums1LeftMax < nums2RightMin) {
            nums1Low = nums1Partition + 1
        } else 
            nums1High = nums1Partition - 1
    }
};

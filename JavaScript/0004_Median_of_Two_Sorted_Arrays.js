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
    let sumLen = nums1Len + nums2Len;
};

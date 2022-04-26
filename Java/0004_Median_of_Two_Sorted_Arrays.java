class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Size = nums2.length;
        int nums2Size = nums2.length;
        if(nums1Size < nums2Size) {
            return findMedianSortedArrays(nums2, nums1);
        }

        
    }
}

// Hint
// https://ganeshpr227.medium.com/logarithmic-algorithm-for-finding-median-of-two-sorted-arrays-of-different-sizes-aaecf302057e
// https://www.youtube.com/watch?v=LPFhl65R7ww

// Hints
// https://ganeshpr227.medium.com/logarithmic-algorithm-for-finding-median-of-two-sorted-arrays-of-different-sizes-aaecf302057e
// https://www.youtube.com/watch?v=LPFhl65R7ww

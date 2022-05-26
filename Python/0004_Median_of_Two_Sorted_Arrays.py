class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        sumLen = len(nums1) + len(nums2)

        if(sumLen % 2 == 1):
            return self.findKth(nums1, nums2, sumLen//2)
        else:
            return (self.findKth(nums1, nums2, sumLen//2-1) + self.findKth(nums1, nums2, sumLen//2)) / 2.0
            
    # find kth biggest element in two arrays
    def findKth(self, nums1, nums2, kth):
        # if length of nums1 is bigger than nums2, the nums2 partition can be out of bounds for nums2
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
        # if nums1 is empty, find kth element in nums2
        if not nums1:
            return nums2[kth]
        # if kth is equal to sum of two array lengths, return the biggest element
        if kth == len(nums1) + len(nums2) - 1:
            return max(nums1[-1], nums2[-1])

        # start binary search
        i = len(nums1) // 2
        j = kth - i
        if nums1[i] > nums2[j]:
            return self.findKth(nums1[:i], nums2[j:], i)
        else:
            return self.findKth(nums1[i:], nums2[:j], j)

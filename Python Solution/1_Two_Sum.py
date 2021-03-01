class Solution:
    def twoSum(self, nums, target):
        diff_dic = {}                           #key: num, value: index
        for index, num in enumerate(nums):
            diff = target - num
            if diff in diff_dic:
                return [diff_dic[diff], index]
            diff_dic[num] = index
            print(diff_dic)
        return print("No two sum solution")


print(Solution().twoSum([2, 7, 11, 15], 9))

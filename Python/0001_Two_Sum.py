class Solution:
    def twoSum(self, nums, target):             # type nums: List[int], type target: int
        diff_dic = {}                           # key: num, value: index
        
        for index, num in enumerate(nums):      # enumerate() returns index and value(num)
            diff = target - num
            
            if diff in diff_dic:                # if there is a diff in diff_dic
                return [diff_dic[diff], index]  # diff's index and current index is the two sum combination
            
            diff_dic[num] = index               # if there isn't a diff, add current num as key and index as value
            
        return print("No two sum solution!")

print(Solution().twoSum([2, 7, 11, 15], 9))

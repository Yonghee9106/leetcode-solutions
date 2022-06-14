class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff_dic = {}                           # key: num, value: index
        
        for index, num in enumerate(nums):      # enumerate() returns the index and value(num)
            diff = target - num
            
            if diff in diff_dic:                # if there is a 'diff' in the 'diff_dic' dictionary
                return [diff_dic[diff], index]  # the diff's index and current index are two sum combination
            
            diff_dic[num] = index               # if diff doesn't exist, add current num as a key and the index as a value
            
        return print("No two sum combination!")

    
    
print(Solution().twoSum([2, 7, 11, 15], 9))     # Example 1, output: [0, 1] 
print(Solution().twoSum([3, 2, 4], 6))          # Example 2, output: [1, 2]
print(Solution().twoSum([3, 3], 6))             # Example 3, output: [0, 1]

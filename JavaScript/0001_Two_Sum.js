/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function(nums, target) {
    
    let diff_dic = {};

    for(let i=0; i<nums.length; i++) {
        diff = target - nums[i];

        if(diff_dic[diff] != null) {
            return [diff_dic[diff], i];
        }

        diff_dic[nums[i]] = i;
    }

    return [];
};

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let diff_dic = {};                      // key: difference, value: index

    for(let i=0; i<nums.length; i++) {      // for all elements in nums
        diff = target - nums[i];

        if(diff_dic[diff] != null) {        // if the 'diff' exists in the 'diff_dic' dictionary
            return [diff_dic[diff], i];     // diff's index and current index are two sum combination
        }

        diff_dic[nums[i]] = i;              // if the diff doesn't exist, add num[i] as a key and index as a value
    }

    return [];
};

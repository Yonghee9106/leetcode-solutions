/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function(nums, target) {

    let diff_dic = {};                      // key: difference, value: index

    for(let i=0; i<nums.length; i++) {
        diff = target - nums[i];

        if(diff_dic[diff] != null) {        // if there is a diff in diff_dic
            return [diff_dic[diff], i];     // diff's index and current index are the two sum combination
        }

        diff_dic[nums[i]] = i;              // if there isn't a diff, add num[i] as a key and index as a value
    }

    return [];
};

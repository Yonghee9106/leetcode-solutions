class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];                                      // instantiate new array for result
        int diff;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();    // create hashmap (key: nums element, value: index)

        for(int i=0; i<nums.length; i++) {
            diff = target - nums[i];

            if(map.containsKey(diff)) {                                 // if there is a diff in map
                result[0] = map.get(diff);
                result[1] = i;

                return result;                                          // return diff's index and current index
            }
            map.put(nums[i], i);                                        // if not existing, add nums[i] as a key and index as a value
        }

        return result;
    }
}

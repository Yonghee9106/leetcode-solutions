class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int diff;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            diff = target - nums[i];

            if(map.containsKey(diff)) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}

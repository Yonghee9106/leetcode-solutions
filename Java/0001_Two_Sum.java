//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;

class Solution {

	public static int[] twoSum(int[] nums, int target) {
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
	
//	public static void main(String[] args) {
//		int[] nums1 = {2, 7 ,11, 15};
//		int[] result1 = twoSum(nums1, 9);
//		
//		int[] nums2 = {3, 2, 4};
//		int[] result2 = twoSum(nums2, 6);
//		
//		int[] nums3 = {3, 3};
//		int[] result3 = twoSum(nums3, 6);
//		
//		System.out.println(Arrays.toString(result1));					// [0, 1]
//		System.out.println(Arrays.toString(result2));					// [1, 2]
//		System.out.println(Arrays.toString(result3));					// [0, 1]
//	}
	
}

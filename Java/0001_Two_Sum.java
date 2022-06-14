//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;

class Solution {
	public static int[] twoSum(int[] nums, int target) {
	    int[] result = new int[2];                                      	// instantiate new array
	    int diff;

	    Map<Integer, Integer> diff_Map = new HashMap<Integer, Integer>();   // create hashmap (key: 'nums' element, value: index)

	    for(int i=0; i<nums.length; i++) {									// for all elements in the 'nums' array
	        diff = target - nums[i];

	        if(diff_Map.containsKey(diff)) {                                // if the 'diff' exists in the 'map'
	            result[0] = diff_Map.get(diff);								// result[0] = diff's index
	            result[1] = i;												// result[1] = current index

	            return result;                                          	// diff's index and current index are two sum combination
	        }
	        diff_Map.put(nums[i], i);										// if not existing, add nums[i] as a key and index as a value
	    }
	    return result;
	}
	
//	public static void main(String[] args) {
//		// Example 1, output: [0, 1]
//		int[] nums1 = {2, 7 ,11, 15};
//		int[] example1 = twoSum(nums1, 9);
//		
//		// Example 2, output: [1,2]
//		int[] nums2 = {3, 2, 4};
//		int[] example2 = twoSum(nums2, 6);
//		
//		// Example 3, output: [0,1]
//		int[] nums3 = {3, 3};
//		int[] example3 = twoSum(nums3, 6);
//		
//		System.out.println(Arrays.toString(example1));					// [0, 1]
//		System.out.println(Arrays.toString(example2));					// [1, 2]
//		System.out.println(Arrays.toString(example3));					// [0, 1]
//	}
}

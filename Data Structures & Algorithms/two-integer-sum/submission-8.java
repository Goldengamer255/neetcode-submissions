class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsList = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            
            // Check if the complement exists in the map
            if (numsList.containsKey(difference)) {
                return new int[] { numsList.get(difference), i };
            }
            
            // Store the current number and its index for future lookups
            numsList.put(nums[i], i);
        }
        
        // Fallback if no solution exists
        return new int[] {};
    }
}

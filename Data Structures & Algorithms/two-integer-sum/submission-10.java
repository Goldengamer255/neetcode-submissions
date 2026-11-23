class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (numMap.containsKey(difference)) {
                return new int [] {numMap.get(difference), i};
            }

            numMap.put(nums[i], i);
        }

        return new int [] {};
    }
}

// Final thoughts
// if we have the target we could use it to see if the complementary number which adds up with it to get the target exists
// we can use a hashmap for faster lookups
// We add the number and the index of what we have already seen and then for the current number we calculate the difference between that and the target number and check if we have it in the hashmap if we do we return that index along with the index we have for the current number if we dont have it in the hashmap then we add the current number plus index to the hashmap.
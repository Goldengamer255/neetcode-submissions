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

// Initial thoughts
// if we have the target we could use it to see if the complementary number which adds up with it to get the target exists
// we can use a hashmap for faster lookups
// so we could do difference = target - current num = num already in hash map
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) {
                return true;
            } else {
                numSet.add(nums[i]);
            }
        }
        return false;
    }
}

// Initial thoughts:
// 1. Create a hashset
// 2. Check if each number in array nums is in hashSet
// 3. If number in hashSet return true else add the number to the hashSet
// 4. if no number repeats return false
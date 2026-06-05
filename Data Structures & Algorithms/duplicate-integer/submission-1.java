class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSeen = new HashSet<>();
        for (int num:nums) {
            if (numsSeen.contains(num)) {
                return true;
            } else {
                numsSeen.add(num);
            }
        }
        return false;
    }
}
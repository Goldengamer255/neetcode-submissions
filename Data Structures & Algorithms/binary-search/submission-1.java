class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = nums[middlePosition];

            if (middleNumber == target) {
                return middlePosition;
            }

            if (target > middleNumber) {
                low = middlePosition + 1;
            }

            if (target < middleNumber) {
                high = middlePosition - 1;
            }
        }
        return -1;
    }
}

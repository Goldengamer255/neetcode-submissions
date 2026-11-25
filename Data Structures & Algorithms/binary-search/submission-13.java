class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int currentIndex = (start + end)/2;
            System.out.println(currentIndex);
            
            if (nums[currentIndex] == target) {
                return currentIndex;
            }

            if (target < nums[currentIndex]) {
                end = currentIndex - 1;
            }

            if (target > nums[currentIndex]) {
                start = currentIndex + 1;
            }
        }
        return -1;
    }
}


// Initial thoughts:
// We are given a sorted array in ascending order and we need to find the time complexity with O(logn)
// a standard for loop would be O(n) as we iterate over every element in array of size n so we instead use binary search with an O(logn) as not every element in the array needs to be searched
// we use a while loop while the start is less than the end and start in the middle if the current value equals target we stop and return the index
// if not we see if its greater or less than the current value and then search that section of the array until we find the target
// if target not found we return -1
class Solution {
    public int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }

            }

        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}

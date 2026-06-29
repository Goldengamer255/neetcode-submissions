class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> mapNum = new HashMap<>(); // initialise hashmap

        for (int i = 0; i < nums.length; i++) { // loop through num list
            Integer complementIndex = mapNum.get(nums[i]); // find index of the 2nd num needed to make target num
            if (complementIndex != null) { // if found then return current index and index of 2nd num
                return new int [] {complementIndex, i};
            }

            mapNum.put(target - nums[i], i); // if not found then put the difference(complement/2nd num) as key and current index as value
            // basically if difference was 7, then for example 7 at index 3 so if a num needed that compliment then it searches
            // the hashmap by key then gets index it needs


            }
            return nums;
        }
        
    }


class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

// Final thoughts:
// so here we basically set the left and right index
// we then use a while loop so one when the left index is less than the right index
// then while the charater at the left index is not a letter or digit then move to the next letter
// same for the opposite side on the right
// must always have the rule that left cant be more than right
// compare both charaters in lowercase if doesnt match return false if it does then continue
// the increment left by one and decrement right by one 
// if all passes return true
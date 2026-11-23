class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i); // for a string you do charAt for the char
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        char[] prepString = sb.toString().toCharArray();

        for (int i = 0; i < prepString.length; i++) {
            int j = prepString.length - i - 1;

            if (i == j) {
                break;
            }

            if (prepString[i] != prepString[j]) {
                return false;
            }
        } 

        return true;
    }
}


// Initial thoughts
// We could easily just reverse the string and compare but that takes O(n) space
// To use O(1) space we need to use a two pointer approach
// We loop through the array once with the start index i and the end index of array length minus i giving j and we can stop when both index are the same.
// We first can prep the stringbuilder with the isletterordigit
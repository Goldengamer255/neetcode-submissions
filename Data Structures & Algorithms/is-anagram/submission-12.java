class Solution {
    public boolean isAnagram(String s, String t) {
        // check if both strings are the same size
        if (s.length() != t.length()) {
            return false;
        }

        int [] counts = new int[26];

        for (int i = 0 ; i < s.length() ; i++) {
            counts[s.charAt(i) - 'a']++; // add 1 to the slot for each letter in each char space in counts e.g. a-a = 0 b-a = 1 and so on
        }

        for (int i = 0 ; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--; // the opposite subtract to counter the increase from s
        }

        for (int c : counts) {
            if (c != 0) {
                return false;
            }
        }

        return true;

    }
}

// Initial thoughts
// We need a O(n + m) time solution and O(1) space brute force would be O(n^2)
// create 2 Char arrays and use a frequency count approach to compare them for faster time complexity
// if the length are not the same then we can immediately return false
// make a loop comparing each char in each array use value of 
// return true if all are the same else return false
// gives an O(n) solution due to only one for loop
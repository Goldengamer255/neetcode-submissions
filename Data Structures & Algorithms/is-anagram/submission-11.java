class Solution {
    public boolean isAnagram(String s, String t) {
        // check if both strings are the same size
        if (s.length() != t.length()) {
            return false;
        }

        // create the char arrays
        char [] sChars = s.toCharArray();
        char [] tChars = t.toCharArray();

        // sort the char arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // for loop compare each char
        for (int i = 0; i < sChars.length ; i++) {
            if (Character.valueOf(sChars[i]) != Character.valueOf(tChars[i])) {
                return false;
            }
        }

        return true;

    }
}

// Initial thoughts
// We need a O(n + m) time solution and O(1) space brute force would be O(n^2)
// create 2 Char arrays and sort them
// if the length are not the same then we can immediately return false
// make a loop comparing each char in each array use value of 
// return true if all are the same else return false
// gives an O(n) solution due to only one for loop
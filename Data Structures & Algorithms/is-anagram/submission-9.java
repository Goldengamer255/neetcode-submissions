class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> charSet = new ArrayList<>();
        char [] sChars = s.toCharArray();
        char [] tChars = t.toCharArray();

        if (sChars.length != tChars.length) {
            return false;
        }

        for (int i = 0 ; i < s.length(); i++) {
            charSet.add(sChars[i]);
        }

        for (int i = 0; i < t.length(); i++) {
            if (charSet.isEmpty()) {
                return true;
            }

            if (charSet.contains(Character.valueOf(tChars[i]))) {
                charSet.remove(Character.valueOf(tChars[i])); // use Character.valueOf for the value of a character
            } else {
                return false;
            }
        }
    return true;
    }
}

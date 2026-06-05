class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c = s.charAt(i), d = s.charAt(j);
            if (!isAlphanumeric(c)) {
                i++;
                continue;
            }
            if (!isAlphanumeric(d)) {
                j--;
                continue;
            }

            if (c != d) return false;

            i++; j--;

        }
        return true;
    }

    private boolean isAlphanumeric (char c) {
        return Character.isLetter(c) || Character.isDigit(c);
       
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        String[] list_s = s.split("");
        String[] list_t = t.split("");

        Arrays.sort(list_s);
        Arrays.sort(list_t);

        for (int i = 0; i < list_s.length; i++) {
            if (!list_s[i].equals(list_t[i])) {
                return false;
            }
            }
        return true;
    }
}


class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sAlpha = new int[26];
        int[] tAlpha = new int[26];

        if (s.length() == 0 || t.length() == 0) {
            if (s.length() == 0 && t.length() == 0) {
                return true;
            }
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            sAlpha[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            tAlpha[t.charAt(i) - 97]++;
        }

        return Arrays.equals(sAlpha, tAlpha);
    }
}

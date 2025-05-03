class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letterCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
            letterCount[t.charAt(i) - 'a']--;
        }

        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
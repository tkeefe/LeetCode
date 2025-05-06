class Solution {
    public int reverseDegree(String s) {
        int reverse = 0;
        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i) - 'a';
            int reversePosition = 26 - position;
            reverse += reversePosition * (i + 1);
        }
        return reverse;
    }
}
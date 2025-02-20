class Solution {
    public boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;

        while (a < b) {
            while (a < b && !Character.isLetterOrDigit(s.charAt(a)))
                ++a;
            while (a < b && !Character.isLetterOrDigit(s.charAt(b)))
                --b;
            if (Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b)))
                return false;
            ++a;
            --b;
        }
        return true;
    }
}
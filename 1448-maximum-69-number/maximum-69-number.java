class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '6') {
                charArray[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(charArray));
    }
}
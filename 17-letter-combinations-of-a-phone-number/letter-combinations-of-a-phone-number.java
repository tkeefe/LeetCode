import java.util.ArrayList;
import java.util.List;

class Solution {
    private final String[] digitToLetters = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
     
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits.isEmpty()) {
            return combinations;
        }
        generateCombinations(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }

    private void generateCombinations(String digits, int index, StringBuilder current, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        String letters = digitToLetters[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generateCombinations(digits, index + 1, current, combinations);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
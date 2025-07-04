class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];

        for (char c : sentence.toCharArray()) {
            visited[c - 'a'] = true;
        }

        for (boolean isPresent : visited) {
            if (!isPresent) {
                return false;
            }
        }
        return true;
    }
}
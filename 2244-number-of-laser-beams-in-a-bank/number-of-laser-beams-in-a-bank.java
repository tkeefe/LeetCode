class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prev = 0;

        for (final String row : bank) {
            final int ones = (int) row.chars().filter(c -> c == '1').count();

            if (ones > 0) {
                ans += (long) prev * ones;
                prev = ones;
            }
        }
        return ans;
    }
}
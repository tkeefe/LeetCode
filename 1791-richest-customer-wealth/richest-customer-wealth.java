class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customerAccounts : accounts) {
            int currentWealth = 0;
            for (int accountBalance : customerAccounts) {
                currentWealth += accountBalance;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}
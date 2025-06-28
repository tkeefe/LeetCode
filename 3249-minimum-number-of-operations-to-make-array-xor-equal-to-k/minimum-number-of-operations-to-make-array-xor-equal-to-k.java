class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int difference = xor ^ k;

        return Integer.bitCount(difference);
    }
}
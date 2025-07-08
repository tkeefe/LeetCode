class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int occurrences = (i + 1) * (n - i);
            int odd = (occurrences + 1) / 2;
            total += arr[i] * odd;
        }
        return total;
    }
}
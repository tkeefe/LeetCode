class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;

        for (int change : gain) {
            current += change;
            max = Math.max(max, current);
        }

        return max;
    }
}
import java.util.Arrays;

class Solution {
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] % 2 == 0 ? 0 : 1;
        }
        Arrays.sort(result);
        return result;
    }
}
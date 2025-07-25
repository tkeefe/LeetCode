import java.util.Arrays;

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();
        return min2 - min1;
    }
}
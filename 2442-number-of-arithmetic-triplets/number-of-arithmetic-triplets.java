import java.util.HashSet;
import java.util.Set;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int count = 0;
        for (int num : nums) {
            if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
                count++;
            }
        }
        return count;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        int length = nums.length;

        for (int first = 0; first < length - 2 && nums[first] <= 0; ++first) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int second = first + 1;
            int third = length - 1;

            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];

                if (sum < 0) {
                    ++second;
                } else if (sum > 0) {
                    --third;
                } else {
                    triplets.add(List.of(nums[first], nums[second], nums[third]));
                    while (second < third && nums[second] == nums[second + 1]) {
                        ++second;
                    }
                    while (second < third && nums[third] == nums[third - 1]) {
                        --third;
                    }
                    ++second;
                    --third;
                }
            }
        }
        return triplets;
    }
}

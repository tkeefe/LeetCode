class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for (int num : nums) {
            if (a.contains(num)) {
                return true;
            }
            a.add(num);
        }
        return false;
    }
}
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for(int num : nums){
            if(uniqueSet.contains(num))
                resultSet.add(num);
                uniqueSet.add(num);
        }
        return resultSet;
    }
}
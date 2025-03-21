class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int l = 0;
        int r = n1;
        while (l <= r) {
            int p1 = (l + r) / 2;
            int p2 = (n1 + n2 + 1) / 2 - p1;
            int maxL1 = p1 == 0 ? Integer.MIN_VALUE : nums1[p1 - 1];
            int maxL2 = p2 == 0 ? Integer.MIN_VALUE : nums2[p2 - 1];
            int minR1 = p1 == n1 ? Integer.MAX_VALUE : nums1[p1];
            int minR2 = p2 == n2 ? Integer.MAX_VALUE : nums2[p2];
            if (maxL1 <= minR2 && maxL2 <= minR1) {
                return (n1 + n2) % 2 == 0 ? (double) (Math.max(maxL1, maxL2) + Math.min(minR1, minR2)) / 2 : Math.max(maxL1, maxL2);
            } else if (maxL1 > minR2) {
                r = p1 - 1;
            } else {
                l = p1 + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}
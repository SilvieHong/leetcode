//https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[idx];
            idx++;
        }
        Arrays.sort(nums1);
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(logn)
 */

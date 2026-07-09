/*
 * Link：https://leetcode.com/problems/two-sum/
 *
 * Note：
 * Use nested loops. The outer loop iterates through each element, and the inner loop checks the rest of the array to see if the sum of the current pair equals the target.
 *
 * Time Complexity：O(n^2)
 * Space Complexity：O(1)
 */
public class Problem_001_TwoSum{
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
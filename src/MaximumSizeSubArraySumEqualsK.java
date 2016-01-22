/**
 * Created by hazai on 21/01/16.
 */

/*Given an array nums and a target value k, find the maximum length of a subarray that sums to k.
If there isn't one, return 0 instead.

        Example 1:
        Given nums = [1, -1, 5, -2, 3], k = 3,
        return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

        Example 2:
        Given nums = [-2, -1, 2, 1], k = 1,
        return 2. (because the subarray [-1, 2] sums to 1 and is the longest)

        Follow Up:
        Can you do it in O(n) time?*/
public class MaximumSizeSubArraySumEqualsK {

    public static int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                temp += nums[j];
                count++;
                if (temp == k && ret < count)  {
                    ret = count;
                }
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        int [] first = {1, -1, 5, -2, 3};
        int [] second = {-2, -1, 2, 1};
        System.out.println(maxSubArrayLen(first, 3));
        System.out.println(maxSubArrayLen(second, 1));
    }
}

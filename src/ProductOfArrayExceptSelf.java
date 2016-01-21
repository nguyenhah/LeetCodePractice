/**
 * Created by hazai on 20/01/16.
 */

/*Given an array of n integers where n > 1, nums, return an array output such that output[i]
is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity?
(Note: The output array does not count as extra space for the purpose of space complexity analysis.)*/

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int [] ret = new int[nums.length];

        int left = 1;
        int right = 1;
        for (int x = 0; x < nums.length; x++) {
            ret[x] = left;
            left *= nums[x];
        }

        for (int y = nums.length -1 ; y >= 0; y--) {
            ret[y] = right * ret[y];
            right *= nums[y];
        }

        return ret;
    }

    public static void main(String[] args) {
        int [] nums = {4,3,5,7};
        for (int i: productExceptSelf(nums)) {
            System.out.println(i);
        }
    }
}

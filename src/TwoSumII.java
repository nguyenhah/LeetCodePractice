/**
 * Created by hazai on 19/01/16.
 */

/*Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that
they add up to the target, where index1 must be less than index2. Please note
that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.
        Input: numbers={2, 7, 11, 15}, target=9
        Output: index1=1, index2=2*/

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int [] ret = {-1, -1};
        if (numbers == null || numbers.length == 0){
            return ret;
        }
        int start = 0;
        int end = numbers.length -1;

        while (start < end){
            int sum = numbers[start] + numbers[end];
            if (sum == target){
                ret[0] = start + 1;
                ret[1] = end + 1;
                break;
            }
            else if (sum < target){
                start += 1;
            }
            else {
                end -= 1;
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        for (int i: twoSum(nums, 9)) {
            System.out.println(i);
        }
    }
}

/**
 * Created by hazai on 19/01/16.
 */

/*Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].

Understand the problem:
        A[0] <= A[1] >= A[2] <= A[3] >= A[4] <= A[5]
        So we could actually observe that there is pattern that
        A[even] <= A[odd],
        A[odd] >= A[even].

Therefore we could go through the array and check this condition does not hold, just swap.*/

public class WiggleSort {

    public static int[] wiggleSort(int[] nums){
        for (int i = 1; i < nums.length;i++) {
            if (i % 2 == 1 && nums[i] < nums[i - 1] ||
                    i % 2 == 0 && nums[i] > nums[i - 1]){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {3, 5, 2, 1, 6, 4};
        for (int i: wiggleSort(nums)){
            System.out.println(i);
        }
    }
}

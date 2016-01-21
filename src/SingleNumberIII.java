import java.util.HashSet;

/**
 * Created by hazai on 20/01/16.
 */

/*Given an array of numbers nums, in which exactly two elements appear only once and all the other
elements appear exactly twice. Find the two elements that appear only once.

        For example:

        Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

        Note:
        The order of the result is not important. So in the above example, [5, 3] is also correct.
        Your algorithm should run in linear runtime complexity. Could you implement it using only
        constant space complexity?*/

public class SingleNumberIII {

    public static int[] singleNumber(int[] nums) {

        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < nums.length;i++){
            if (hash.contains(nums[i])){
                hash.remove(nums[i]);
            }
            else {
                hash.add(nums[i]);
            }
        }
        int [] ret = new int[hash.size()];
        int count = 0;
        for (int h: hash){
            ret[count] = h;
            count++;
        }
        return ret;
    }

    public static int[] singleNumberBitWise(int[] nums) {
        int mask = 1;
        int combined = 0;
        int [] ret = new int[2];
        int first = 0;
        int second = 0;
        for (int i: nums) {
            combined ^= i;
        }
        while ((combined & mask) == 0){
            mask = mask << 1;
        }
        for (int x : nums){
            if ((x & mask) == 0) {
                first ^= x;
            }
            else {
                second ^= x;
            }
        }
        ret[0] = first;
        ret[1] = second;

        return ret;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 1, 3, 2, 5};
        for (int i: singleNumber(nums)) {
            System.out.println(i);
        }
        System.out.println();
        for (int i: singleNumberBitWise(nums)) {
            System.out.println(i);
        }
    }
}

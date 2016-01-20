import java.util.HashSet;
import java.util.Set;

/**
 * Created by hazai on 19/01/16.
 */

/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int n: nums){
            result ^= n;
        }
        return result;
    }

    public static int singleNumberVersion2(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }
            else {
                set.add(i);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,3,3,4};

        System.out.println(singleNumber(nums));
        System.out.println(singleNumberVersion2(nums));
    }
}

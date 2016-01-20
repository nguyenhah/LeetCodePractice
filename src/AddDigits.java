/**
 * Created by hazai on 19/01/16.
 */

/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?*/

public class AddDigits {

    public int addDigits(int num) {
        while (num > 9){
            int sum = 0;
            while (num >= 1){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static int addDigitsVersion2(int num)
    {
        //For number that from 0 to 9, the answer is themselves
        //For number that is divisible by 9, the answer is 9
        //Otherwise, the answer is the reminder after divided by 9
        return num>9?(num%9==0?9:num%9):num;
    }

    public static void main(String[] args) {
        AddDigits add = new AddDigits();
        System.out.println(add.addDigits(38));
        System.out.println(addDigitsVersion2(38));
    }
}

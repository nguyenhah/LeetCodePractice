import java.util.List;

/**
 * Created by hazai on 21/01/16.
 */

/*Given two 1d vectors, implement an iterator to return their elements alternately.
        For example, given two 1d vectors:
        v1 = [1, 2]
        v2 = [3, 4, 5, 6]
        By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1, 3, 2, 4, 5, 6].
        Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?*/

public class ZigzagIterator {
    private int [] v1;
    private int [] v2;
    private int i;
    private int j;
    private int turn;

    public ZigzagIterator(int [] v1, int [] v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.i = 0;
        this.j = 0;
        this.turn = 0;
    }

    public int next(){
        int result = 0;
        if (i >= v1.length) {
            result = v2[j];
            j++;
        } else if (j >= v2.length){
            result = v1[i];
            i++;
        } else {
            if (turn == 0) {
                result = v1[i];
                i++;
                turn = 1;
            }
            else {
                result = v2[j];
                j++;
                turn = 0;
            }
        }
        return result;
    }
    public boolean hasNext() {
        return i < v1.length || j < v2.length;
    }

    public static void main(String[] args) {
        int [] v1 = {-1, -2, -3, -4};
        int [] v2 = {3, 4, 5, 6};
        ZigzagIterator z = new ZigzagIterator(v1, v2);
        while (z.hasNext()) {
            System.out.println(z.next());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hazai on 19/01/16.
 */

/*You are playing the following Flip Game with your friend: Given a string that contains only these
two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--".
The game ends when a person can no longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.

For example, given s = "++++", after one move, it may become one of the following states:

        [
        "--++",
        "+--+",
        "++--"
        ]*/

public class FlipGame {

    public static List<String> generatePossibleNextMoves(String s){
        List<String> result = new ArrayList<>();

        for (int i = 1; i < s.length(); i++){
            char [] charArray = s.toCharArray();
            if (charArray[i] == '+' && charArray[i -1] == '+'){
                    charArray[i] = '-';
                    charArray[i-1] = '-';
            }
            result.add(new String(charArray));
        }

        return result;
    }

    public static void main(String[] args) {
        for (String s: generatePossibleNextMoves("++++")){
            System.out.println(s);
        }
    }
}

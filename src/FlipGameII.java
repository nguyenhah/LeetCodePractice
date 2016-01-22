/**
 * Created by hazai on 21/01/16.
 */

/*You are playing the following Flip Game with your friend: Given a string that contains
only these two characters: + and -, you and your friend take turns to flip two consecutive
"++" into "--". The game ends when a person can no longer make a move and therefore the other
person will be the winner.

Write a function to determine if the starting player can guarantee a win.
For example, given s = "++++", return true. The starting player can
guarantee a win by flipping the middle "++" to become "+--+".*/

public class FlipGameII {

    public static boolean canWin(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        char [] board = s.toCharArray();
        return canWinHelper(board);
    }

    private static boolean canWinHelper(char[] board) {
        for (int i = 0; i < board.length -1; i++) {
            if (board[i] == '+' && board[i + 1] == '+') {
                board[i] = '-';
                board[i+1] = '-';

                boolean win = !canWinHelper(board);

                board[i] = '+';
                board[i+1] = '+';
                if (win) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canWin("++++"));
    }
}

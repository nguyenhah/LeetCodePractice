/**
 * Created by hazai on 20/01/16.
 */

/*Given a list of words and two words word1 and word2, return the shortest distance
        between these two words in the list.

        For example,
        Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
        Given word1 = “coding”, word2 = “practice”, return 3.
        Given word1 = "makes", word2 = "coding", return 1.
        Note:
        You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.*/

public class ShortestWordDistance {

    public static int shortestDistance(String[] words, String word1, String word2) {
        int first = -1;
        int second = -1;
        int dif = 0;

        for(int i = 0; i < words.length; i++){
            if (words[i].equals(word1)){
                first = i;
            }
            else if (words[i].equals(word2)){
                second = i;
            }
            if (first >= 0 && second >= 0 ) {
                if (Math.abs(first - second) > dif) {
                    dif = first - second;
                }
            }
        }
        return dif;
    }

    public static void main(String[] args) {
        String [] arr = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(arr, "coding", "practice"));
        System.out.println(shortestDistance(arr, "makes", "coding"));
    }
}

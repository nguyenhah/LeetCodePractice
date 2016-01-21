/**
 * Created by hazai on 20/01/16.
 */

/*Given a list of words and two words word1 and word2, return the shortest distance
between these two words in the list.

        word1 and word2 may be the same and they represent two individual words in the list.

        For example,
        Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
        Given word1 = “makes”, word2 = “coding”, return 1.
        Given word1 = "makes", word2 = "makes", return 3.

        Note:
        You may assume word1 and word2 are both in the list.Understand the problem:*/

public class ShortestWordDistanceIII {

    public static int shortestWordDistanceIII(String[] words, String word1, String word2) {
        int posA = -1;
        int posB = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.equals(word1)) {
                posA = i;
            } else if (word.equals(word2)) {
                posB = i;
            }

            if (posA != -1 && posB != -1 && posA != posB) {
                minDistance = Math.min(minDistance, Math.abs(posA - posB));
            }

            if (word1.equals(word2)) {
                posB = posA;
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        String [] arr = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestWordDistanceIII(arr, "makes", "makes"));
        System.out.println(shortestWordDistanceIII(arr, "makes", "coding"));
    }
}

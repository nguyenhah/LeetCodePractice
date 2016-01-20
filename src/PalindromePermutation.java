import java.util.HashMap;
import java.util.HashSet;


/**
 * Created by hazai on 19/01/16.
 */

/*Given a string, determine if a permutation of the string could form a palindrome.*/

public class PalindromePermutation  {

    public static boolean canPermutePalindrome(String s){
        char [] arrayChar = s.toCharArray();
        HashMap<Character, Integer> hashSet = new HashMap<>();

        for(char c: arrayChar){
            if (!hashSet.containsKey(c)){
                hashSet.put(c, 1);
            }
            else {
                hashSet.put(c, hashSet.get(c) + 1);
            }
        }
        int odd = 0;
        for(char d : hashSet.keySet()){
            if ((hashSet.get(d) % 2) == 1){
                odd++;
            }
            if (odd > 1){
                return false;
            }
        }
        return true;
    }

    public static boolean canPermutePalindromeVersion2(String s) {
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            if (!hash.contains(s.charAt(i))){
                hash.add(s.charAt(i));
            }
            else {
                hash.remove(s.charAt(i));
            }
        }
        return hash.size() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("dadaad"));
        System.out.println(canPermutePalindrome("asdf"));
        System.out.println(canPermutePalindrome("hehe"));

        System.out.println(canPermutePalindromeVersion2("dadaad"));
        System.out.println(canPermutePalindromeVersion2("asdf"));
        System.out.println(canPermutePalindromeVersion2("hehe"));
    }
}

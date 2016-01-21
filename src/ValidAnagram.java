/**
 * Created by hazai on 20/01/16.
 */

/*Given two strings s and t, write a function to determine if t is an anagram of s.

        For example,
        s = "anagram", t = "nagaram", return true.
        s = "rat", t = "car", return false.

        Note:
        You may assume the string contains only lowercase alphabets.*/

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int [] arr = new int[26];

        for (int i = 0; i < s.length();i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < s.length();j++) {
            arr[t.charAt(j) - 'a']--;
            if (arr[t.charAt(j) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}

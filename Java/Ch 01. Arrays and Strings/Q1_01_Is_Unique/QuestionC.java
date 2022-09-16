package Q1_01_Is_Unique;

import java.util.HashSet;
import java.util.Set;

public class QuestionC {
    /* AK version */
    public static boolean isUniqueChars(String str) {
        Set char_set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (char_set.contains(str.charAt(i))) {
                return false;
            }
            else {
                char_set.add(str.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle", "abcad"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }
}


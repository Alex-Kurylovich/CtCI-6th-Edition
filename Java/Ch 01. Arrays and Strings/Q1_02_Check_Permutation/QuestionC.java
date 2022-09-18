package Q1_02_Check_Permutation;

import java.util.HashMap;

public class QuestionC {
    /* AK version */
    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Permutations must be same length
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = hm.get(s.charAt(i));
            if (count == null) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), ++count);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Integer count = hm.get(t.charAt(i));
            if (count == 0) {
                return false;
            } else {
                hm.put(t.charAt(i), --count);
            }
        }
        return true;
    }

        public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}

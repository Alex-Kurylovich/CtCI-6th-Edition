package Q1_04_Palindrome_Permutation;

public class QuestionD {

    public static boolean isPalindrome(String phrase) {
        String phraseNoSp = phrase.replaceAll("\\s", "");
        return phraseNoSp.compareToIgnoreCase((new StringBuilder(phraseNoSp)).reverse().toString()) == 0;
    }

    public static void main(String[] args) {
        String[] strings = {"Rats live on no evil star",
                "A man a plan a canal panama",
                "Lleve",
                "Tacotac",
                "asda",
                "abtctcba",
                "abctxxxtcba"
        };
        for (String s : strings) {
            System.out.println(s);
            System.out.println("Palindrome: " + isPalindrome(s));
            boolean a = QuestionA.isPermutationOfPalindrome(s);
            boolean b = QuestionB.isPermutationOfPalindrome(s);
            boolean c = QuestionC.isPermutationOfPalindrome(s);
            if (a == b && b == c) {
                System.out.println("Agree: " + a);
            } else {
                System.out.println("Disagree: " + a + ", " + b + ", " + c);
            }
            System.out.println();
        }
    }
}

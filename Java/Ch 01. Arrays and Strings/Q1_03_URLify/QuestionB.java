package Q1_03_URLify;

public class QuestionB {
    /* AK version */
    public static String replaceSpaces(String str) {
        str = str.trim();
        StringBuilder b =  new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                b.append('%');
                b.append('2');
                b.append('0');
            } else {
                b.append(str.charAt(i));
            }
        }
        return b.toString();
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        String urlStr = replaceSpaces(str);
        System.out.println("\"" + urlStr + "\"");

        str = "Mr John Smith";
        urlStr = replaceSpaces(str);
        System.out.println("\"" + urlStr + "\"");
    }
}

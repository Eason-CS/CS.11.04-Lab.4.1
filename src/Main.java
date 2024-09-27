public class Main {

    public static void main(String[] args) {
        System.out.println(parenthesesCheck("()"));
        System.out.println(parenthesesCheck(")(()))")); //
        System.out.println(parenthesesCheck("("));
        System.out.println(parenthesesCheck("(())((()())())"));

        System.out.println(reverseInteger(1234));
        System.out.println(reverseInteger(2468));

        System.out.println(encryptThis("Hello good day"));
        System.out.println(encryptThis("Ready set go"));
    }

    public static boolean parenthesesCheck(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static String reverseInteger(int num) {
        return new StringBuilder(Integer.toString(num)).reverse().toString();
    }

    public static String encryptThis(String message) {
        StringBuilder result = new StringBuilder();
        for (String word : message.split(" ")) {
            if (result.length() > 0) {
                result.append(" ");
            }
            int wordLength = word.length();
            result.append((int) word.charAt(0));
            if (wordLength > 1) {
                result.append(word.charAt(wordLength - 1));
                result.append(word, 2, wordLength - 1);
                result.append(word.charAt(1));
            }
        }
        return result.toString();
    }
}

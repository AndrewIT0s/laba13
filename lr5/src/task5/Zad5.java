package task5;

public class Zad5 {
    public static String[] splitInput(String input) {
        return input.split("\\s+");
    }
    public static void checkAndPrintPalindrome(String word) {
        if (word.matches("\\d+")) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                System.out.println(word + " является палиндромом.");
            } else {
                System.out.println(word + " не является палиндромом.");
            }
        }
    }
}

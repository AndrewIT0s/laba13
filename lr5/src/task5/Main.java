package task5;

public class Main {
    public static void main(String[] args) {
        String input = "Если есть хвосты по дз, начните с 1 несданного задания. 123 324 111 4554";
        String[] words = Zad5.splitInput(input);
        for (String word : words) {
            Zad5.checkAndPrintPalindrome(word);
        }
    }
}

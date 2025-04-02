public class Zad2 {
    public static void main(String[] args) {
        String[] examples = {"string", "code", "Practice"};
        for (int i = 0; i < examples.length; i++) {
            System.out.println("Средние символы: " + getMiddle(examples[i]));
        }
    }

    public static String getMiddle(String str) {
        int length=str.length();
        if (length % 2 == 0) {
            int middle = str.length() / 2;
            return str.charAt(middle - 1) + "" + str.charAt(middle);
        }
        return str;
    }
}



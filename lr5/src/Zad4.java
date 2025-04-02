public class Zad4 {
    public static void main(String[] args) {
        String input = "ааа ббб ёёё ззз ййй ААА БББ ЁЁЁ ЗЗЗ ЙЙЙ";
        String[] words = input.split(" ");
        String pattern = "^[а-яА-ЯёЁ]+$";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.matches(pattern)) {
                System.out.println(word);
            }
        }
    }
}

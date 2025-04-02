package task6;

public class Replace {
    public static void main(String[] args) {
        String input = "Object-oriented programming is a programming language model organized around objects rather than and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String result = replaceAllOccurrences(input, "object-oriented programming", "OOP");
        System.out.println(result);
    }
    public static String replaceAllOccurrences(String input, String target, String replacement) {
        String lowerInput = input.toLowerCase();
        String lowerTarget = target.toLowerCase();
        int index = 0;

        StringBuilder result = new StringBuilder(input);

        while (true) {
            index = lowerInput.indexOf(lowerTarget, index);
            if (index == -1) {
                break;
            }
            result.replace(index, index + target.length(), replacement);

            lowerInput = lowerInput.substring(0, index) + replacement.toLowerCase() + lowerInput.substring(index + target.length());
            index += replacement.length();
        }
        return result.toString();
    }
}

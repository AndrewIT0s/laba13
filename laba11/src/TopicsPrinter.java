import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.MissingResourceException;

public class TopicsPrinter {

    public static void printTopics(Locale locale) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("task1", locale);
            Set<String> keys = bundle.keySet();
            System.out.println("Темы изучения Java (" + locale.getDisplayLanguage() + "):");
            for (String key : keys) {
                String topic = bundle.getString(key);
                System.out.println(key + ": " + topic);
            }
        } catch (MissingResourceException e) {
            System.err.println("Файл ресурсов для локали " + locale + " не найден!");
        }
    }
    public static void main(String[] args) {
        printTopics(new Locale("ru", "RU"));

        System.out.println();

        printTopics(Locale.US);
    }
}
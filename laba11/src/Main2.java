import java.util.Locale;
public class Main2 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Андрей Андрей", 100321),
                new Employee("Вася Пупкин", 60000),
                new Employee("Дедов Генадий", 55000),
                new Employee("Маврин Петя", 70000.00)
        };
        System.out.println("Отчет на английском (USD):");
        FullReport.generateReport   (employees, Locale.ENGLISH);
        System.out.println("--------------------------------------");
        System.out.println("\nОтчет на русском:");
        FullReport.generateReport(employees, new Locale("ru"));
    }
}
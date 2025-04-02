package task3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("ФИО\t\t\t\t" + "Зарплата");
        for (Employee employee : employees) {
            System.out.printf("%-15s %10.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}

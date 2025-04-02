package task3;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Бойко Андрей ", 6000.510),
                new Employee("Ершов Вова", 7000.75),
                new Employee("Волчок Кирилл", 65000.00),
                new Employee("Андриевич Артем", 85000.20)
        };
        Report.generateReport(employees);
    }
}
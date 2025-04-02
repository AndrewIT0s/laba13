
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StudentManager manager = new StudentManager();
            List<Integer> grades1 = List.of(4, 3, 5, 2, 4);
            List<Integer> grades2 = List.of(2, 2, 3, 2, 2);
            List<Integer> grades3 = List.of(5, 4, 4, 4, 5);
            Student student1 = new Student("Петя", "Группа А", -1, grades1);
            Student student2 = new Student("Анна Смирнова", "Группа Б", 2, grades2);
            Student student3 = new Student("Мария Петрова", "Группа В", 3, grades3);
            manager.addStudent(student1);
            manager.addStudent(student2);
            manager.addStudent(student3);

            System.out.println("Заявленный список студентов:");
            manager.printStudents(manager.students, 1);
            manager.printStudents(manager.students, 2);
            manager.printStudents(manager.students, 3);

            manager.updateStudents();

            System.out.println("\nОбновлённый список студентов:");
            manager.printStudents(manager.students, 1);
            manager.printStudents(manager.students, 2);
            manager.printStudents(manager.students, 3);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

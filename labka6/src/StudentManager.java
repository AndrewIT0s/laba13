
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {

    List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Студент не может быть null.");
        }
        students.add(student);
    }
    public void updateStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            try {
                if (student.getAverageGrade() < 3) {
                    iterator.remove();
                } else {
                    student.setCourse(student.getCourse() + 1);
                }
            } catch (ArithmeticException e) {
                System.out.println("Ошибка при обновлении студента " + student.getName() + ": " + e.getMessage());
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        if (course <= 0) {
            throw new IllegalArgumentException("Курс должен быть положительным числом.");
        }

        System.out.println("Студенты на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

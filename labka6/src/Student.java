
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя студента не может быть пустым.");
        }
        if ( group.isEmpty()) {
            throw new IllegalArgumentException("Группа не может быть пустой.");
        }
        if (course <= 0) {
            throw new IllegalArgumentException("Курс должен быть положительным числом.");
        }
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Список оценок не может быть пустым.");
        }

        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course <= 0) {
            throw new IllegalArgumentException("Курс должен быть положительным числом.");
        }
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if ( grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Студент{" + "имя='" + name + '\'' + ", группа='" + group + '\'' + ", курс=" + course + ", ступень=" + grades + '}';
    }
}

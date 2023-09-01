import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(3254, "Marco", "Verdi", 22 / 12 / 1998);
        Student student2 = new Student(6474, "Luca", "Rossi", 31 / 12 / 1995);
        Student student3 = new Student(7958, "Giuseppe", "Brambilla", 10 / 12 / 1994);
        Student student4 = new Student(2647, "Simone", "Cascino", 15 / 12 / 1996);

        Professor professor1 = new Professor(4665, "Franco", "Costa", "Mathematics");
        Professor professor2 = new Professor(5647, "Luca", "Romano", "English");

        Professor.assignGrade(student1, 30);
        Professor.assignGrade(student2, 29);
        Professor.assignGrade(student3, 19);
        Professor.assignGrade(student4, 14);

        Student[] students = new Student[]{
                student1,
                student2,
                student3,
                student4
        };

        Professor[] professors = new Professor[]{
                professor1,
                professor2
        };

        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println("Student excellent:" + "\n" + student.getName() + "\n" + student.getSurname());
            }
        }

        Student studentWithTheHighestAverage = students[0];
        System.out.println("student with the highest average: " + "\n" + studentWithTheHighestAverage.getName() + "\n" + studentWithTheHighestAverage.getSurname());
    }
}
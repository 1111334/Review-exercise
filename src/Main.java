import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(3254, "Marco", "Verdi", new Date(1998, Calendar.DECEMBER, 14));
        Student student2 = new Student(6474, "Luca", "Rossi", new Date(2001, Calendar.NOVEMBER, 24));
        Student student3 = new Student(7958, "Giuseppe", "Brambilla", new Date(1999, Calendar.APRIL, 18));
        Student student4 = new Student(2647, "Simone", "Cascino", new Date(2001, Calendar.SEPTEMBER, 12));

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

        Student bestStudent = null; // Inizializziamo lo studente migliore come null

        for (Student student : students) {
            if (student.isExcellent()) {
                bestStudent = student;
                break; // Esci dal ciclo quando trovi il primo studente eccellente (media >= 28)
            }
        }

        if (bestStudent != null) {
            System.out.println("Best student:\n" + bestStudent.getName() + "\n" + bestStudent.getSurname());
        }
    }
}
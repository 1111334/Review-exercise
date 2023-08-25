import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> votiStudente1 = new ArrayList<>();
        votiStudente1.add(20);
        votiStudente1.add(18);

        Student studente1 = new Student(1, "Mario", "Rossi", 1 / 2000, votiStudente1);
        Student studente2 = new Student(2, "Luigi", "Bianchi", 15 / 5 / 2001);
        Student studente3 = new Student(3, "Anna", "Verdi", 1 / 1999);
        Student studente4 = new Student(4, "Laura", "Neri", 5 / 3 / 2002);

        new Professor(101, "Prof", "Ingegnere", "Matematica");
        new Professor(102, "Prof", "Scienziato", "Fisica");

        Professor.assignGrade(studente1, 22);
        Professor.assignGrade(studente2, 16);
        Professor.assignGrade(studente3, 19);
        Professor.assignGrade(studente4, 14);

        double sogliaEccellenza = 18.0;
        System.out.print("Studenti eccellenti: ");
        if (studente1.isExcellent(sogliaEccellenza)) {
            System.out.println(studente1.getName() + " " + studente1.getSurname());

        } else if (studente2.isExcellent(sogliaEccellenza)) {
            System.out.println(studente2.getName() + " " + studente2.getSurname());

        } else if (studente3.isExcellent(sogliaEccellenza)) {
            System.out.println(studente3.getName() + " " + studente3.getSurname());

        } else if (studente4.isExcellent(sogliaEccellenza)) {
            System.out.println(studente4.getName() + " " + studente4.getSurname());
        }

        // Trovare lo studente con la media dei voti più alta
        Student[] studenti = {studente1, studente2, studente3, studente4};
        Student studenteConMediaPiuAlta = studenti[0];
        for (int i = 1; i < studenti.length; i++) {
            if (studenti[i].calculateGradeAverage() > studenteConMediaPiuAlta.calculateGradeAverage()) {
                studenteConMediaPiuAlta = studenti[i];
            }
        }
        System.out.println("Studente con la media più alta: " + studenteConMediaPiuAlta.getName() + " " + studenteConMediaPiuAlta.getSurname());
    }

}



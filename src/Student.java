import java.util.ArrayList;
import java.util.List;

public class Student {
    private int codeStudent;
    private String name;
    private String surname;
    private int dateOfBirth;
    private ArrayList<Integer> elencoVoti;

    public Student(int codeStudent, String name, String surname, int dateOfBirth, ArrayList<Integer> elencoVoti) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.elencoVoti = elencoVoti;
    }

    public Student(int codeStudent, String name, String surname, int dateOfBirth) {
        this(codeStudent, name, surname, dateOfBirth, new ArrayList<>());
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Integer> getElencoVoti(int voto) {
        return elencoVoti;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setElencoVoti(ArrayList<Integer> elencoVoti) {
        this.elencoVoti = elencoVoti;
    }

    public double calculateGradeAverage() {
        if (elencoVoti.isEmpty()) {
           return 0.0;
        }

        double sum = 0;
        for (int voto : elencoVoti) {
            sum += voto;
        }
        return sum / elencoVoti.size();
    }

    public boolean isExcellent(double soglia) {
        return calculateGradeAverage() >= soglia;
    }
}

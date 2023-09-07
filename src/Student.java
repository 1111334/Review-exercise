import java.util.ArrayList;
import java.util.Date;

public class Student {
    private long studentId;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private ArrayList<Integer> gradeList;

    public Student(long studentId, String name, String surname, Date dateOfBirth, ArrayList<Integer> gradeList) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gradeList = gradeList;
    }

    public Student(long studentId, String name, String surname, Date dateOfBirth) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gradeList = new ArrayList<Integer>();
    }


    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Integer> getGradeList() {
        return gradeList;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGradeList(ArrayList<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    public double calculateGradeAverage() {
        if (gradeList.isEmpty()) {
            return 0.0;
        }
        double sum = 0;

        for (double voto : gradeList) {
            sum += voto;
        }
        return sum / gradeList.size();
    }

    public boolean isExcellent() {
        if (calculateGradeAverage() >= 28) {
            return true;
        }
        return false;
    }
}

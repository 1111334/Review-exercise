public class Professor {
    private long professorId;
    private String name;
    private String surname;
    private String matter;

    public Professor(long professorId, String name, String surname, String matter) {
        this.professorId = professorId;
        this.name = name;
        this.surname = surname;
        this.matter = matter;
    }

    public Professor(long professorId, String name, String surname) {
        this.professorId = professorId;
        this.name = name;
        this.surname = surname;
        this.matter = "";
    }

    public long getProfessorId() {
        return professorId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMatter() {
        return matter;
    }

    public void setProfessorId(long professorId) {
        this.professorId = professorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public static void assignGrade(Student student, int grade) {
        if (grade >= 18) {
            student.getGradeList().add(grade);
        } else {
            System.out.println("hai fallito");
        }
    }
}

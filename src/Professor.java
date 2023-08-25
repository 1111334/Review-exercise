public class Professor {
    private long idProfessore;
    private String name;
    private String surname;
    private String JavaDev;


    public Professor(long idProfessore, String name, String surname, String JavaDev) {
        this.idProfessore = idProfessore;
        this.name = name;
        this.surname = surname;
        this.JavaDev = JavaDev;
    }

    public Professor(int idProfessore, String nome, String cognome) {
        this(idProfessore, nome, cognome, "");
    }

    public long getIdProfessore() {
        return idProfessore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJavaDev() {
        return JavaDev;
    }

    public void setIdProfessore(long idProfessore) {
        this.idProfessore = idProfessore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setJavaDev(String javaDev) {
        JavaDev = javaDev;
    }

    public static void assignGrade(Student student, int voto) {
        if (voto >= 18) {
            student.getElencoVoti(voto);

        } else {
            System.out.println("Voto troppo basso per essere assegnato.");
        }

    }
}

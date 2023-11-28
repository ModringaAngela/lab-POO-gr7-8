package lab8.clonable;

public class StudentNonClonable {

    private String nume; // non-mutabil
    private Masina masina; // mutabil

    public StudentNonClonable(String nume, Masina masina) {
        this.nume = nume;
        this.masina = masina;
    }
    public StudentNonClonable clone() throws CloneNotSupportedException {
        StudentNonClonable c = (StudentNonClonable)super.clone(); // clona de suprafata - shallow copy
        c.masina = masina.clone(); // clona de profunzime - deep copy - se apeleaza clone pentru variabilele instanta mutabile!!!
        return c;
    }
}

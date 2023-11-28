package lab8.comparable;

public class Persoana2 implements Comparable<Persoana2> {
    private int varsta;
    private String nume;

    public Persoana2(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return nume + "(" + varsta + ")";
    }

    @Override
    public int compareTo(Persoana2 persoana) {
        int rezDupaNume = nume.compareTo(persoana.nume); // ca sa compari folosindu-te de obiecte, apelezi compareTo pe obiectele respective
        if (rezDupaNume == 0) {
            return varsta - persoana.varsta; //ca sa compari folosindu-te de primitive, doar faci diferenta dintre ele
        }

        return rezDupaNume;
    }
}

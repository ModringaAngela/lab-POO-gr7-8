package lab8.comparable;

public class Persoana3 {

    private int varsta;
    private String nume;

    public Persoana3(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public String toString() {
        return nume + "(" + varsta + ")";
    }
}

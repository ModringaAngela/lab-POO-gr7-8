package lab8.comparable;

public class Persoana implements Comparable {
    private int varsta;
    private String nume;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return nume + "(" + varsta + ")";
    }


//	@Override
//	public int compareTo(Object o) {
//		Persoana p = (Persoana)o;
//	    return nume.compareTo(p.nume); // alfabetic dupa nume
//	}

    /*
    Daca vrem sa comparam luand in calcul mai multe atribute, trebuie sa le definim prioritatea
    In cazul asta, numele e mai prioritar decat varsta

        <0 -> obiectul asta e MAI MIC decat cel primit ca parametru
        0 -> egale
        >0 -> obiectul asta e MAI MARE decat cel primit ca parametru

     */
    @Override
    public int compareTo(Object o) {
        Persoana p = (Persoana) o;
        int rezDupaNume = nume.compareTo(p.nume); // ca sa compari folosindu-te de obiecte, apelezi compareTo pe obiectele respective
        if (rezDupaNume == 0) {
            return varsta - p.varsta; //ca sa compari folosindu-te de primitive, doar faci diferenta dintre ele
        }

        return rezDupaNume;
    }

}

package pregatire.zoo.animals;

public abstract class Animal {
    private String id;
    private int anulNasterii;
    private float nrKgHrana;
    private boolean areHrana; //neinitializat, ptc valoarea default e false

    public void setNrKgHrana(float nrKgHrana) {
        this.nrKgHrana = nrKgHrana;
    }

    public void setAreHrana(boolean areHrana){
        this.areHrana = areHrana;
    }

    public boolean areHrana(){ // la variabilele boolean nu se recomanda sa avem get in nume. numele areHrana sugereaza o valoare ce poate fi true sau false
        return areHrana;
    }

    public float getNrKgHrana() {
        return nrKgHrana;
    }

    public Animal(String id, int anulNasterii) {
        this.id = id;
        this.anulNasterii = anulNasterii;
    }

    public abstract void primesteHrana() throws Exception;

   public abstract void mananca(float nrKg) throws Exception;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", anulNasterii=" + anulNasterii +
                ", nrKgHrana=" + nrKgHrana +
                ", areHrana=" + areHrana +
                '}';
    }
}

package pregatire.zoo.animals;

import pregatire.zoo.animals.Animal;

public class Leu extends Animal {
    static final int NR_KG_HRANA_DEFAULT = 2;
    static final int NR_MAX_KG_HRANA = 3;
    static final float PROCENT = 0.1f;

    private int masa;

    public Leu(String id, int anulNasterii, int masa) {
        super(id, anulNasterii);
        this.masa = masa;
    }

    @Override
    public void primesteHrana() throws Exception {
        float hranaNoua = NR_KG_HRANA_DEFAULT + PROCENT * masa / 100;
        //sa adaugam la numarul deja existent
        float total = hranaNoua + getNrKgHrana();
        if (total > NR_MAX_KG_HRANA) {
            throw new Exception("Nu poate avea mai mult");
        }
        setNrKgHrana(total);
        if (total > 0) {
            setAreHrana(true);
        }
    }

    @Override
    public void mananca(float nrKg) throws Exception {
        float newKg = getNrKgHrana() - nrKg;
        if (newKg < 0) {
            throw new Exception("Leul" + getId() + "nu poate manca mai mult decat are");
        }

        if (nrKg == 0) {
            setAreHrana(false);
        }
        setNrKgHrana(newKg);
    }

    @Override
    public String toString() {
        return "Leu{" + super.toString() + ", masa=" + masa + "} ";
    }
}

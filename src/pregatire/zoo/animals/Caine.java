package pregatire.zoo.animals;

import pregatire.zoo.animals.Animal;

/*
completati implementarea
 */
public class Caine extends Animal {
    static final float NR_KG_HRANA_DEFAULT = 0.5f;
    static final float NR_KG_HRANA_JOACA = 0.1f;
    static final int NR_MAX_KG_HRANA = 1;
    private String rasa;

    public Caine(String id, int anulNasterii, String rasa) {
        super(id, anulNasterii);
        this.rasa = rasa;
    }

    @Override
    public void primesteHrana() throws Exception {
        cresteKgHrana(NR_KG_HRANA_DEFAULT);
    }

    public void seJoaca() throws Exception {
        cresteKgHrana(NR_KG_HRANA_JOACA);
    }

    @Override
    public void mananca(float nrKg) throws Exception {
        float nrKgNew = getNrKgHrana() - nrKg;
        if (nrKgNew < 0) {
            throw new Exception("Cainele" + getId() + "nu poate manca mai mult decat are");
        }
        if (nrKg == 0) {
            setAreHrana(false);
        }
        setNrKgHrana(nrKgNew);
    }

    private void cresteKgHrana(float nrKg) throws Exception {
        float nrNewKg = getNrKgHrana() + nrKg;
        if (nrNewKg > NR_MAX_KG_HRANA) {
            throw new Exception("Nu poate avea mai mult decat maxim");
        }
        setNrKgHrana(nrNewKg);
        if (nrNewKg > 0) {
            setAreHrana(true);
        }
    }
}

package pregatire.zoo.animals;

import pregatire.zoo.animals.Animal;

/*
completati implementarea
 */
public class Pisica extends Animal {
    static final float NR_KG_HRANA_DEFAULT = 0.3F;
    private String culoare;

    public Pisica(String id, int anulNasterii, String culoare) {
        super(id, anulNasterii);
        this.culoare = culoare;
    }

    @Override
    public void primesteHrana() throws Exception {

    }

    @Override
    public void mananca(float nrKg) throws Exception {

    }
}

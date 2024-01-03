package pregatire.zoo.exception;

public class AnimalNotFoundException extends Exception{

    private String animalType;
    public AnimalNotFoundException(){

    }
    public AnimalNotFoundException(String animalType){
        super(String.format("Animalul %s nu a fost gasit", animalType));
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }
}

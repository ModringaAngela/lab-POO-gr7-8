package pregatire.zoo;

import pregatire.zoo.animals.Animal;
import pregatire.zoo.animals.Caine;
import pregatire.zoo.animals.Leu;
import pregatire.zoo.animals.Pisica;
import pregatire.zoo.exception.AnimalNotFoundException;
import pregatire.zoo.ui.Controller;
import pregatire.zoo.ui.Model;
import pregatire.zoo.ui.View;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        //test();
        interfataGrafica();
    }

    private static void test(){
        //d)
        Zoo zoo = creareZoo();
        testMethods(zoo);

        //f)
        System.out.println("Animalele dupa efectuarea actiunilor de la punctul e)");
        for (Animal a : zoo.getAnimals()){
            System.out.println(a);
        }
    }

    public static void testMethods(Zoo zoo){
        //e)
        /*
        completati voi cu restul cerintelor de la punctul d)
         */
        try {
            Animal leu = zoo.getAnimalByType(Leu.class);
            leu.primesteHrana();
            leu.mananca(2);
            leu.primesteHrana();
            leu.mananca(0.4F);
        }catch (AnimalNotFoundException e){
            //nu e obligatoriu sa aveti exceptia, puteti implementa si altfel: sa creati aici toate animalele
            // sa nu mai aveti separat metoda creareZoo
            System.out.println("Nu se pot efectua cerintele pentru " + e.getAnimalType());
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void interfataGrafica(){
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        view.setVisible(true);
    }

    public static Zoo creareZoo(){
        Set<Animal> animale = new HashSet<>();
        Leu leo = new Leu("Lion2342", 2010, 250);
        Caine rex = new Caine("Dog6531", 2014, "Fox Terrier");
        Pisica mitzi = new Pisica("Cat7889", 2013, "Alb");
        animale.add(rex);
        animale.add(mitzi);
        animale.add(leo);
        return new Zoo(animale);
        /*
        o instructiune in loc in loc de 2 :
         Zoo zoo = new Zoo(animale);
         return zoo;
        deoarece nu avem nevoie de obiectul zoo pentru altceva in afara de returnare
         */
    }
}

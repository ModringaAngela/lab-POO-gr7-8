package lab6.indrumator;

public class Child extends Parent {

    int _y;
//    public Child(int y) { //GRESIT(eroare de compilare), este nevoie de apel explicit la super
    //compilatorul incearca sa apeleze super() care nu exista
//        _y = y;
//    }

    public Child(int y) {
        super(0); //apelam explicit super(x)
        _y = y;
    }

}

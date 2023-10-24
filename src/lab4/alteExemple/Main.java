package lab4.alteExemple;

//clasa in acelasi pachet cu clasa Methods
public class Main {
    public static void main(String[] args){
        Methods methods = new Methods();
        methods.publicMethod();
        methods.publicMethod(1);
        methods.publicMethod("text");
        methods.defaultMethod();
        methods.protectedMethod();

        /*
         eroare de compilare
         -> private: accesibila doar din cadrul clasei care o declare
         */
        //methods.privateMethod();

    }
}

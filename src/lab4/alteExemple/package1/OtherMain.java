package lab4.alteExemple.package1;

import lab4.alteExemple.Methods;

//clasa in alt pachet decat clasa Methods
public class OtherMain {

    public static void main(String[] args){
        Methods methods = new Methods();
        methods.publicMethod();

        /*
        erori de compilare:
        -> protected: accesibila doar din clasele din acelasi packet sau din subclase
        -> default (no access modifier): accesibila doar din clasele din acelasi packet
        -> private: accesibila doar din cadrul clasei care o declare
        methods.protectedMethod();
        methods.defaultMethod();
         */

        //va arunca eroare
        System.out.println(divide(1,0));

        System.out.println("AAAAAA");

        MethodsChild.method1();
        MethodsChild nume = new MethodsChild();
        nume.method2();
        //apelarea unei metode statice pe un obiect
        nume.method1();
    }

    //clauza throws la o metoda
    static int divide(int i , int j) throws ArithmeticException{
            return i/j;
    }
}

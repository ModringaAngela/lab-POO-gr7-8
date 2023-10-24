package lab4.alteExemple.package1;

import lab4.alteExemple.Methods;

//clasa in alt pachet decat clasa Methods
public class OtherMain {

    public static void main(String[] args){
        Methods methods = new Methods();
        methods.publicMethod();

        /*
        erori de compilare:
        -> protected: accesibila doar din clasele din acelasi packet sau din superclase
        -> default (no access modifier): accesibila doar din clasele din acelasi packet
        -> private: accesibila doar din cadrul clasei care o declare
         */
//        methods.protectedMethod();
//        methods.defaultMethod();
//        methods.privateMethod();

    }
}

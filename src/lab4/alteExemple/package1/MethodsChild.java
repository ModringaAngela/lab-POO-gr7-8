package lab4.alteExemple.package1;

import lab4.alteExemple.Methods;

public class MethodsChild extends Methods {

    void seeCalls(){
        publicMethod();
        publicMethod(1);
        publicMethod("text");
        protectedMethod();
        //eroare de compilare (default method e vizibila doar din cadrul aceluiasi packet)
        //defaultMethod();
    }
}

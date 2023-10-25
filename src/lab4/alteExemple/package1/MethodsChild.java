package lab4.alteExemple.package1;

import lab4.alteExemple.Methods;

public class MethodsChild extends Methods {

    public MethodsChild(){
        super();
    }

    void seeCalls(){
        publicMethod();
        publicMethod(1);
        publicMethod("text");
        protectedMethod();
        //eroare de compilare (default method e vizibila doar din cadrul aceluiasi packet)
        //defaultMethod();
    }

//    public static void main(String[] args) {
//        Methods methods = new Methods();
//        methods.publicMethod();
//        methods.protectedMethod();
//    }

    public static void method1(){

    }

    public void method2(){

    }

}

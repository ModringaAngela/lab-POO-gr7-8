package lab8.ex;

public interface I3 extends I{

    void method();

    static void methodS(){
        System.out.println("A");
    }

    default void methodD(){
        System.out.println("A");
    }
}

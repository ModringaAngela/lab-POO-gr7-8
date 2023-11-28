package lab8.ex;

public interface I {

    int i= 1;
    //eroare pentru ca trebuie sa fie constanta (static final by default)
    //int j;

    void m1();

    default void m2(){
        System.out.println("M2");
    }

    public static void m3(){

    }

    //error because static should have a body
    //public static void m4();
}

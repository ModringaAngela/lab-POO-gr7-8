package lab4.indrumator;

public class Ex {
    int size = 42;

    /*
    eroare de compilare
    - accesarea unui field non static (size) dintr o metoda statica (doMore1)
    - accesarea unei metode non statice (go1) dintr o alta metoda statica (doMore1)
     */
//    void go1() { }
//    static void doMore1() {
//        int x = size;
//        go1();
//    }

    /*
    cod ok
    - accesarea de pe obiect a unui field non-static(size) din cadrul unei metode statice (doMore2)
    - accesarea de pe obiect a unei metode non-statice (go2) din cadrul unei metode statice (doMore2)
     */
    void go2() { }
    static void doMore2() {
        Ex f = new Ex();
        int x = f.size;
        f.go2();
    }

    /*
    cod ok
    - apelarea unei variabile statice (count), din cadrul unei metode statice (doMore3)
    - apelarea unei metode statice (woo), din cadrul unei alte metode statice (doMore3)
     */
    static int count;
    static void woo() { }
    static void doMore3() {
        woo();
        int x = count;
    }

}

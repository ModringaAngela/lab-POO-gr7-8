package lab4.alteExemple;

public class Methods {

    /*
    Exemplu de suprascriere:
    - este permis sa avem mai multe metode cu acelasi nume, daca au acelasi tip returnat si lista
    de parametrii diferita
    -> declararea 1, declararea 4 si declararea 5

    - nu este permis sa avem 2 metode cu acleasi nume si aceeasi parametrii (sau doua metode cu acelasi nume
    si fara parametrii)
    -> declararea 1 si declararea 3 => eroarea de compilator cand metodele au acelasi tip returnat
    -> declararea 1 si declararea 4 => eroarea de compilator cand metodele au tip returnat diferit

     */

    //declareare 1
    public void publicMethod() {
        System.out.println("Afisare din publicMethod");
    }

    //declararea 2
//    public void publicMethod() {
//        System.out.println("Afisare din publicMethod");
//    }

    //declararea 3
//    public int publicMethod() {
//        return 1;
//    }

    //declararea 4
    public void publicMethod(int i) {
        System.out.println("Afisare din publicMethod cu parametrul intreg " + i);
    }

    //declararea 5
    public void publicMethod(String string) {
        System.out.println("Afisare din publicMethod cu parametrul string " + string);
    }
    protected void protectedMethod(){
        System.out.println("Afisare din protectedMethod");
    }

    void defaultMethod(){
        System.out.println("Afisare din defaultMethod");
    }

    private void privateMethod(){
        System.out.println("Afisare din privateMethod");
    }
}


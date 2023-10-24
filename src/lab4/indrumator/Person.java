package lab4.indrumator;

public class Person {
    /*
    variabila instanta
    - creata cand se instantiaza un obiect de clasa Person (exemplu:  Person p = new Person("Initial Person");)
    - distrusa cand nu mai exista nicio referire la el

    - vizibila doar in cadrul clasei deoarece e private

    - valoare initiala: null (null pentru Obiecte, 0 pentru numere, false pentru boolean)
     */
    private String name;

    /*
    CONSTANTA = variabila clasa/statica
    - creata cand porneste programul
    - stearsa cand se termina programul

    - vizibila in orice clasa deoarece e public

    - valoare initiala: null (null pentru Obiecte, 0 pentru numere, false pentru boolean)
     */
    public static final String CONSTANTA = "s";

    //constructor
    public Person(String name) { this.name = name; }

    //getter
    public String getName() { return this.name; }

    //setter
    public void setName(String newName) { this.name = newName; }

    public static void modify1(Person p) {
        p = new Person("Modified Name");
        System.out.println("Name inside modify1:" + p.getName());
    }
    public static void modify2(Person p) {
        p.setName("Modified Name");
        System.out.println("Name inside modify2:" + p.getName());
    }
    public static void main(String[] args) {
        /*
        variabila locala
        - durata de viata a lui p: doar in cadrul metodei main

        - vizibila doar in cadrul metodei main

        - nu are valoare initiala
         */
        Person p = new Person("Initial Person");
        modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName());

        System.out.println();

        modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName());
    }

    public int test(int i, int j) {
        return i + j;
    }
    public int test(int i, byte j) {
        return i + j;
    }

}

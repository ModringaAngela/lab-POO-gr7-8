package teme;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab2 {

    public static void convertStringToNumber(String string) {
        double d = Double.parseDouble(string);
        System.out.println("double: " + d);
        float f = Float.parseFloat(string);
        System.out.println("float: " + f);
        long l = Long.parseLong(string);
        System.out.println("long: " + l);
        int i = Integer.parseInt(string);
        System.out.println("int: " + i);
        short s = Short.parseShort(string);
        System.out.println("short: " + s);
        byte b = Byte.parseByte(string);
        System.out.println("byte: " + b);
    }

    /*
        Scrieți un program în care să realizați conversia șirurilor la numere utilizând metode statice din clasele
        care împachetează tipurile primitive (vezi exemplul metodei statice getInt din capitolul 4.2). Ce
        se întâmplă când conversia nu este posibilă?
    */
    public void ex2() {
        String[] inputs = {"1", "129", "32768", "a"};
        int i = 0;
        /*
            vezi ce se intampla pentru fiecare string de input, ruland codul separat, pentru valori
             ale lui i de la 0 la 3
             => 4 rulari diferite ale programului
         */
        System.out.println("Function convert for " + inputs[i]);
        convertStringToNumber(inputs[i]);
    }

    /*
        ex 6.3
        Scrieţi un program pentru a testa limitele reprezentărilor tipurilor primitive. Observaţi ce se
        întâmpla dacă:
        a) adunaţi o cantitate întreagă la cel mai mare întreg primitiv din fiecare categorie de întregi:
         byte, short, int, long

        b) scădeţi o cantitate întreagă din cel mai mic întreg primitiv din fiecare categorie de întregi

        c) înmulțiți cel mai mare număr real reprezentat în simplă și dublă precizie cu o valoare
        supraunitară
        simpla zecimala = float
        dubla zecimala = double

        d) reprezentaţi în virgulă mobilă numere cu un număr de cifre zecimale mai mare decât numărul
        de cifre reprezentabile exact

        e) adunaţi sau scădeţi cantităţi din numere care au mai multe cifre zecimale în reprezentarea în
        baza 10 decât permite reprezentarea în virgulă mobilă
     */
    public static void ex3() {
        /*
            a) adaugare valoare la valoarea maxima. faceti acelasi lucru pentru short, int si long
            ca sa nu trebuiasca sa cautati/calculati valorile maxime pentru fiecare tip, folositi:
            Integer.MAX_VALUE;
            Long.MAX_VALUE;
            Short.MAX_VALUE;
         */
        byte a = (byte) (Byte.MAX_VALUE + 3);
        System.out.printf("%s - %s = %s\n", Byte.MAX_VALUE, 3, a);
        /*
            b) scadere din cel mai mic numar. faceti voi acelasi lucru pentru byte, int si long
         */
        short b = (short) (Short.MIN_VALUE - 3);
        System.out.printf("%s - %s = %s", Short.MIN_VALUE, 3, b + "\n");

        /*
            c) facut pentru float, faceti voi pentru double
         */
        float c = Float.MAX_VALUE * 3;
        System.out.printf("%s - %s = %s", Float.MAX_VALUE, 3, c + "\n");

        /*
            d) float -> 6 sau 7 zecimale
            double -> 15 zecimale
            pentru numere mari, putem folosi "_" ca separator la fiecare 3 cifre
            separatorul "_" nu are niciun efect in afara de cel vizual, sa fie mai usor de citit numele
            exemplu: 1000 -> 1_000
            1.4733 -> 1.473_3
         */
        float d = 4.978_483_23F;
        System.out.println(d);

        //e
        float e = d - 3.2F;
        float f = d + 3.2F;
        System.out.printf("%s - %s = %s \n",d, 3.2, e);
        System.out.printf("%s + %s = %s \n",d, 3.2, f);
    }

    /*
        a) împărțiti un întreg la zero
        b) împărțiți un număr negativ în virgulă mobilă la zero; apoi unul pozitiv la zero
        c) scădeți în virgulă mobilă din Infinit un alt Infinit
        d) înmulțiți în virgulă mobilă Infinit cu -Infinit
        e) asignați unei valori booleene un întreg
        f) asignați unei valori întregi un număr în virgulă mobilă
     */
    public static void ex4(){
        //a -> decomentati pentru a vedea rularea, comentati inapoi pentru a putea vedea rezultatul urmatoarelor calcule
        //System.out.println(1 / 0);

        //b
        float b1 = -1.3F /0;
        float b2 = 1.3F /0;
        System.out.printf("%s / %s = %s\n", -1.3, 0, b1);
        System.out.printf("%s / %s = %s\n", 1.3, 0, b2);

        //c
        float c = Float.POSITIVE_INFINITY - Float.POSITIVE_INFINITY;
        System.out.printf("%s - %s = %s\n", Float.POSITIVE_INFINITY,  Float.POSITIVE_INFINITY, c);

        //d
        float d = Float.POSITIVE_INFINITY * Float.NEGATIVE_INFINITY;
        System.out.printf("%s * %s = %s\n", Float.POSITIVE_INFINITY,  Float.NEGATIVE_INFINITY, d);

        //e -> decomentati pentru a vedea, comentati la loc pentru a putea rula codul
        //boolean e = 4;

        //f -> decomentati pentru a vedea, comentati la loc pentru a putea rula codul
        //int f1 = 4.7;
    }

    //Scrieți un program în care citiţi de la consolă valori întregi şi numere reale şi le afişaţi apoi pe ecran
    public static  void ex5(){
        //... Initializare
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti un intreg: ");
        int val = in.nextInt();
        System.out.println("Numarul de tip intreg citit este: " + val );
        float f;
        System.out.println("Introduceti un numar real: ");
        f = in.nextFloat();
        System.out.println("Numarul de tip float citit este: " + f);

        //... Inchiderea citirii prin intermediul Scanner
        in.close();
    }

    public static BigInteger boabeDeGrauCuBigInteger(){
        BigInteger nrTotalBoabe = BigInteger.ZERO;
        int nrPatrateleInTabla = 64;
        for(int i  = 1 ; i <= nrPatrateleInTabla; i++){
            BigInteger nrBoabeInPatratelulCurent = BigInteger.TWO.pow(i-1);
            nrTotalBoabe = nrTotalBoabe.add(nrBoabeInPatratelulCurent);
        }
        return nrTotalBoabe;
    }

    public static int boabeDeGrauCuInt(){
        int nrTotalBoabe = 0;
        int nrPatrateleInTable = 64;
        for(int i  = 1 ; i <= nrPatrateleInTable; i++){
            nrTotalBoabe+=Math.pow(2, i-1);
        }
        return nrTotalBoabe;
    }
    /*
        Problema boabelor de grâu pe o tablă de şah: dacă pe o tablă de şah se aşează boabe de grâu
        astfel încât pe prima căsuţă a tablei este un bob de grâu, pe a doua căsuţă sunt 2 boabe de gâu,
        pe a treia căsuţă sunt 4 boabe de grâu ş.a.m.d. (numărul de boabe de grâu se dublează la fiecare
        căsuţă) şi pentru căsuţa i sunt 2*i-1, câte boabe de grâu sunt în total pe tabla de şah?
        Sugestie: folosiţi obiecte BigInteger pentru a calcula numărul total de boabe de grâu.
     */
    public static void ex6(){
        System.out.println("Nr total de boabe, folosind BigInteger e " + boabeDeGrauCuBigInteger());
        System.out.println("Nr total de boabe, folosind int e " + boabeDeGrauCuInt());
        /*
        Metoda cu BigInteger produce rezultatul corect. In metoda cu int, se face overflow (rezultatul
        este mai mare decat valoarea maxima acceptata in int
        https://www.emathhelp.net/en/calculators/calculus-2/series-calculator/?f=2%5E%28n-1%29&var=&a=1&b=64 (rezultatul e suma de puteri de 2 de la 0 la 64)
         */
    }

    public static void main(String[] args) {
        //ex2()
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }
}

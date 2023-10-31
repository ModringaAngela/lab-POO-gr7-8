package lab5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void tablouriDeInt() {
        int[] a = new int[15];
        a[0] = 1;
        System.out.println(a[0]); //valoare ok, atribuita de noi
        System.out.println(a[1]); //0, care e valoarea default atunci cand cream arrayul

        //decomenteaza linia urmatoare pentru a vedea rularea, comenteaza la loc dupa aceea
        //a[15] = 2; // index out of bounds -> indicii intr un array de 200 de elemente sunt de la 0->199

        System.out.println("Lungimea tabloului = " + a.length); //numarul total de elemente ce intra in tablou (lungimea declarata)

        //Afisarea tuturor elementelor
        //varianta 1
        System.out.print("Printarea cu varianta 1 e: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + " ");
        }
        System.out.println();
        System.out.print("Printarea cu varianta 2 e: ");
        //varianta 2
        for (int v : a) {
            System.out.printf(v + " ");
        }
        System.out.println();
        int[] b; // Declara un tablou de int
        b = new int[1000]; // Creeaza un tablou de 1000 int

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100000); // Numarul aleatoriu in gama 0-99999
        }
        //Aduna toate valorile din tablou
        int sum = 0; // Initializeaza suma totala la 0
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i]; // Aduna urmatorul element la total
        }
        System.out.println("Suma e: " + sum);

        //Varianta 2
        int sum2 = 0;
        for (int v : b) {
            sum2 += v;
        }
        System.out.println("Suma calculata cu varianta 2 e: " + sum2);
    }

    public static void tablouriDeString() {
        //Initializare tablouri
        // stil Java 1.0 – mai scurt, dar poate fi folosit DOAR IN DECLARATII
        String[] days = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

        //declarare Java 2
        String[] days2 = new String[]{"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
    }

    public static void exempluComplexArrayDeNumere() {
        int[] a = new int[]{100, 99, 98};
        int[] b;
        // "a" pointeaza spre un tablou, iar "b" nu pointeaza spre nimic
        b = a; // Acum "b" se refera la ACELASI tablou ca si "a"
        System.out.printf("a[1]=%s, b[1]=%s\n", a[1], b[1]);

        b[1] = 0; // Schimba si a[1] deoarece "a" si "b" se refera la acelasi tablou
        // Atat "a" cat si "b" se refera la acelasi tablou cu valorile {100, 0, 98}
        System.out.printf("a[1]=%s, b[1]=%s\n", a[1], b[1]);

        System.out.println();

        //paseaza tabloul unei metode
        int index = 2;
        System.out.printf("Inainte de metoda schimbaValoareDeLaIndex a[%s] = %s\n", index, a[index]);
        schimbaValoareDeLaIndex(a, index, 444);
        System.out.printf("Dupa metoda schimbaValoareDeLaIndex a[%s] = %s\n", index, a[index]);

        System.out.println();
        modificaArrayul(a);
        System.out.println("Dupa apelul metodei modificaArrayul, a contine: ");
        for (int v : a) {
            System.out.print(v + " ");
        }
    }

    public static void schimbaValoareDeLaIndex(int[] a, int i, int newVal) {
        a[i] = newVal;
        System.out.printf("Noua valoare pentru a[%s] e %s\n", i, a[i]);
    }

    public static void modificaArrayul(int[] a) {
        a = new int[]{4, 3, 6};
        System.out.println("In interiorul metodei modificaArrayul, a contine: ");
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void inverseaza(int[] b) {
        int stinga = 0; // indexul elementului celui mai din stanga
        int dreapta = b.length - 1; // indexul elementului celui mai din dreapta

        while (stinga < dreapta) {
            // interschimba elementele din stinga si dreapta
            int temp = b[stinga];
            b[stinga] = b[dreapta];
            b[dreapta] = temp;

            // deplaseaza limitele spre centru
            stinga++;
            dreapta--;

        }
    }

    public static void inverseazaV2(int[] b) {
        for (int stinga = 0, dreapta = b.length - 1; stinga < dreapta; stinga++, dreapta--) {
            // interschimba stinga cu dreapta
            int temp = b[stinga];
            b[stinga] = b[dreapta];
            b[dreapta] = temp;
        }
    }

    /*
        Notite:
        tablou = array
        valoarea initiala la declarare: 0 (intregi), 0.0 (nr rationale), null(obiecte), false(boolean)
     */
    public static void main(String[] args) {

        //declararea arrayului
        int[] a; // stil Java -- bun
        int b[]; // stil C -- legal, dar nerecomandat
        //decomenteaza linia urmatoare pentru a vedea compilarea, comenteaza la loc dupa aceea
        //int c[200]; //ilegal

        //creare array pentru a da ca parametru unei metode
        int n = 4;
        schimbaValoareDeLaIndex(new int[]{n, n + 4, n + 20}, 0, 6);
        System.out.println();

        //metode de biblioteca
        int[] arr = new int[]{2, 4, 6, 1, 10};
        List<int[]> list = Arrays.asList(arr); //putem folosi int[] in cadrul clasei List, pentru ca e un obiect
        String st = Arrays.toString(arr);
        int key = 6;
        int rez = Arrays.binarySearch(arr, 6); //ne spune indexul cheii cautate
        System.out.printf("Indexul lui %s in arr este %s", key, rez);
        System.out.println();

        int[] toFill = new int[]{1,1,1,1};
        System.out.print("Inainte de toFill, arrayul contine: ");
        Arrays.stream(toFill).forEach(e -> System.out.print(e + " "));
        Arrays.fill(toFill, 5);
        System.out.println();
        System.out.print("Dupa toFill, arrayul contine: ");
        Arrays.stream(toFill).forEach(e -> System.out.print(e + " "));
        System.out.println();

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};
        System.out.println("Compararea cu equals da: " + Arrays.equals(arr1, arr2));
        System.out.println("Compararea cu == da: " + (arr1==arr2));

        System.out.println("\n");

        int[] c = new int[]{13, 5, 23, 5};
        System.out.print("Inainte de inversare, c contine: ");
        Arrays.stream(c).forEach(e -> System.out.print(e + " "));
        inverseazaV2(c);
        System.out.println();
        System.out.print("Dupa de inversare, c contine: ");
        Arrays.stream(c).forEach(e -> System.out.print(e + " "));

        System.out.println("\n");

        //tablou bidimensional
        int[][] board = new int[3][3];
        int[][] board2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] board3 = new int[][]{{1}, {4, 5}, {7, 8, 9}};
        System.out.println(board2.length);
        System.out.println(board2[0].length);
    }
}

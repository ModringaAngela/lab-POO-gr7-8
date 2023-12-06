package lab8.comparable;

import java.util.Arrays;
import java.util.Collection;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Cu comparable");
        //array cu persoane ce au nume diferite
        Persoana[] p1 = new Persoana[3];
        p1[0] = new Persoana("Iulia", 7);
        p1[1] = new Persoana("Maria", 8);
        p1[2] = new Persoana("Ana", 12);
        System.out.print("Inainte de sortare: ");
        System.out.println(Arrays.toString(p1));
        Arrays.sort(p1);
        System.out.print("Dupa sortare: ");
        System.out.println(Arrays.toString(p1));

        System.out.println();

        //array cu persoane ce au si acelasi nume
        Persoana[] p2 = new Persoana[3];
        p2[0] = new Persoana("Iulia", 70);
        p2[1] = new Persoana("Iulia", 8);
        p2[2] = new Persoana("Iulia", 12);
        System.out.print("Inainte de sortare: ");
        System.out.println(Arrays.toString(p2));
        Arrays.sort(p2);
        System.out.print("Dupa sortare: ");
        System.out.println(Arrays.toString(p2));

        System.out.println();
        Persoana2[] p3 = new Persoana2[]{new Persoana2("Iulia", 2),
                                        new Persoana2("Iulia", 5)};

        System.out.print("Inainte de sortare: ");
        System.out.println(Arrays.toString(p3));
        Arrays.sort(p3);
        System.out.print("Dupa sortare: ");
        System.out.println(Arrays.toString(p3));

        System.out.println();
        System.out.println("Cu comparator");
        Persoana3[] p4 = new Persoana3[]{new Persoana3("Iulia", 2),
                new Persoana3("Iulia", 5)};

        System.out.print("Inainte de sortare: ");
        System.out.println(Arrays.toString(p4));
        Arrays.sort(p4, new Persoana3Comparator());
        System.out.print("Dupa sortare: ");
        System.out.println(Arrays.toString(p3));


        System.out.println(p1[0].compareTo(p1[1]));

        Persoana3Comparator comparator = new Persoana3Comparator();
        System.out.println(comparator.compare(new Persoana3("Iulia", 2),
                new Persoana3("Iulia", 5)));
    }
}

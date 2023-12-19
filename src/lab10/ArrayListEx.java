package lab10;

import java.util.*;

public class ArrayListEx {

    static void asaNu() {
        List<String> alist = Arrays.asList("A", "B", "C");
        // . . . Adauga Strings la alist
        int i = 0;
        for (Iterator<String> it = alist.iterator(); it.hasNext(); ) {
            System.out.println(alist.get(i++));
        }
        // alist.get(i++) Arunca exceptie deoarece it.hasNext() e mereu true (pentru ca iteratorul avanseaza doar cu it.next()
    }

    static void asaDaCuIterator() {
        List<String> alist = Arrays.asList("A", "B", "C");
        // . . . Adauga Strings la alist
        for (Iterator<String> it = alist.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

    static void asaDaCuGet() {
        List<String> alist = Arrays.asList("A", "B", "C");
        // . . . Adauga Strings la alist
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }

        for (String s : alist){
            System.out.println(s);
        }
    }

    static void listEx(){
        List<String> l1 = new ArrayList<>();
        l1.add("F");
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");

        List<String> l2 = List.of("A", "B", "C", "D", "E");
       // l2.remove("A");
        List<String> l3 = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        l3.remove("A");
        l1.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(Collections.min(l1));
        System.out.println(Collections.max(l2));
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

//        System.out.println("L1");
//        doTheWork(l1);
//        System.out.println();
//
//        System.out.println("L2");
//        doTheWork(l2);
//        System.out.println();
//
//        System.out.println("L3");
//        doTheWork(l3);
//        System.out.println();
//
//        List<List<String>> a = new ArrayList<>();
    }

    static void doTheWork(List<String> l){
        System.out.println("Elementele din lista:");
        for (String s: l){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.printf("Al treilea element e: %s\n", l.get(2));
        l.clear();
    }
    public static void main(String[] args) {
        //listEx();
        //asaDaCuIterator();

        listEx();
    }
}

package lab9.ex;

public class Main {

    public static void main(String[] args) {
        String stringExample = "raaa:";
        int poz1 = 10;
        ThrowsExample e1 = new ThrowsExample(stringExample.toCharArray(), poz1);
        System.out.printf("Citim pana la pozitia %s\n", poz1);
        int l1 = e1.getLength();
        System.out.println("pe e1 getLength returneaza " + l1);

        System.out.println();

        int poz2 = 10;
        ThrowsExample e2 = new ThrowsExample(stringExample.toCharArray(), 1);
        System.out.printf("Citim pana la pozitia %s\n", poz2);
        int l2 = e2.getLength();
        System.out.println("pe e2 getLength returneaza " + l2);
    }
}

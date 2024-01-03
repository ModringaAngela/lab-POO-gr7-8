package pregatire;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("Child");
        System.out.println(c.field);
        System.out.println(c.getField());

        System.out.println("Parent");
        System.out.println(p.field);
        System.out.println(p.getField());
    }
}

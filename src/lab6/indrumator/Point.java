package lab6.indrumator;

public class Point {
    int x;
    int y;

    //============ Constructor implicit fara parametri
    public Point() {
        this(0, 0); // Apeleaza celalalt constructor
    }

    //============ Constructor (ca in apelul de mai sus)
    public Point(int xx, int yy) {
        super(); // realizat automat, daca nu apelati explicit super-constructorul
        x = xx;
        y = yy;
    }
}

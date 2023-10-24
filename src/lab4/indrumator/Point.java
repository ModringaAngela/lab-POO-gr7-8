package lab4.indrumator;

/**
 * javadoc: Clasa Point
 */
public class Point {
    private int x; //variabila instanta (field)
    private int y; //variabila instanta (field)
    private static final int X = 0; //variabila de clasa (statica)
    private static final int Y = 0;  //variabila de clasa (statica)

    //============ Constructor cu parametri
    public Point(int px, int py) {
        x = px;
        y = py;
    }

    //============ Constructor fara parametri
    public Point() {
        this(X, Y); // Apeleaza constructorul cu parametri; creează punctul (0, 0)
    }

    /*
    modificator: public
    tip returnat: void
    nume metoda: printPoint
     */
    public void printPoint() {
        System.out.println("Punctul are coordonatele x=" + x + " si y=" + y);
    }

    /*
   modificator: public
   tip_returnat: void
   nume_metoda: setX
   list_parametrii: int x
    */
    public void setX(int x){
        this.x = x;
    }
}
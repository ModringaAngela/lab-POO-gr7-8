package lab3;

import java.util.HashSet;
import java.util.Set;

public class Calculator implements Comparable<Calculator>{
    //variabila instanta
    private String brand;
    //variabila clasa (statica)
    public static final int PERCENTAGE = 100;

    //constructor cu parametru
    public Calculator(String brand) {
        this.brand = brand;
    }

    //constructor fara parametru
    public Calculator() {
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return a * 1.0 / b;
    }

    public int doIntegerDivision(int a, int b) {
        return a / b;
    }

    // a % of b (ex: 10% din 400)
    public double doPercentage(int a, int b) {
        return (a * 1.0) / PERCENTAGE * b;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Calculator)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Calculator c = (Calculator) o;

        // Compare the data members and return accordingly
        return c.brand.equals(this.brand);
    }

    @Override
    public int compareTo(Calculator calculator) {
        return 0;
    }
}

package lab3;

import java.util.HashSet;
import java.util.Objects;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int compareTo(Calculator calculator) {
        return 0;
    }

}

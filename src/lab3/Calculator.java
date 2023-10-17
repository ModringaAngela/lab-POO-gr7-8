package lab3;

public class Calculator {
    //variabila instanta
    private String brand;
    //variabila clasa (statica)
    private static final int PERCENTAGE = 100;

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
}

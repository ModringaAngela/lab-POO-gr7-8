package lab8.ex;

public class C implements I2, I3 {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        I2.super.m2();
    }

    @Override
    public void mi2() {

    }

    @Override
    public void method() {
        System.out.println();
    }

    public static void main(String[] args) {

    }
}

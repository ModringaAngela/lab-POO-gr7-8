package lab8.ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main2 {

    public static void main(String[] args) {
        I i = new C();
        I2 i2 = new C();

        I i3 = new C2();
        I i4 = new C3();

        //I3 i5 = (I3) new C2();

        List<String> l = new ArrayList<>();
        List<String> l2 = new Vector<>();
        List<String> l3 = new LinkedList<>();

        method1(l);
        method1(l2);
        method1(l3);

        I.m3();
        i.m2();

        I i6 = new C3();

    }

    static void method1(List<String> l ){

    }
}

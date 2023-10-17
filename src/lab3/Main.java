package lab3;

public class Main {

    public static void main(String[] args) {
        operatori();
    }

    public static void operanzi() {
        //variabile locale de tipul int
        int a = 25;
        int b = 6;
        //variabila locala de tipul Calculator
        Calculator calculator = new Calculator("Canon");
        double percentage = calculator.doPercentage(a, b);
        int product = calculator.multiply(a, b);
        double division = calculator.divide(a, b);
        int integerDivision = calculator.doIntegerDivision(a, b);
        System.out.println(a + "% din " + b + " = " + percentage);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(a + " integer / " + b + " = " + integerDivision);
    }

    public static void operatori() {
        //operatori booleeni
        boolean bool1 = true;
        boolean bool2 = false;
        boolean and = bool1 && bool2;
        boolean or = bool1 || bool2;
        boolean notA = !bool1;

        //operatori relationali
        System.out.println(0.1 + 0.1 == 0.2);
        System.out.println(0.1 + 0.1 + 0.1 == 0.3);

        //==, equals, compareTo
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        Calculator c3 = c2;
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

        //articol: https://dzone.com/articles/how-do-i-compare-strings-in-java
        String name1 = "Mickey Mouse";
        String name2 = name1;
        String name3 = new String("Mickey Mouse");
        String name4 = "Mickey Mouse";
        String name5 = "Mickey" + " Mouse";
        System.out.println(name1 == "Mickey Mouse");
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1 == name4);

        //operatori pe biti
       /*
       ~ = complement <=> inversarea bitilor
       ^ = sau exclusiv
       >>> shiftare fara semn
        */
        System.out.println("3 & 5 = " + (3 & 5));
        System.out.println("3 | 5 = " + (3 | 5));
        System.out.println("3 ^ 5 = " + (3 ^ 5));
        System.out.println("~5" + ~5);
        System.out.println("3 << 2 = " + (3 << 2));
        System.out.println("5 >> 2 = " + (5 >> 2));
        System.out.println("-4 >>> 28 ="  + (-4 >>> 28));

        //impachetare si despachetare
        int varsta=10, gen=1, inaltime=130;
        short info_impachetata;
        // împachetare
        //pentru debugging, putem folosi metoda Integer.toBinaryString(varsta)..
        info_impachetata = (short)((((varsta << 1) | gen) << 8) | inaltime);
        System.out.println("informatia impachetata = " + info_impachetata);
        // despachetare
        inaltime = info_impachetata & 0xff;
        gen = (info_impachetata >>> 8) & 1;
        varsta = (info_impachetata >>> 9) & 0x7f;
        System.out.println("inaltimea = " + inaltime);
        System.out.println("varsta = " + varsta);
        System.out.println("gen = " + gen);

        int nr = 5;
        System.out.println(nr++);
        System.out.println(nr);
        System.out.println(++nr);

        int n = 6;
        int m = 6;
        //post increment
        int res1 = n++;
        System.out.println(res1);
        System.out.println(n);
        //pre increment
        int res2 = ++m;
        System.out.println(res2);
        System.out.println(m);


        //operatorul conditional
        int res = 5>6 ? 1 : 2;
        System.out.println(res);

        int switchVar = 1;
        switch (switchVar){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3,4:
                System.out.println("3 sau 4");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}

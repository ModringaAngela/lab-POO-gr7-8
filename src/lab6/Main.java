package lab6;

import lab6.indrumator.Base;
import lab6.indrumator.MyWindow;
import lab6.indrumator.Sub;

public class Main {

    public static void exempluParentChild() {
        Child c = new Child(1, "ab");
        Child c2 = new Child(2);
        Child c3 = new Child("cd");
        Child c4 = new Child();
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

    public static void exempluMyWindow() {
        MyWindow w = new MyWindow("a");
        System.out.println(w.getTitle());
    }

    public static void exempluSub() {
        Sub s = new Sub();
        Base b = s;
        System.out.println("s==b e " + (s == b));

        System.out.println("Filedurile din clasa copil asund fieldurile din clasa parinte cu acelasi nume");
        System.out.println(s.field); // access one -> acceseaza direct variabila field a lui Sub s
        System.out.println(b.field); // access two -> aceseaza variabila field a lui Base b -> ascunderea variabilei
        System.out.println(((Sub) b).field); // access three -> urmeaza regula de tip -> e tipul Sub => 1
        System.out.println(((Base) s).field); // access four -> urmeaza regula de tip -> e tipul Base => 0

        System.out.println();

        /*
        aderarea strictă la identitatea referinţă/instanţă faţă de tipul variabilei => polimorfismului.
        Polimorfismul este caracteristica care deleagă comportamentul la clasa reală a instanţei referite — nu la
        tipul în care este stocată referinţa. P
         */
        System.out.println("Metoda din clasa copil suprascrie metoda din clasa parinte cu acelasi nume");
        Sub s2 = new Sub();
        Base b2 = s2; // intr-o clasa parinte putem stoca un obiect al clasei copil, fara niciun cast

        System.out.println(s2.getField()); // access one
        System.out.println(b2.getField()); // access two
        System.out.println(((Sub)b2).getField()); // access three
        System.out.println(((Base)s2).getField()); // access four

        System.out.println();

        /*
            ca sa punem un obiect al clasei parinte, in clasa copil, trebuie sa facem cast explicit
            acest cast poate arunca exceptie, cum e si in cazul nostru, deoarece b3 e instanta a clasei Base,
            nu Sub
            decomenteaza si ruleaza pentru a vedea
         */
//        Base b3 = new Base();
//        Sub s3 = (Sub) b3;

        //cast legal, deoarece b2 era instanta a clasei Sub la declarare:
        Sub s4 = (Sub) b2;
    }

    public static void main(String[] args) {
        exempluSub();
    }
}

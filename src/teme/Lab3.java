package teme;

import java.util.Arrays;
import java.util.Random;

public class Lab3 {

    /*
        Scrieți un program în care să experimentați împachetarea a trei valori - caracteristici ale unei
        persoane: vârstă (7 biți), sex (1 bit) și înălțime (8 biți) într-o variabilă de tip short (16 biți).
        Realizația apoi despachetarea lor si verificați rezultatele obținute

        sex: 0/1 -> 1 bit
        varsta: 0->127 -> 7 biti
        inaltime: 0->255 -> 8 biti
        => toata informatia incape in 2 bytes => putem folosi short care are 4 bytes
     */
    public static void ex2(int varstaIn, int sexIn, int inaltimeIn) {
        short info_impachetata;
        // împachetare
        info_impachetata = (short) ((((varstaIn << 1) | sexIn) << 8) | inaltimeIn);
        // despachetare
        int inaltimeOut = info_impachetata & 0xff;
        int sexOut = (info_impachetata >>> 8) & 1;
        int varstaOut = (info_impachetata >>> 9) & 0x7f;
        System.out.printf("Varsta : in = %s, out = %s\n", varstaIn, varstaOut);
        System.out.printf("Sex : in = %s, out = %s\n", sexIn, sexOut);
        System.out.printf("Inaltime : in = %s, out = %s\n", inaltimeIn, inaltimeOut);
    }

    public static boolean eVocala(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    /*
        Scrieți un program în care fiind dată o variabilă care stochează o referință către un String,
        determină:
        a) numărul de consoane și vocale
        b) indicii pentru o vocală introdusă din linia de comandă
     */
    public static void ex3(String s) {
        int nrConsoane = 0;
        int nrVocale = 0;
        String lowerCaseS = s.toLowerCase(); // ca sa nu trebuiasca sa comparam si litere mari, si mici
        for (int i = 0; i < s.length(); i++) {
            if (eVocala(s.charAt(i))) {
                nrVocale++;
            }
        }
        nrConsoane = s.length() - nrVocale;
        System.out.println("Nr vocale: " + nrVocale);
        System.out.println("Nr consoane: " + nrConsoane);
    }

    /*
        Scrieți un program în care să experimentați concatenarea de String-uri (operatorul +),
        egalitatea referințelor (operatorul ==) și conținuturilor (metoda equals) a două String-uri.
     */
    public static void ex4() {
        String name1 = "Mickey Mouse";
        String name2 = "Mickey" + " Mouse";
        System.out.println("folosind == obtinem: " + (name1 == name2));
        System.out.println("folosind equals obtinem: " + name1.equals(name2));
    }

    /*
        formula matematica prin care se caculeaza sansele -> 1 / Cnk
        Cnk =  n! / (k! * (n-k)!
        putem reduce combinarile la: (n * (n-1) * .. * (n-k+1)) / k!
        deoarce factorialul doar pana la 20 poate incapea in timpul long
        Altfel, putem folosi clasa BigDecimal pentru calcule.
        constrangere care ramane: maxim nrExtrase=20
     */
    public static double sanse(int nrExtrase, int nrTotale) {
        double sanse = 0;
        if (nrExtrase < nrTotale) {
            long deimpartit = 1;
            long impartior = 1;
            for (int i = nrTotale ; i > nrTotale - nrExtrase; i--){
                deimpartit *=i;
            }
            for (int i = 2; i <= nrExtrase; i++){
                impartior*=i;
            }
            double nrVariante = deimpartit*1.0 /  impartior;
            sanse = 1/nrVariante;
            System.out.printf("Sunt %s variante\n", nrVariante);
            System.out.printf("Sansele sunt 1 din %s\n", nrVariante);
        } else {
            System.out.println("Input invalid"); //sau aruncam o exceptie
        }
        return sanse;
    }

    /*
        Implementați o aplicație pentru orice loterie în care să:
        a) calculați şansele de câştig la loterie (ex. 6 din 49)
        b) simulați extragerea numerelor la loterie (pentru generarea numerelor aleatoare folosiţi
        Math.random)
        c) afişaţi în ordine crescătoare/descrescătoare numerele extrase la loterie fără a face sortări
        sau a folosi tablouri. (Sugestie: folosiţi împachetarea/despachetarea/extragerea de biţi stocaţi
        într-un long)
     */
    public static void ex5() {
        //a) calculati sansele
        int nrExtrase = 6;
        int nrTotale = 49;
        System.out.printf("Deci sansele la extragerea %s din %s sunt %s\n",nrExtrase, nrTotale, sanse(nrExtrase, nrTotale));

        System.out.println();
        //b) simulati extragerea
        System.out.println("Simulare extragere");
        Random r = new Random();
        for (int i = 0; i < nrExtrase;i++){
            //fara verificare daca numarul a mai fost generat sau nu
            System.out.printf((r.nextInt(nrTotale-1)+1) + " ");
        }
        System.out.println("\n");

        //c) sortati folosind impachetarea si despachetarea
        long numere = 0;
        for (int i = 0; i < nrExtrase; i++)
        {
            long x = r.nextInt(nrTotale-1)+1; //pentru a genera numere de la 1 la nrTotale, nu de la 0

            //verifica daca numarul a mai fost generat sau nu
            if ((numere & 1l << x) != 0)
            {
                i--;
                continue;
            }

            //seteaza bitul de pe pozitia x ca fiind 1
            numere = numere | 1l << x;
        }
        System.out.println("Informatia impachetata arata: " + Long.toBinaryString(numere));

        //in ordine crescatoare
        System.out.print("Numerele extrase, in ordine crescatoare sunt: ");
        for (int i = 1; i <= nrTotale; i++)
            if ((numere & 1l << i) != 0)
                System.out.print(i + " ");

        System.out.println();

        //in ordine descrescatoare
        System.out.print("Numerele extrase, in ordine descrescatoare sunt: ");
        for (int i = nrTotale; i >= 1; i--)
            if ((numere & 1l << i) != 0)
                System.out.print(i + " ");
    }

    public static void main(String[] args) {
        //ex2(10, 0,  180);
        //ex3("scoala");
        //ex4();
        ex5();

    }

}

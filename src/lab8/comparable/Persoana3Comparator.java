package lab8.comparable;

import java.util.Comparator;

public class Persoana3Comparator implements Comparator<Persoana3> {

    //    @Override
//    public int compare(Persoana3 t1, Persoana3 t2) {
//        if (t1.getVarsta() < t2.getVarsta()){
//            return -1;
//        }
//        return t1.getVarsta() > t2.getVarsta() ? 1 : 0;
//    }


    /*
        same ca la compareTo() -> <0 pt mai mic, = 0 pt egale si > 0 pt mai mari
     */
    @Override
    public int compare(Persoana3 t1, Persoana3 t2) {
        return t1.getVarsta() - t2.getVarsta();
    }
}

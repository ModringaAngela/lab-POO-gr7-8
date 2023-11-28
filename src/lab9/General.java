package lab9;

import java.io.IOException;

public class General {

    static int cap(int x) {
        return 100/x;
    }

    static void printStackExample(){
        try {
            cap(0);
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }

    /*
        AritmeticExpecetion e subclasa a clasei RunTimeException => nu trebuie declarata in signatura metodei
        -> numita si unchecked exception (apare la runtime)
     */
    static void rearuncareaUneiExceptiiRuntime(){
        try {
            cap(0);
        }
        catch(ArithmeticException e) {
            throw e;
        }
    }

    /*
    IOException nu e subclasa a claselor RunTimeException or Error
     e o exceptie checked (apare la compile time)
     => trebuie sa o avem in signatura metodei cu clauza throws (pentru ca e ARUNCATA din metoda)
     */
    static void rearuncareaUneiExceptiiChecked() throws IOException {
        try{
            throw new IOException();
        }catch (IOException e){
            throw e;
        }
    }

    /*
    IOException nu e subclasa a claselor RunTimeException or Error
     e o exceptie checked (apare la compile time)
     => NU trebuie sa o avem in signatura metodei cu clauza throws pentru ca e PRINSA in catch
     */
    static void prindereaUneiExceptiiChecked()  {
        try{
            throw new IOException();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void fillInStackExample(){
        try {
            cap(0);
        }
        catch(ArithmeticException e) {
            throw (ArithmeticException)e.fillInStackTrace();
        }
    }


    public static void main(String[] args) {

        //printarea stack traceului, fara a arunca de fapt o exceptie
        //new Throwable().printStackTrace();

        //rearuncareaUneiExceptiiRuntime();

//        System.out.println("Apelul lui printStackExample");
//        printStackExample();

        System.out.println("Apelul lui fillInStackExample");
        fillInStackExample();

    }
}

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
            System.out.println("ahferhf");
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
            throw new IOException("exceptie aruncata aici");
        }catch (IOException e){
            System.out.println("Shedhi");
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
        }catch (Exception e) {

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

    static void aruncaCheckedExceptionSiPrindeAlta(){
        try {
            //throw new IOException("IO ex");
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        //printarea stack traceului, fara a arunca de fapt o exceptie
        //new Throwable().printStackTrace();

        //rearuncareaUneiExceptiiRuntime();

//        System.out.println("Apelul lui printStackExample");
//        printStackExample();


        try {
            rearuncareaUneiExceptiiChecked();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
//        catch (ArithmeticException e){
//
//        }
//        finally {
//            System.out.println("Printeaza asta");
//        }


        System.out.println("Apelul lui fillInStackExample");
//        fillInStackExample();

    }
}

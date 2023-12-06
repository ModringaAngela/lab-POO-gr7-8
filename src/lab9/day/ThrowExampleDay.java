package lab9.day;

import java.util.Arrays;

public class ThrowExampleDay
{
    void doIt(int dayOfWeek) throws WrongDayException
    {
        System.out.printf("Day of the week is %s\n", dayOfWeek);
        if (dayOfWeek != 2 && dayOfWeek != 4)
            throw new WrongDayException("Tue. or Thur.");
        System.out.println("Did it");
    }

    public static void main (String[] args)
    {
        //care e diferenta dintre v1() si v2()
        v1();
        //v2();
    }

    static void v1(){
        for(int i = 0 ; i <=6 ; i++){
            try
            {
                (new ThrowExampleDay()).doIt(i);
            }
            catch (WrongDayException e)
            {
                System.out.println("Sorry, can do it only on " + e.getMessage());
                System.out.println();
            }
        }
    }

    static void v2(){
        try {
            for (int i = 0 ; i <= 6; i++){
                (new ThrowExampleDay()).doIt(i);
            }
        } catch (WrongDayException e) {
            System.out.println("Sorry, can do it only on " + e.getMessage());
            System.out.println();
        }
    }
}

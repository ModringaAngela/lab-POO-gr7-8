package lab9.day;

class WrongDayException extends Exception
{
    public WrongDayException () {}

    public WrongDayException(String msg)
    {
        super(msg);
    }
}

package lab9.ex;

import java.io.IOException;
class ThrowsExample
{
    char[] a;
    int position;

    public ThrowsExample(char[] a, int position) {
        this.a = a;
        this.position = position;
    }

    // Metoda care arunca explicit o exceptie
    int read() throws IOException
    {
        if (position >= a.length)
            throw new IOException();
        return a[position++];
    }
    // Metoda care implicit arunca o exceptie
    String readUpTo(char terminator) throws IOException
    {
        StringBuffer s = new StringBuffer();
        while (true)
        {
            int c = read(); // Poate arunca o IOException
            if (c == -1 || c == terminator)
            {
                return s.toString();
            }
            s.append((char)c);
        }
    }

    // Metoda care intercepteaza intern exceptia aparuta
    int getLength()
    {
        String s;
        try
        {
            s = readUpTo(':');
        }
        catch (IOException e)
        {
            System.out.println("Exceptia a fost interpretata");
            return 0;
        }
        return s.length();
    }

    // Metoda care poate arunca o RunTimeException
    int getAvgLength()
    {
        int count = 0;
        int total = 0;
        int len;
        while (true)
        {
            len = getLength();
            if (len == 0)
                break;
            count++;
            total += len;
        }
        return total/count; // Poate arunca o ArithmeticException
    }
}

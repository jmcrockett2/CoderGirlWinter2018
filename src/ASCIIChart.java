import static java.lang.System.out;

public class ASCIIChart
{
    public static void main(String[] args)
    {
        for(int index = 32; index <= 255; index++)
        {
            char ascii = (char) index;
            out.print(index + " ");
            out.println(ascii);
        }
    }
}

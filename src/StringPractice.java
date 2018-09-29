import static java.lang.System.out;

public class StringPractice
{
    private static int countG(String text)
    {
        int count = 0;
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == 'g')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        out.println("# of g's: " + countG("Giggity"));
    }
}
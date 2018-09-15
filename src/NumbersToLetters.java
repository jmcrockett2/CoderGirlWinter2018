import static java.lang.System.out;

public class NumbersToLetters
{
    public static void main(String[] args)
    {
        char ascii[] = {'C', 'r', 'o', 'w', ' ', 'f', 'l', 'i', 'e', 's', ' ', 'a', 't', ' ', 'd', 'a', 'w', 'n', '.' };

        for (int index = 0; index < ascii.length; index++)
        {
            int num = (int) ascii[index];
            out.print(num + ", ");

        }
    }
}

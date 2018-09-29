import static java.lang.System.out;

public class Uppercase
{
    public static void main(String[] args)
    {
        char phrase[] = {'W', 'h', 'y', ' ', 'i', 's', ' ', 'E', 'a', 's', 't', 'e', 'r', ' ', 'i', 'n', ' ', 't', 'h', 'e', ' ', 'S', 'p', 'r', 'i', 'n', 'g', '?'};

        for (int index = 0; index < phrase.length; index++)
        {
            if(Character.isLowerCase(phrase[index]) && Character.isLetter(phrase[index]))
            {
                phrase[index] = Character.toUpperCase(phrase[index]);
            }
        }
        out.print(phrase);
    }
}

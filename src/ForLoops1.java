import static java.lang.System.out;
import java.util.Scanner;

public class ForLoops1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("How big of a number should I count to?");
        int choice = keyboard.nextInt();
        keyboard.skip("\n");

        for (int counter = 1; counter <= choice; counter++)
        {
            out.print(counter + " ");
        }
        out.print("\n");
        for (int counter = choice; counter <= choice && counter > 0; counter--)
        {
            out.print(counter + " ");
        }
    }
}

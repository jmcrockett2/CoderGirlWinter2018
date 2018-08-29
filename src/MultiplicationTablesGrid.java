import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTablesGrid
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");
        out.print("How large would you like to see them? ");
        int size = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\n");
        if(size > 20 || size < 0)
        {
            out.println("Invalid number");
        }
        out.print("     ");
        for(int counter3 = 0; counter3 <= size; counter3++)
        {
            if (counter3 <=8)
            {
                out.print(counter3 + "   ");
            }
            else if (counter3 == 9)
            {
                out.print(counter3 + "  ");
            }
            else
            {
                out.print(counter3 + "  ");
            }
        }
        out.print("\n");
        for(int counter2 = 0; counter2 <= size; counter2++)
        {
            if(counter2 <= 9)
            {
                out.print(" " + counter2 + " ");
            }
            else
            {
                out.print(counter2 + " ");
            }
            for (int counter1 = 0; counter1 <= size; counter1++)
            {
                if(counter2*counter1 <= 9)
                {
                    out.print("  " + counter2*counter1 + " ");
                }
                else if (counter2*counter1 <= 99)
                {
                    out.print(" " + counter2*counter1 + " ");
                }
                else if (counter2*counter1 >= 100)
                {
                    out.print(counter2*counter1 + " ");
                }
            }
            if(counter2 <= 9)
            {
                out.print("\n");
            }
            else
            {
                out.print("\n");
            }

        }
    }
}

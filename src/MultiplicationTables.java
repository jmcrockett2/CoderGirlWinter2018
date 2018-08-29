import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables\n");
        out.print("How large would you like to see them? ");
        int size = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\n");
        if(size > 20 || size < 0)
        {
            out.println("Invalid number");
        }
        for(int size2 = 0; size2 <= size; size2++)
        {
            for(int size1 = 0; size1 <= size; size1++)
            {
                out.println(size2 + " * " + size1 + " = " + (size2*size1));
            }
        }
    }
}

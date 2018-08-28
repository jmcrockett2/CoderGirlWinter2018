import static java.lang.System.out;
import java.util.Scanner;

public class ForLoops2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int numberIn;
        out.println("Welcome to Bar Chart\n");
       do
       {
           out.print("number? ");
           numberIn = keyboard.nextInt();
           keyboard.skip("\n");
           for(int width = 1; width <= numberIn; width++)
           {
                out.print("#");
           }
           out.print("\n");
       }
       while (numberIn != 0);

        out.println("Have a good day!");
    }
}

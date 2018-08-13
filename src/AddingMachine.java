import static java.lang.System.out;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddingMachine
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat();
        float total = 0;
        float b;
        int counter = 0;
        boolean start = true;
        out.println("Welcome to Adding Machine!");
        out.println("Total = " + format.format(total) + "\n");

        while (start)
        {
            out.print("Add: ");
            b = keyboard.nextFloat();
            total = total + b;
            out.println("Total: " + format.format(total) + "\n");
            if (b > 0)
            {
                counter++;
            }
            if (b == 0)
            {
                start = false;
            }
        }

        out.println("You entered " + format.format(counter) + " numbers, for a final total of " + format.format(total) + ".");
    }
}

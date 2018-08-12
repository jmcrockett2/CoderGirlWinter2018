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
        float b = 0;
        int counter = 0;
        boolean start = true;
        System.out.println("Welcome to Adding Machine!");
        System.out.println("Total = " + format.format(total) + "\n");

        while (start == true)
        {
            System.out.print("Add: ");
            b = keyboard.nextFloat();
            total = total + b;
            System.out.println("Total: " + format.format(total) + "\n");
            if (b > 0)
            {
                counter++;
            }
            if (b == 0)
            {
                start = false;
            }
        }

        System.out.println("You entered " + format.format(counter) + " numbers, for a final total of " + format.format(total) + ".");
    }
}

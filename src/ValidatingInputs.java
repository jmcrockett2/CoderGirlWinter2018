import static java.lang.System.out;
import java.util.Scanner;

public class ValidatingInputs
{
    private static int getIntegerBetween(int lower, int upper)
    {
        Scanner keyboard = new Scanner(System.in);
        int x;
        do
        {
            x = keyboard.nextInt();
            if (x < lower || x > upper)
            {
                out.println("Error, invalid number. Try again.");
            }
        }
        while (x < lower || x > upper);
        return x;
    }

    private static int getTensInteger(int lower, int upper)
    {
        Scanner keyboard = new Scanner(System.in);
        int y;
        do
        {
            y = keyboard.nextInt();
            if (y < lower || y > upper || y % 10 != 0)
            {
                out.println("Error, invalid number. Try again.");
            }
        }
        while (y < lower || y > upper || y % 10 != 0);
        return y;
    }

    public static void main(String[] args)
    {
        out.println("Please enter a number from 1-10");
        int firstNumber = getIntegerBetween(1, 10);

        out.println("Please enter a number between 200 and 3000 that is a multiple of ten.");
        int secondNumber = getTensInteger(200, 3000);

        out.println("You entered " + firstNumber + " and " + secondNumber);
    }
}

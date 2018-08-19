import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
    private static int validate(int random2)
    {
        out.println("I'm thinking of a number between 1 and 100. What is it?\n");
        Scanner keyboard = new Scanner(System.in);
        int guess;
        do
        {
            out.println("Guess: ");
            guess = keyboard.nextInt();
            keyboard.skip("\n");
            if (guess < 1 || guess > 100)
            {
                out.println("Oops! That number isn't between 1 and 100. Try again.");
            } else if (guess > random2)
            {
                out.println("My number is lower.");
            } else if (guess < random2)
            {
                out.println("My number is higher.");
            }
        }
        while (guess < 1 || guess > 100 || guess > random2 || guess < random2);
        return guess;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random(5);
        boolean keepGoing = true;
        while (keepGoing)
        {
            int random2 = validate(random.nextInt(100));
            out.println("You got it! My number was " + random2 + ".");
            out.println("Play again?");
            String again = keyboard.nextLine();
            if (!again.equals("yes"))
            {
                keepGoing = false;
            }
        }

    }
}
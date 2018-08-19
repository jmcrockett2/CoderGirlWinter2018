import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
    private static int validate()
    {
        out.println("Guess: ");
        Scanner keyboard = new Scanner(System.in);
        int guess;
        Random random = new Random(5);
        int random2 = random.nextInt(100);
        do
        {
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
        boolean keepGoing = true;
        do
        {
            out.println("I'm thinking of a number between 1 and 100. What is it?\n");
            int guess = validate();
            out.println("You got it! My number was " + guess + ".");
            out.println("Play again?");
            String again = keyboard.nextLine();
            if (!again.equals("yes"))
            {
                keepGoing = false;
            }
        }
        while (keepGoing);
    }
}
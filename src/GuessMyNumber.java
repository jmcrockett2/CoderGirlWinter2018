import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random(5);
        int guess = 0;
        int number;
        number = random.nextInt(100);

        while (number != guess)
        {
            out.println("I'm thinking of a number between 1 and 100. What is it?\n");
            out.println("Guess: ");
            guess = keyboard.nextInt();
            keyboard.skip("\n");
            if (guess > 100 || guess < 1)
            {
                out.println("Oops! That number isn't between 1 and 100. Try again.");
            }
            else if (guess > number)
            {
                out.println("My number is lower.");
            }
            else if (guess < number)
            {
                out.println("My number is higher.");
            }
            else if (guess == number)
            {
                out.println("You got it! My number was " + random + ".\n");
                out.println("Play again?");
                String again = keyboard.nextLine();
                if (again.equals("yes"))
                {
                    guess = 0;
                    number = random.nextInt(100);
                }
            }

        }

    }
}
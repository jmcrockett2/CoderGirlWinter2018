import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        // Your code goes below here.

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today? ");
        int soldVeggies = keyboard.nextInt();
        keyboard.skip("\n");
        if (soldVeggies >= goalForVeggies)
        {
            out.println("Made goal for veggies.");
        }
        else
        {
            out.println("Fell short for veggies.");
        }

        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today? ");
        int soldBurgers = keyboard.nextInt();
        keyboard.skip("\n");
        if (soldBurgers >= goalForBurgers)
        {
            out.println("Made goal for burgers.");
        }
        else
        {
            out.println("Fell short for burgers.");
        }

        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today? ");
        int soldSubs = keyboard.nextInt();
        keyboard.skip("\n");
        if (soldSubs >= goalForSubs)
        {
            out.println("Made goal for subs.");
        }
        else
        {
            out.println("Fell short for subs.");
        }

        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today? ");
        int soldSoup = keyboard.nextInt();
        keyboard.skip("\n");
        if (soldSoup >= goalForSoup)
        {
            out.println("Made goal for soup.");
        }
        else
        {
            out.println("Fell short for soup.");
        }

        if (soldVeggies >= goalForVeggies && soldBurgers >= goalForBurgers && soldSubs >= goalForSubs && soldSoup >= goalForSoup)
        {
            out.println("Made goal for everything!");
        }
    }
}

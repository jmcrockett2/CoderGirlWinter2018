import static java.lang.System.out;
import java.util.Scanner;

public class AreWeThereYet
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String areWeThere = "";
        boolean keepGoing = true;
        while (keepGoing == true)
        {
            System.out.print("Are we there yet? ");
            areWeThere = keyboard.nextLine();
            if (areWeThere.equals("yes"))
            {
                keepGoing = false;
            }
            if ((!areWeThere.equals("yes")) && (!areWeThere.equals("no")))
            {
                System.out.println("Huh? I didn't understand that.");
            }
        }
        System.out.print("Yay!");
    }
}

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThankYouMailMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String personname = "";
        float donation = 0;
        DecimalFormat format = new DecimalFormat("0.00");
        boolean keepGoing = true;
        System.out.println("--- Thank You Letters ---\n");

        while (keepGoing == true)
        {
            System.out.println("Donor's Name? ");
            personname = keyboard.nextLine();
            if (personname.equals("quit"))
            {
                keepGoing = false;
            }
            else
                {
                    System.out.println("Donation amount?");
                    donation = keyboard.nextFloat();
                    keyboard.skip("\n");
                    System.out.println("\n");
                    System.out.println("Dear " + personname + ",\n");
                    System.out.println("Thank you for your donation! We rely on donors like you to keep our");
                    System.out.println("organization effective, and you came through for us. Your donation of $" + format.format(donation));
                    System.out.println("will help our efforts to make a difference in the world.\n");
                    System.out.println("As you may know, we are a registered non-profit organization, so your");
                    System.out.println("donation is tax deductible. You may use this letter as a receipt for tax");
                    System.out.println("purposes.\n");
                    System.out.println("Thank you again for your support!\n");
                    System.out.println("Sincerely,");
                    System.out.println("Paula Jones");
                    System.out.println("YourCharity.org\n");
                }
        }
    }
}

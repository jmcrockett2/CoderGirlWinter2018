import static java.lang.System.out;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThankYouMailMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String personName;
        float donation;
        DecimalFormat money = new DecimalFormat("0.00");
        boolean keepGoing = true;
        out.println("--- Thank You Letters ---\n");

        while (keepGoing)
        {
            out.println("Donor's Name? ");
            personName = keyboard.nextLine();
            if (personName.equals("quit"))
            {
                keepGoing = false;
            }
            else
                {
                    out.println("Donation amount?");
                    donation = keyboard.nextFloat();
                    keyboard.skip("\n");
                    out.println("\n");
                    out.println("Dear " + personName + ",\n");
                    out.println("Thank you for your donation! We rely on donors like you to keep our");
                    out.println("organization effective, and you came through for us. Your donation of $" + money.format(donation));
                    out.println("will help our efforts to make a difference in the world.\n");
                    out.println("As you may know, we are a registered non-profit organization, so your");
                    out.println("donation is tax deductible. You may use this letter as a receipt for tax");
                    out.println("purposes.\n");
                    out.println("Thank you again for your support!\n");
                    out.println("Sincerely,");
                    out.println("Paula Jones");
                    out.println("YourCharity.org\n");
                }
        }
    }
}

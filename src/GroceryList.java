import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        out.println("Please list three items on your grocery list.");
        Scanner keyboard = new Scanner(System.in);
        out.println("Item 1?");
        String item1 = keyboard.nextLine();
        out.println("Item 2?");
        String item2 = keyboard.nextLine();
        out.println("Item 3?");
        String item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        out.println("How many " + item1 + "?");
        int qty1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many " + item2 + "?");
        int qty2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many " + item3 + "?");
        int qty3 = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("Now, please enter the price of each item.");
        out.println("How much does one " + item1 + " cost?");
        float cost1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("How much does one " + item2 + " cost?");
        float cost2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("How much does one " + item3 + " cost?");
        float cost3 = keyboard.nextFloat();
        keyboard.skip("\n");

        float total = ((qty1 * cost1) + (qty2 * cost2) + (qty3 * cost3));
        out.println("Calculating your grocery bill.");
        out.println("Your total cost is f" + total);
    }
}

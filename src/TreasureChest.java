import static java.lang.System.out;
import java.util.Scanner;

public class TreasureChest
{
    public static void main(String[] args)
    {
        int boardsPerChest = 9;
        Scanner keyboard = new Scanner(System.in);
        out.println("Pirate Lady Ching wants to build some locking treasture chests.");
        out.println("The chests are a standard size to fit in the ship's cargo area.");
        out.println("Every chest requires 9 boards.\n");
        out.println("What is today's price for boards in silver pieces? ");
        int pricePerBoard = keyboard.nextInt();
        keyboard.skip("\n");
        int pricePerChest = boardsPerChest * pricePerBoard;
        out.println("The cost per chest is " + pricePerChest + " silver pieces for boards.\n");
        out.println("Each chest also requires lock hardware.");
        out.println("What is today's price for locks, in silver pieces? ");
        int pricePerLock = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many silver pieces does Lady Ching wish to invest in building chests? ");
        int amtToInvest = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        int ChestTotal = pricePerChest + pricePerLock;
        int amtCreated = amtToInvest / ChestTotal;
        int leftover = amtToInvest - (amtCreated * ChestTotal);
        out.println("That will pay for the creation of " + amtCreated + " chests.");
        out.println("Left over silver pieces: " + leftover);
    }
}

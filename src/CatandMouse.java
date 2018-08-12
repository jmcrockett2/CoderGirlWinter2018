import static java.lang.System.out;
import java.util.Scanner;

public class CatandMouse
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("You area  small, hungry field mouse. You find yourself standing in a mouse hole in the");
        out.println("kitchen of a farm house. In the room is a bowl of cat food that smells really tasty. A");
        out.println("young cat is sleeping on a rug in the middle of the room.\n");
        out.println("Looking around the room, you see a wooden table with chairs, a metal floor lamp, and");
        out.println("curtains over a window. You can smell a summer breeze blowing in.\n");
        out.println("Where do you go? Options: chair table lamp food curtain");
        String dest = keyboard.nextLine();


        if (dest.equals("chair"))
        {
            out.println("You sneak quietly to the chair and climb its rough wood. The only place you can reach");
            out.println("from here is the table, so you climb it too. Looking around from the table, you see two");
            out.println("paths. You can walk across the countertop to the open window, or you can clim down");
            out.println("the table leg to the floor.\n");
            out.println("Where do you go? Options: window floor");
            String chairDest = keyboard.nextLine();
            if (chairDest.equals("window"))
            {
                out.println("You climb out the window and down. The tall grass hides you well. You find some tasty");
                out.println("spilled grain. By the time you get to the barn, you are well fed, and ready to take a nap");
                out.println("in the hay. There is no cat in the barn. You're a happy mouse. (The End)");
            }
            if (chairDest.equals("floor"))
            {
                out.println("You try to climb down the table leg but it's too slippery. Thump! You hit the floor with a");
                out.println("bang. The cat wakes up an chases you around the kitchen.! You race back to your hole,");
                out.println("still hungry, and hide for the rest of the day. (The End)");
            }
        }

        if (dest.equals("table"))
        {
            out.println("You sneak quietly to the table. The legs are polished and slippery, and you fall with a");
            out.println("thump when you try to climb up. The cat woke up! He chases you around the kitchen");
            out.println("and back into the mouse hole! Exhausted and hungry, you give up for the day. (The");
            out.println("End)");
        }
        if (dest.equals("lamp"))
        {
            out.println("You sneak quietly over to the lamp and try to climb it. The lamp buzzes slightly under");
            out.println("your paws, and the light turns on with a click! The cat heard the lamp turn on and snaps");
            out.println("awake. He chases you around the kitchen and back into your hole! (The End)");
        }
        if (dest.equals("food"))
        {
            out.println("You sneak over to the cat's food dish. There's one piece of food on the floor and more");
            out.println("in the dish. You're very hungry.\n");
            out.println("What do you eat? Options: floor dish");
            String foodDest = keyboard.nextLine();
            if (foodDest.equals("floor"))
            {
                out.println("You eat a large, tasty piece of cat food that was dropped on the floor. You were very");
                out.println("quiet. The cat hasn't woken up yet.\n");
                out.println("Where do you go next? Options: dish curtain");
                String floorDest = keyboard.nextLine();
                if (floorDest.equals("dish"))
                {
                    out.println("The cat food rattles loudly as you climb into the cat food dish. The cat wakes up! And");
                    out.println("he knows exactly where you are. He's on you in an instant! You are lunch. :( We'll be");
                    out.println("sure to notify your next of kin. (The End)");
                }
                if (floorDest.equals("curtain"))
                {
                    out.println("You quietly sneak over to the curtain. The cat wakes up slow and groggy. You've");
                    out.println("already made it to the curtain by the time he notices you. With a burst of well-fed");
                    out.println("strength, you race up the curtain and leap out the open window! Behind you, you hear");
                    out.println("the thump of the cat hitting the window frame and not making it through.\n");
                    out.println("You follow a grain trail to the barn and find some warm hay to hide in for a nap. There");
                    out.println("is no cat in the barn. You're a happy mouse! (The End)");
                }
            }
            if (foodDest.equals("dish"))
            {
                out.println("The cat food rattles loudly as you climb into the cat food dish. The cat wakes up! And");
                out.println("he knows exactly where you are. He's on you in an instant! You are lunch. :( We'll be");
                out.println("sure to notify your next of kin. (The End)");
            }
        }
        if (dest.equals("curtain"))
        {
            out.println("You sneak quietly across the room to the long curtains hanging by the window. The");
            out.println("curtains are an easy climb. The cat is still asleep. You smell a barn just outside.\n");
            out.println("Where do you go? Options: down window");
            String curtainDest = keyboard.nextLine();
            if (curtainDest.equals("down"))
            {
                out.println("As you climb back down the curtain, the cat stretches and looks around the room. He");
                out.println("notices the curtain hanging strangely and comes over to investigate. You have barely a");
                out.println("moment to race back into your hole and try again tomorrow. (The End)");
            }
            if (curtainDest.equals("window"))
            {
                out.println("You smell a barn nearby with fresh grain. You climb through the window and hide in the");
                out.println("tall grass. There's spilled grain here that makes a tasty treat. By the time you reach the");
                out.println("barn, you are well fed, and find a quiet spot in the hay for a nap. There is no cat in the");
                out.println("barn. You're a happy mouse! (The End)");
            }
        }
    }
}

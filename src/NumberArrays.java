import java.text.DecimalFormat;

import static java.lang.System.out;

public class NumberArrays
{
    public static void main(String[] args)
    {
        int[] high1 = {91, 90, 92, 79, 80, 85, 88};
        int[] high2 = {88, 90, 90, 91, 85, 83, 70};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        out.println("Week 1 High Temperatures");
        for(int index = 0; index < 6; index++)
        {
            out.print(high1[index] + ", ");
        }
        out.println(high1[6] + "\n");

        out.println("Week 2 High Temperatures");
        for(int index = 0; index < 6; index++)
        {
            out.print(high2[index] + ", ");
        }
        out.println(high2[6] + "\n");

        DecimalFormat df = new DecimalFormat("##");

        int sum1 = 0;
        for (int index = 0; index < high1.length; index++)
        {
            sum1 += high1[index];
        }

        float average1 = sum1 / (float)high1.length;
        out.println("The average daily-high temperature for week 1 is " + df.format(average1) + ".");

        int sum2 = 0;
        for (int index = 0; index < high2.length; index++)
        {
            sum2 += high2[index];
        }

        float average2 = sum2 / (float)high1.length;
        out.println("The average daily-high temperature for week 1 is " + df.format(average2) + ".");

        int highest1 = high1[0];
        String day1 = days[0];
        for(int index = 0; index < high1.length; index++)
        {
            if (high1[index] > highest1)
            {
                highest1 = high1[index];
                day1 = days[index];
            }
        }
        out.println("In week 1, " + day1 + " was warmest, at " + highest1 + " degrees.");

        int highest2 = high2[0];;
        String day2 = days[0];
        for(int index = 0; index < high2.length; index++)
        {
            if(high2[index] > highest2)
            {
                highest2 = high2[index];
                day2 = days[index];
            }
        }
        out.println("In week 2, " + day2 + " was warmest, at " + highest2 + " degrees.");
    }
}

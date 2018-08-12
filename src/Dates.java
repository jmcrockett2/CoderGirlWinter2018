import static java.lang.System.out;


public class Dates
{
    // --- add methods here to make the program work ---

    // formatNumberAsTwoDigits
    public static String formatNumberAsTwoDigits(int number)
    {
      if (number < 10)
      {
          return "0" + number;
      }
      else
      {
          return "" + number;
      }
    }

    // nameFormat
    public static String nameFormat(int year, int month, int day)
    {
        if(month == 1)
        {
            return "January " + day + ", " + year;
        }
        if(month == 2)
        {
            return "February " + day + ", " + year;
        }
        if(month == 3)
        {
            return "March " + day + ", " + year;
        }
        if(month == 4)
        {
            return "April " + day + ", " + year;
        }
        if(month == 5)
        {
            return "May " + day + ", " + year;
        }
        if(month == 6)
        {
            return "June " + day + ", " + year;
        }
        if(month == 7)
        {
            return "July " + day + ", " + year;
        }
        if(month == 8)
        {
            return "August " + day + ", " + year;
        }
        if(month == 9)
        {
            return "September " + day + ", " + year;
        }
        if(month == 10)
        {
            return "October " + day + ", " + year;
        }
        if(month == 11)
        {
            return "November " + day + ", " + year;
        }
        if(month == 12)
        {
            return "December " + day + ", " + year;
        }
        return "";
    }

    // slashFormat
    public static String slashFormat(int year, int month, int day)
    {
        String monthStr = formatNumberAsTwoDigits(month);
        String dayStr = formatNumberAsTwoDigits(day);
        return monthStr + "/" + dayStr + "/" + year;
    }
    // dashFormat
    public static String dashFormat(int year, int month, int day)
    {
        String monthStr = formatNumberAsTwoDigits(month);
        String dayStr = formatNumberAsTwoDigits(day);
        return year + "-" + monthStr + "-" + dayStr;
    }

    // --- end of your work area ---

    // don't change this code.
    public static void printDate(int year, int month, int day)
    {
        System.out.println(nameFormat(year, month, day));
        System.out.println(slashFormat(year, month, day));
        System.out.println(dashFormat(year, month, day));
        System.out.println();
    }

    // don't change this code.
    public static void main(String[] args)
    {
        System.out.println(formatNumberAsTwoDigits(3));
        System.out.println(formatNumberAsTwoDigits(9));
        System.out.println(formatNumberAsTwoDigits(10));
        System.out.println(formatNumberAsTwoDigits(12));
        System.out.println();

        printDate(2014, 10, 4);
        printDate(2015, 1,1);
        printDate(2013, 12,31);
        printDate(1987, 11,10);
    }
}

import static java.lang.System.out;



public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("1600 is a leap year: " + isLeapYear(1600));
        System.out.println("2000 is a leap year: " + isLeapYear(2000));
        System.out.println("2400 is a leap year: " + isLeapYear(2400));
        System.out.println("1988 is a leap year: " + isLeapYear(1988));
        System.out.println("1996 is a leap year: " + isLeapYear(1996));
        System.out.println("2004 is a leap year: " + isLeapYear(2004));
        System.out.println("4000 is a leap year: " + isLeapYear(4000));
        System.out.println("1800 is a leap year: " + isLeapYear(1800));
        System.out.println("1900 is a leap year: " + isLeapYear(1900));
        System.out.println("2200 is a leap year: " + isLeapYear(2200));
        System.out.println("1987 is a leap year: " + isLeapYear(1987));
        System.out.println("1999 is a leap year: " + isLeapYear(1999));
        System.out.println("2006 is a leap year: " + isLeapYear(2006));
    }

}

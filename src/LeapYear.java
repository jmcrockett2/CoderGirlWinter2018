import static java.lang.System.out;



public class LeapYear
{
    private static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0);
    }

    public static void main(String[] args)
    {
        out.println("1600 is a leap year: " + isLeapYear(1600));
        out.println("2000 is a leap year: " + isLeapYear(2000));
        out.println("2400 is a leap year: " + isLeapYear(2400));
        out.println("1988 is a leap year: " + isLeapYear(1988));
        out.println("1996 is a leap year: " + isLeapYear(1996));
        out.println("2004 is a leap year: " + isLeapYear(2004));
        out.println("4000 is a leap year: " + isLeapYear(4000));
        out.println("1800 is a leap year: " + isLeapYear(1800));
        out.println("1900 is a leap year: " + isLeapYear(1900));
        out.println("2200 is a leap year: " + isLeapYear(2200));
        out.println("1987 is a leap year: " + isLeapYear(1987));
        out.println("1999 is a leap year: " + isLeapYear(1999));
        out.println("2006 is a leap year: " + isLeapYear(2006));
    }

}

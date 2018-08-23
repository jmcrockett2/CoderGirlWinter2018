import static java.lang.System.out;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        int number = 1;
        out.println(number);

        while (number < 100)
        {
            number++;
            if(number % 5 == 0 && number % 3 == 0)
            {
                out.println("fizzbuzz");
            }
            else if(number % 3 == 0) {
                out.println("fizz");
            }
            else if(number % 5 == 0)
            {
                out.println("buzz");
            }
            else
            {
                out.println(number);
            }
        }
    }
}

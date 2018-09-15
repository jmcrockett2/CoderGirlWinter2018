import static java.lang.System.out;

public class LettersToNumbers
{
        public static void main(String[] args)
        {
            int nums[] = { 89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33 };

            for(int index = 0; index < nums.length; index++)
            {
                char ascii = (char) nums[index];
                out.print(ascii);
            }
        }
}

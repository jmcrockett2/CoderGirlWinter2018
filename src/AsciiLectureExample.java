import static java.lang.System.out;

public class AsciiLectureExample
{
    public static void main(String[] args)
    {
        int nums[] = { 67, 97, 116, 115, 32, 97, 114, 101, 32, 102, 117, 114, 114, 121, 33 };

        for(int index = 0; index < nums.length; index++)
        {
            char letter = (char) nums[index];
            out.print(letter);
        }
        out.println();
    }
}

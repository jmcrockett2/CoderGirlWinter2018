import static java.lang.System.out;

public class ArrayPractice
{
    private static int maxArray(int[] array)
    {
        int max = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] a1 = {4, 6, 0 , -3, 2, 11};
        int[] a2 = new int[3];
        a2[0] = 4;
        a2[1] = 9;
        a2[2] = 2;

        int max1 = maxArray(a1);
        int max2 = maxArray(a2);
        out.println(max1);
        out.println(max2);
    }
}

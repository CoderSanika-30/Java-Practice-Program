import java.util.*;

public class Sum_all{
    public static void main (String [] args)
    {
        Vector<Integer> v = new Vector <>(Arrays.asList(10,20,30,40,50));
        int sum=0;
        for (int i : v)
        {
            sum += i;
        }
        System.out.println("Sum of all elements:"+sum);
    }
}
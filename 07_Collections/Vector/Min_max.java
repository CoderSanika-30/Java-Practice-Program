import java.util.*;

public class Min_max{
    public static void main (String[]args)
    {
        Vector <Integer> v = new Vector <>(Arrays.asList(23,49,9,23,35,90,43));
        int max=Collections.max(v);
        int min=Collections.min(v);
        System.out.println("Maximum Element:"+max+" Minimum Element:"+min);

    }
}
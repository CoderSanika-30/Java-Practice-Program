import java.util.*;

public class Remove_dupli{
    public static void main (String[]args)
    {
        Vector <Integer> v1 = new Vector <>(Arrays.asList(2,34,56,34,56,56,97));
        Vector <Integer> v2= new Vector <>();
        for(int i : v1)
        {
            if(!v2.contains(i))
            {
                v2.add(i);
            }
        }
        System.out.println("Vector without duplicates:"+v2);
    }
}
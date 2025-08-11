import java.util.*;

public class Remove_ele{
    public static void main (String [] args)
    {
        Vector <Integer> v = new Vector <Integer> (Arrays.asList(10,20,30,40,50));
        v.remove(1);
        System.out.println("Vector after removing element:"+v);
    }
}

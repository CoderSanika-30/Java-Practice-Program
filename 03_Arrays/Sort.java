import java.util.*;

public class Sort{
    public static void main (String [] args)
    {
        Vector <Integer> v = new Vector<>(Arrays.asList(100,2000,300,4,50));
        Collections.sort(v);
        System.out.println("Sorted vector:"+v);
    }
}
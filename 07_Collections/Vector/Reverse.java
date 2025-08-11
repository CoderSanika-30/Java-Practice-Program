import java.util.*;

public class Reverse{
    public static void main (String [] args)
    {
        Vector <Integer> v = new Vector<>(Arrays.asList(10,20,30,40,50));
        Collections.reverse(v);
        System.out.println("Reverse vector:"+v);
    }
}
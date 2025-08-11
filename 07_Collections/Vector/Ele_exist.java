import java.util.*;

public class Ele_exist{
    public static void main (String [] args)
    {
        Vector <Integer> v = new Vector <>(Arrays.asList(10,20,30,40,50));
        if(v.contains(60))
        {
            System.out.println("Yes exist");
        }
        else{
            System.out.println("Not exist");
        }
    }
}
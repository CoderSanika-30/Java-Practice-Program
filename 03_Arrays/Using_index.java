import java.util.*;
public class Using_index{
    public static void main (String []args)
    {
        Vector <Integer> v = new Vector <>(Arrays.asList(10,20,30,40));
        
        for(int i=0 ; i < v.size(); i++)
        {
            System.out.println("Element at index:"+i +"is "+v.get(i));
        }
    }
}
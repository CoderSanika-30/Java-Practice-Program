import java.util.*;

public class RemoveDuplicate{
    public static void main(String[]args)
    {
        ArrayList <Integer> Contain_dupli = new ArrayList<>(Arrays.asList(23,45,56,78,34,23,56,78,45));
        ArrayList <Integer> No_dupli = new ArrayList<>();
        for(Integer i : Contain_dupli)
        {
            if(!No_dupli.contains(i))
            {
                No_dupli.add(i);
            }
            
        }
        System.out.println(No_dupli);
    }
}
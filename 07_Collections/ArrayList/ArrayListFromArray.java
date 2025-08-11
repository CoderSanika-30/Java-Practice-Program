import java.util.*;
class ArrayListFromArray {
    public static void main (String[] args)
    {
       Integer [] arr = {10,34,34,54,56,78,98};

       ArrayList <Integer> list = new ArrayList<>(Arrays.asList(arr));

       System.out.println(list);

        

        
    }
}
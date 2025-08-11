import java.util.*;

public class Traverse{
    public static void main (String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size=in.nextInt();
        int [] arr = new int [size];
         System.out.println("Enter Array Elements");
        for (int i=0 ; i < size; i++)
        {
            arr[i]=in.nextInt();
        }
         System.out.println(" Array Elements are:");

        for (int i: arr)
        {
            System.out.print("\t"+i);
        }
    }
}
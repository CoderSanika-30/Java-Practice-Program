import java.util.*;

public class Reverse_arr{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter size of an array");
        int size = in.nextInt();

        int [] arr= new int [size];

        for (int i =0 ; i <size; i++)
        {   
            System.out.println("Enter element at index:"+i);
            arr[i]=in.nextInt();
        }
        System.out.println("Array Elements:");
        for (int i: arr)
        {
            System.out.print(i+"\t");
        }
        System.out.println("\nReverse Array Elements:");
        for (int i=size-1;i>=0; i--)
        {
             System.out.print(arr[i]+"\t");
        }
    }
}
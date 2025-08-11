import java.util.*;

public class Copy_Array{
    public static void main(String [] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter size of an array");
        int size=in.nextInt();

        int []arr = new int [size];
        int []copy=new int[size];

        for (int i =0 ; i < size ; i++)
        {
            System.out.println("Enter element at index:"+i);
            arr[i]=in.nextInt();
            copy[i]=arr[i];
        }
        System.out.println("Original Array Elements");
        for (int i=0 ; i <size; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nCopied Array Elements");
        for (int i=0 ; i <size; i++)
        {
            System.out.print(copy[i]+" ");
        }

        

        
    }
}
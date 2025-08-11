import java.util.*;

public class Swap_2_elements{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter aaray size");
        int size=in.nextInt();

        int arr[] = new int [size];

        for (int i=0 ; i < size ; i++)
        {   System.out.println("Enter array elements at index:"+i);
            arr[i]=in.nextInt();

        } 
        System.out.println("Array elements before swapping are:");
        for (int i=0 ; i <size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("/nEnter two indices to swap:");
        int x=in.nextInt();
        int y= in.nextInt();
        int temp=0;
        temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        System.out.println("Array elements before swapping are:");
        for (int i=0 ; i <size ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
} 
import java.util.*;

public class Max_Min_Arr{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter array size");
        int size=in.nextInt();
        int [] arr = new int [size];
        int max=0,min=0;

        for (int i=0 ; i < size;i++)
        {   
            System.out.println("Enter element at index:"+i);
            arr[i]=in.nextInt();
            
            
        }
        max=min=arr[0];
        System.out.println("Array Elements are:");
        for(int i : arr)
        {   
            System.out.println(i);
            if(i>max)
            {
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
        }
        System.out.println("Minimum element from array:"+min);
        System.out.println("Maximum element from array:"+max);
    }
}
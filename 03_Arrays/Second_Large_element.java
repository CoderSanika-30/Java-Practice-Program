import java.util.*;

public class Second_Large_element
{
    public static void main (String[] args)
    {
        Scanner in= new Scanner (System.in);

        System.out.println("Enter size of an array:");
        int size=in.nextInt();

        int [] arr = new int [size];
        for(int i=0 ; i < size ; i++)
        {
            System.out.println("Enter elements at index:"+i);
            arr[i]=in.nextInt();
        }
        int max=0,index=0;
        for (int i=0 ; i < size ; i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        System.out.println("First Largest Element of array:"+max);
        arr[index]=0;
        max=0;
        for (int i=0 ; i < size ; i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Second Largest Element of array:"+max);

    }
}
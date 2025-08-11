import java.util.*;

class Second_Large_element1{
    public static void main (String []args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter size of an array");
        int size = in.nextInt();

        int [] arr = new int [size];

        for (int i=0 ; i < size ; i++)
        {   System.out.println("Enter element at index:"+i);
            arr[i]=in.nextInt();
        }
       int max1=arr[0];
       int max2=arr[1];

       if(max2>max1)
       {
        max1=max2;
        max2=arr[0];
       }

       for (int i=2 ; i < size ;i++)
       {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
       }
       System.out.println("Largest:"+max1+"\nSecond_Largest:"+max2);
    }
    
}
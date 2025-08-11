import java.util.*;

class Linear_Search{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter size of an array:");
        int size=in.nextInt();

        int [] arr = new int [size];
        
        for (int i=0 ; i < size ; i++)
        {
            System.out.println("Enter  element at index:"+i);
            arr[i]=in.nextInt();
            
        }
        System.out.println("Enter target element");
        int target=in.nextInt();
        for (int i=0 ; i < size ; i++)
        {
            
            if(arr[i]==target)
            {
                System.out.println(arr[i] + " Found at :"+i);
                break;
            }
        }
    }
}
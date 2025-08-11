import java.util.*;

public class Left_Right_Rotate_array{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size= in.nextInt();
        int [] arr = new int [size] ;

        for(int i=0 ; i < size; i++)
        {   
            System.out.println("Enter array element at index:"+i);
            arr[i]=in.nextInt();
        }
        int temp_left=arr[0];
        
        System.out.println("Array Elemrnts Before left shift:");

        for (int i=0 ; i <size ; i++)
         {
            System.out.print(arr[i]+" ");
         }
        //  left shift
        for (int i=0; i <size-1 ; i++)
        {   
           
            
                arr[i]=arr[i+1];
               
            
        } arr[size-1]=temp_left;

        System.out.println("\nArray Elemrnts after left shift:");

         for (int i=0 ; i <size ; i++)
         {
            System.out.print(arr[i]+" ");
         }
        // right shift
        int temp_right=arr[size-1];
         for (int i=size-1; i>0 ; i--)
        {   
           
            
                arr[i]=arr[i-1];
               
            
        } arr[0]=temp_right;

        System.out.println("\nArray Elemrnts after right shift:");
        for (int i=0 ; i <size ; i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
}
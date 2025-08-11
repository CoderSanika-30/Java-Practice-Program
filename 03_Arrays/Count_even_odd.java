import java.util.*;

public class Count_even_odd{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=in.nextInt();
        int even_count=0,odd_count=0;
        int [] arr = new int [size];
        for (int i=0 ; i < size ; i++){
            arr[i]=in.nextInt();
            if(arr[i]%2==0)
            {
                even_count++;
            }
            else{
                odd_count++;
            }
         } 

        System.out.println("Even num :"+even_count);
        System.out.println("Odd num :"+odd_count);
    }
}
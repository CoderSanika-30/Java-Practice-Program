import java.util.*;

public class IsPallindrome{
    public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter size of an array");
    int size=in.nextInt();
    int arr[]= new int [size];
    int rev[]= new int [size];
    int x=1;

    for (int i =0; i<size; i++)
    {   
        System.out.println("Enter aaray elements at index:"+i);
        arr[i]=in.nextInt();
    }

    for (int i=0; i<size;i++)
    {
        rev[i]=arr[size-1-i];
    }
    for(int i=0 ; i < size; i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i=0 ; i < size; i++)
    {
        System.out.print(rev[i]+" ");
    }
    for (int i=0 ; i <size;i++)
    {
        if(arr[i]!=rev[i])
        {
            x=0;
            break;
        }
        

    }
    
    System.out.println("\n"+ (x==1?"Equal":"Not_equal"));
    }
}
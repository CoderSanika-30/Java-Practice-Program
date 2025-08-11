import java.util.*;
public class Count_digit{
    public static void main (String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=in.nextInt();
        int count=0;

        int [] arr = new int [size];
        int [] c=new int[size];

        for (int i=0 ; i < size; i++)
        {
            System.out.println("Enter elemnts at index:"+i);
            arr[i]=in.nextInt();
        }

        for (int i=0 ; i <size; i++)
        {   int num= arr[i];
            count=0;
            while(num!=0)
            {
                num=num/10;
                count++;
            }
            c[i]=count;
        }
        for (int i=0 ; i <size; i++)
        {
            System.out.print(c[i]+" ");
        }



    }
}
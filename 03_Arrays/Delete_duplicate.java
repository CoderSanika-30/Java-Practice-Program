import java.util.*;
public class Delete_duplicate
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter array size");
        int size= in.nextInt();

        int [] arr = new int [size];
        boolean [] visited= new boolean[size];
        int [] unique_array=new int [size];
        int k=0;

        for (int i =0 ; i < size ; i++)
        {
            System.out.println("Enter element at index:"+i);
            arr[i]=in.nextInt();
        }

        for(int i=0 ; i <size ; i++)
        {   
            if(visited[i])continue;
            else
            {unique_array[k]=arr[i];
             k++;
            }
            for (int j=0 ; j<size ; j++)
            {
                if (arr[i]==arr[j])
                {
                    visited[j]=true;
                }

            }
            

        }
        for(int i=0 ;i<k;i++ )
        {
            System.out.print(unique_array[i]+" ");
        }


    }
}
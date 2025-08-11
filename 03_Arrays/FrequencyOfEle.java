import java.util.*;

public class FrequencyOfEle{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter array size");
        int size= in.nextInt();

        int [] arr = new int [size];
        boolean [] visited  =new boolean [size];

        for (int i=0; i < size ; i++)
        {
            System.out.println("Enter element at index:"+ i);
            arr[i]=in.nextInt();

        }
        for (int i=0 ; i < size ; i++)
        {   
            if(visited[i]) continue;
            int count=1;
            for (int j=i+1; j < size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
        
        
            

    }


}

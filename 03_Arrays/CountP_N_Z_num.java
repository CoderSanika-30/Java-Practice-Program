import java.util.*;

public class CountP_N_Z_num{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int size= in.nextInt();

        int []arr= new int [size];
        int pcount=0,ncount=0,zcount=0;

        for (int i=0 ; i < size ; i++)
        {
            arr[i]=in.nextInt();
            if(arr[i]>0)
            {
                pcount++;
            }
            else if (arr[i]<0)
            {
                ncount++;
            }
            else{
                zcount++;
            }
        }
        System.out.println("Positive Elements:"+pcount);
        System.out.println("Negative Elements:"+ncount);
        System.out.println("Zero Elements:"+zcount);


    }
}
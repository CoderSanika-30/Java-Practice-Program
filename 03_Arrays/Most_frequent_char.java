import java.util.*;

class Most_frequent_char{
    public static void main (String[] args)
    {
        Scanner in= new Scanner (System.in);
        System.out.println("Enter String");
        String s1= in.nextLine();
        s1=s1.toLowerCase();
        boolean [] visited = new boolean[s1.length()];
        int [] arr= new int[s1.length()];
        
        for (int i=0 ; i< s1.length(); i++)
        {   
            int count=0;
            for(int j=0 ; j < s1.length();j++)
            {   
                if(!visited[i])
                {
                        if(s1.charAt(i)==s1.charAt(j))
                        {
                            visited[j]=true;
                            count++;
                        }
                }
                
            }

            arr[i]=count;
        }
        int max=0;
        for(int i: arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int index=0;
        for (int i=0 ; i<arr.length;i++)
        {
            if(max==arr[i])
            {
                index=i;
                break;
            }
        }
        System.out.println(s1.charAt(index)+":"+max);
        
    }
}
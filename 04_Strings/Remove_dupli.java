import java.util.*;

public class Remove_dupli{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String s1=in.nextLine();
        String s2="";

        for (int i=0 ; i < s1.length();i++ )
        {
            if(s2.indexOf(s1.charAt(i))==-1)
            {
                s2 += s1.charAt(i);
            }
        }
        System.out.println("Unique String:"+s2);
    }
}
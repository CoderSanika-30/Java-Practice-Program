import java.util.*;

public class Count_vowel_consonants{
    public static void main (String [] args)
    {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter String");
        String s2=in.nextLine();
        s2=s2.toLowerCase();
        int vcount=0,ccount=0;
        for (int i=0 ; i <s2.length();i++)
        {
            if (s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
            {
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("Vowels:"+vcount+" Consonants:"+ccount);
    }
}
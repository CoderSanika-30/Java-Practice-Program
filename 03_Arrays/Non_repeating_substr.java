import java.util.*;

public class Non_repeating_substr{
    public static void main (String [] args)
    {
        String str="aabscsabd";
        int max_length=0;
        int left=0;

        Hashset<Character> set= new Hashset<>();
        for (int right=0; right<str.length();right++)
        {
            while(set.contains(str.charAt(right)))
            {
                set.remove(str)
            }
        }
    }
}
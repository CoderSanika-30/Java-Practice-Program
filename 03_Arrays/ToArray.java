import java.util.*;
class ToArray{
    public static void main (String[] args)
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(500);
        list.add(850);
        list.add(150);
        list.add(250);
        list.add(590);
        list.add(510);
        list.add(550);
        Integer [] num =list.toArray(new Integer[0]);
        for(int i : num)
        {
            System.out.println(i);
        }                                                                                                                                                                                                     

        
    }
}
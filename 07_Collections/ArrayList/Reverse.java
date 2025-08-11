import java.util.*;
class Reverse{
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

        System.out.println("Original List:"+list);
        
        
        Collections.reverse(list);
        System.out.println("Reverse List:"+list);

        
    }
}
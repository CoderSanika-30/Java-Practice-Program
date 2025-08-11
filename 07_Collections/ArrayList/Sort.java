import java.util.*;
class Sort{
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

        System.out.println("Before Sorting:"+list);
        Collections.sort(list);
        System.out.println("Ascending Sorting:"+list);
        Collections.reverse(list);
        System.out.println("Descending Sorting:"+list);

        
    }
}
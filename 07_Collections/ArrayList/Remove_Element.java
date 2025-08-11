import java.util.*;

class Remove_Element{
    public static void main(String [] args)
    {
        ArrayList <String> list = new ArrayList<>();
        list.add("Sanika");
        list.add("Shraddha");
        list.add("Gayatri");
        list.add("Shweta");
        list.add("Riya");

        list.remove(1);
        list.remove("Riya");
        list.add("Shraddha");
        list.add("Riya");

        System.out.println(list);
    }
}
import java.util.*;
public class Prog10 
{
    public static void main(String[]args)
    {
        TreeMap<Integer, String>map=new TreeMap<Integer, String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        // 1st <----------------------------------->
        Collection<Integer> keys=map.keySet();
        ArrayList<Integer>list=new ArrayList<Integer>(keys);
        Collections.reverse(list);
        System.out.println(list);
        // 2nd <-------------------------------------->
        System.out.println(map.descendingKeySet());

    }
    
}

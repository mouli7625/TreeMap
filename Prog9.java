import java.util.*;
public class Prog9 
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
        int great=0, least=0;
        great=list.get(0);
        least=list.get(list.size()-1);
        System.out.println("Greatest Key "+great);
        System.out.println("Least key "+least);
        // 2st <----------------------------------->
        System.out.println("Greatest Key "+ map.firstKey());
        System.out.println("Greatest Key "+ map.lastKey());
    } 
}

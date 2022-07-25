import java.util.*;
public class Prog7 
{
    public static void main(String[]args)
    {
        TreeMap<String, String>map=new TreeMap<String, String>(new sort_key());
        map.put("1", "Mouli");
        map.put("4","CSE");
        map.put("2", "Bhtangar");
        System.out.println(map);
    }
    
}
class sort_key implements Comparator<String>{
    public int compare(String n, String m)
    {
        return n.compareTo(m);
    }
}

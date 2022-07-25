import java.util.*;
public class Prog3 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        TreeMap<Integer,String>map=new TreeMap<Integer, String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(9));
    }
    
}

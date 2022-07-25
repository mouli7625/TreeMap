import java.util.*;
public class Prog12 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer, String >map=new TreeMap<Integer,String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        map.put(3,"B.Tech");
        System.out.println(map.floorEntry(1));
        System.out.println(map.floorEntry(5));
    }
    
}

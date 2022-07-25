import java.util.*;
public class Prog11 
{
    public static void main(String[]args)
    {
        TreeMap<Integer, String>map=new TreeMap<Integer,String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        map.put(3,"B.Tech");
        System.out.println("Value for entry 1 = "+map.floorKey(1));
        System.out.println("Value for entry 5 = "+map.floorKey(5));
    }

    
}

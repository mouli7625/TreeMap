import java.util.*;
public class Prog6 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        TreeMap<Integer, String>map=new TreeMap<Integer, String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        System.out.println("Map before deleting");
        System.out.println(map);
        System.out.println("Map after deleting");
        map.clear();
        System.out.println(map);

    }
    
}

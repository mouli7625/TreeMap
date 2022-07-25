import java.util.*;
class Prog2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        TreeMap<Integer, String>map=new TreeMap<Integer, String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        System.out.println("1st map= "+map);
        TreeMap<Integer, String>newmap=new TreeMap<Integer, String>();
        newmap.put(3,"BTech");
        newmap.putAll(map);
        System.out.println("2nd Map= "+newmap);
    }
}
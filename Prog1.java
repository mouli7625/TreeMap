import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        TreeMap<Integer,String>map=new TreeMap<Integer, String>();
        map.put(1, "Mouli");
        map.put(2, "Bhtanagar");
        map.put(4, "19BCE10284");
        map.put(3, "CSE");
        for(Map.Entry<Integer, String>tm:map.entrySet())
        {
            System.out.println(tm.getKey()+" "+tm.getValue());
        }
    }
}
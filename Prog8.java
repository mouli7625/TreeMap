import java.util.*;
public class Prog8
{
    public static void main(String[]args)
    {
        int min=0, max=0;
        TreeMap<Integer, String>map=new TreeMap<Integer, String>();
        map.put(1, "Mouli");
        map.put(4,"CSE");
        map.put(2, "Bhtangar");
        // 1st logic <--------------------------------------->
        Collection<Integer> keys= map.keySet();
        ArrayList<Integer> list=new ArrayList<Integer>(keys);
        min=list.get(0);
        max=list.get(list.size()-1);
        for(Map.Entry<Integer, String>tm:map.entrySet())
        {
            if(tm.getKey()==min)
            {
                System.out.println("Value associated to lowest key "+tm.getKey()+"="+tm.getValue());
            }
            if(tm.getKey()==max)
            {
                System.out.println("Value associated to greatest key "+tm.getKey()+"="+tm.getValue());
            }
        }
        // 2nd Logic <------------------------------------------------------>
        System.out.println("Greatest key: " + map.firstEntry());
        System.out.println("Least key: " + map.lastEntry());
    } 
}
package Com.Programs;

import java.util.*;


public class ComparatorClass {

    public static void main(String[] args) {
       ArrayList<Integer> values1 = new ArrayList<>();
        values1.add(123);
        values1.add(221);
        values1.add(100);
        Collections.sort(values1,(o1, o2) -> {return o1%10>o2%10?1:-1;});
        System.out.println(values1);

        TreeMap<Integer,Integer> a = new TreeMap<>();
        a.put(1,20);
        a.put(100,2);
        a.put(1000,2000);
        Set<Map.Entry<Integer, Integer>> values = a.entrySet();
        System.out.println(values);

        Iterator it=values.iterator();

        while(it.hasNext()){
            Map.Entry j = (Map.Entry) it.next();
            System.out.println("iterator: "+j.getKey()+"------"+j.getValue());

        }
       /* for (Map.Entry<Integer, Integer>e:values
             ) {
            System.out.println(e.getKey()+"   "+ e.getValue()+"     "+e.getClass());
            
        }*/

        ListIterator l = values1.listIterator();
        System.out.println(l.getClass().getName());




    }
}

package Com.Programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterOccurrances {
    public static void main(String[] args) {
        String s = "test a ballll";
        char[] c1 = s.toCharArray();
        int[] i1 = {1,2,2,3,2,2,2,2,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
       // TreeMap<Character, Integer> tmap= new TreeMap<>();
        /*if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }*/
        for(int c : i1) hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);



        System.out.println(hm);
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("**********************************************");
      //sorted.ma;


        Optional<Map.Entry<Integer, Integer>> newmap = hm.entrySet().stream().min(Map.Entry.comparingByValue());
       int mainkey = newmap.get().getKey();
        System.out.println(mainkey);

        /*for(int i=0;i<i1.length;i++){
            if(i1[i]==mainkey){
                System.out.println(i);
            }
        }*/

    }
}

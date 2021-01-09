package Com.Programs;

import java.util.HashMap;
import java.util.stream.Stream;

public class NonRepetedValueInArray {

    public static void main(String[] args) {
        int[] arr = {4,2,2,3,3};
       /* int value=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i: arr) hmap.put(i,hmap.containsKey(i)?hmap.get(i)+1:1);
        for (int o : hmap.keySet()) {
            if (hmap.get(o).equals(1)) {
                value=o;
            }
        }
        System.out.println(value);*/

        int a = 0;
        for (int i : arr) {
            a ^= i;
        }
        System.out.println(a);
    }



}

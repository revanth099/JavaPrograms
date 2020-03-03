package Com.Programs;

import java.util.HashMap;
import java.util.Map;

public class LargestSequenceOfAllNumbers {

    public static void Largest(int[] a) {
        Map<Integer, Integer> hmap = new HashMap<>();

        int count = 1;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i + 1]) {

                count++;
            } else {
                if (hmap.get(a[i]) == null) {
                    hmap.put(a[i], count);

                }
                count = 1;
            }
            if (hmap.get(a[i]) != null) {
                if (hmap.get(a[i]) < count) {
                    hmap.put(a[i], count);
                }
            }


        }
        System.out.println(hmap);


    }

    public static void main(String[] args) {
        Largest(new int[]{1, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2});
    }


}


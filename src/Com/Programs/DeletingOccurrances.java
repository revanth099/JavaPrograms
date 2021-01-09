package Com.Programs;

import java.util.ArrayList;
import java.util.HashMap;

public class DeletingOccurrances {

    public static void DeleteOcc(int N, int[] a){

       HashMap<Integer, Integer> a1 = new HashMap<>();
        //ArrayList<Integer> a1=new ArrayList<>();
        int count=0;
        for (int num:a
             ) {
            a1.containsKey(num);
            if (a1.get(num)==null){
                a1.put(num,++count);
            }
            else{
                if (a1.get(num)<N){
                    a1.put(num,++count);
                }

            }

        }
        System.out.println(a1);




    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2,3,2,2,3};
        DeleteOcc(2,a);
    }

}

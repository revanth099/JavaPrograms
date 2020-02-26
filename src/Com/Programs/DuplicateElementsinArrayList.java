package Com.Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElementsinArrayList {

    public static void Duplicates(ArrayList<Integer> a){
        HashSet<Integer> hs = new HashSet<Integer>(a);
        ArrayList<Integer> a1 = new ArrayList<Integer>(hs);
        System.out.println(a1);


    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(9);
        a.add(3);
        a.add(4);
        Duplicates(a);


    }


}

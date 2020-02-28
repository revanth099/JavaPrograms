package Com.Programs;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LeaderNumbers {

    public static void Leader(int[] a){
       // Set<Integer> ar = new HashSet();
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i=0; i<a.length;i++){
            for (int j=i+1; j<a.length;j++){
                if((a[i]>a[j])){
                    if (!ar.contains(a[i])){
                    ar.add(a[i]);}

                }
                if (!(a[i]>a[j])){
                    break;
                }
            }
        }
        ar.add(a[a.length-1]);

        System.out.println(ar);
    }

    public static void main(String[] args) {
        int[] a = {14, 9, 11, 7, 8, 5, 3};
        Leader(a);
    }
}

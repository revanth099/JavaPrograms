package Com.Programs;

import java.util.ArrayList;

public class ArrayLeader {

    public static void Leader(int[] a){
        // Set<Integer> ar = new HashSet();
        ArrayList<Integer> ar = new ArrayList<>();
        int sum=0;

        for (int i=0; i<a.length;i++){
            sum=0;
            for (int j=i+1; j<a.length;j++){
                    sum += a[j];


                /*if((a[i]>a[j])){
                    if (!ar.contains(a[i])){
                        ar.add(a[i]);}

                }
                if (!(a[i]>a[j])){
                    if(ar.contains(a[i])){
                        ar.remove(ar.size()-1);
                    }
                    break;
                }*/
            }
            if (a[i]>sum){
                ar.add(a[i]);
            }
        }
        /*if(a[a.length-1]>0){
            ar.add(a[a.length-1]);}*/

        System.out.println(ar);
    }

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int[] a1 = {-36,-12,-27};
        //Leader(a);
        Leader(a1);
    }
}

package Com.Programs;

import java.util.HashMap;
import java.util.HashSet;

public class MaxNumberOfAccurances {

    public static void main(String[] args) {
        int a[] = {1,1,2,2,3,1,1,1,2,2,2,2};

        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 1;
        for(int i=0;i<a.length;i++){

            if(a[i]==a[i+1]){

                count++;

            }else{


                count=1;
            }






        }

    }
}

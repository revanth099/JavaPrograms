package Com.Programs;

import java.util.Arrays;

public class SplitArrayfor2EqualSums {

    public static void splitarray(int[] arr){
        int totalsum = 0;
        int equalsum=0;
        int sum=0;
        int k=0;

        for(int i:arr){
            totalsum+=i;
        }
        equalsum=totalsum/2;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(sum==equalsum){
                 System.out.println();

             }

        }
    }
}

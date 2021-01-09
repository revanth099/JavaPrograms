package Com.Programs;

import java.util.Arrays;
import java.util.HashMap;

public class LowestinArray {


    public static void main(String[] args) {
      int[] a = {1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1};
        String s = "";
        for (int n : a) {
            s += n;
        }
        char cr[] = s.toCharArray();
        System.out.println(s.length() / 2);
        int back = (s.length() / 2) - 1;
        int front = (s.length() / 2);
        for (int q = 0; q < s.length() / 2; q++) {
            for (int i = 0; i < s.length(); i++) {
                cr[i]= i == back||i == front?'*':cr[i];
                /*if (i == back) {
                    cr[i] = '*';
                }
                if (i == front) {
                    cr[i] = '*';
                }*/

            }
            System.out.println(cr);
            //System.out.println();
            back--;
            front++;
        }


        //Staircase problem

       /* int n = 6;
        int l = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= l) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }l--;
            System.out.println();
        }*/
      /* int[] ar = {1,2,3,4,5};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int[] res = new int[ar.length];
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<ar.length;j++){
               int q = i!=j ?res[i]+=ar[j]:res[i];
                *//*if(i!=j){
                    res[i]+=ar[j];
                }*//*
            }//System.out.println(res[i]);

        }

        Arrays.sort(res);



        System.out.println(res[0]+"-------------"+res[ar.length-1]);*/





    }



    }



package Com.Programs;

import jdk.nashorn.internal.objects.NativeArray;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoArraysToOne {

    public static void longest (String s1, String s2) {
        char [] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Set<Character> st = new HashSet<>();
        for (char c3:c1
             ) {
            st.add(c3);

        }
        for (char c4:c2
        ) {
            st.add(c4);

        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        longest("aretheyhere","yestheyarehere");
    }
}

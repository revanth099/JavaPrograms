package Com.Programs;

import java.util.*;

public class QueueOperations {


    public static void RemoveDuplicates(String s1){
        String[] s = s1.split(" ");
        String newword="";
        Set<String> hmap = new LinkedHashSet<>(Arrays.asList(s));
        System.out.println(hmap);
        for (String n:hmap
             ) {
            newword+=n+" ";

        }
        System.out.println(newword);

    }
    public static void main(String[] args) {
        String s1 = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";

        RemoveDuplicates(s1);


    }
}

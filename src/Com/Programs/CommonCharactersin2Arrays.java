package Com.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class CommonCharactersin2Arrays {

    public static void commoncharacters(char[] ch, char[] chr1){
        


      
        for(char c: ch){
            for (char c1 : chr1) {
                if(c==c1){
                System.out.println(c);}
            }
        }

    }



    public static void occurrences(char[] c){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (char c1:c
             ) {
            map.put(c1,map.containsKey(c1)?map.get(c1)+1:1);

        }
        System.out.println(map);
        //map.entrySet().stream().
    }
    public static void commoncharacters1(char[] chr,char[] chr1){
        occurrences(chr);
    }

    public static void main(String[] args) {
        char[] ch={'a','b','c'};
        char[] chr1={'a','c','d'};
        commoncharacters1(ch,chr1);
    }
}

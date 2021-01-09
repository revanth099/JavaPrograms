package Com.Programs;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public static void firstnonrepeatingchar(String str){
        LinkedHashMap<Character,Integer> lmap = new LinkedHashMap<>();
        char[] chr = str.toCharArray();
        for(char c1:chr){
            if (lmap.containsKey(c1)) {
                lmap.remove(c1);

            }else{
                lmap.put(c1,1);
            }

           // lmap.put(c1,lmap.containsKey(c1)?lmap.get(c1)+1:1);
        }
        System.out.println(lmap);

        System.out.println(lmap.entrySet().stream().findFirst().get());

    }

    public static void main(String[] args) {
        firstnonrepeatingchar("tesstbed");
    }
}

package Com.streams;

import java.util.HashMap;

public class LamadaFunctions {
    public static void main(String[] args) {
        String s = "schooleee";
        char[] c = s.toCharArray();
        System.out.println(s.equalsIgnoreCase("Tex4")?"fff":"tex222");
        System.out.println(s.equalsIgnoreCase("")?"s":s.equalsIgnoreCase("schooleee")?"elseblock":"test else");
        HashMap<Character, Integer> hmap = new HashMap<>();
        /*hmap.put("tom",2900);
        hmap.put("tex",4000);
        hmap.put("alex",3000);

        hmap.replaceAll((name,oldvalue)->name.equals("alex")?oldvalue:oldvalue+2000);
        System.out.println(hmap);*/

        for (char c1:c
             ) {
            hmap.put(c1, !hmap.containsKey(c1) ? 1 : hmap.get(c1) + 1);
        }
       /* for (char c1:c
             ) {
           int  integer = !hmap.containsKey(c1)?hmap.put(c1,1):hmap.put(c1,hmap.get(c1)+1);
           hmap.put(c1, !hmap.containsKey(c1) ? 1 : hmap.get(c1) + 1);


        }*/
        System.out.println(hmap);



    }
}

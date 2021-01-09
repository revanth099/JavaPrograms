package Com.Programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CharacterPrinting {

    public static void pattern(String s){
        int i1=0;
        String s2 = s.replaceAll("\\D",".");
        String s11 = s.replaceAll("\\d","-");
        System.out.println(s11);
        if(s11.charAt(0)!='-'){
            System.out.println(s11.charAt(0));

        }
        for (int i=0;i<s11.length();i++){

            if(s2.charAt(i)!='.'){
                i1 = Integer.parseInt(String.valueOf(s2.charAt(i)));
            }
            if(s11.charAt(i)=='-'){
                if(i1!=0){
                    while(i1>0){
                        System.out.print(s.charAt(i+1));
                        i1--;
                    }
                }

                System.out.println();

            }
            if(!(i+1>=s11.length())){
                if(((s11.charAt(i)>='A'&& s11.charAt(i)<='Z')||(s11.charAt(i)>='a'&& s11.charAt(i)<='z')) && s11.charAt(i+1)!='-'){
                    System.out.println(s11.charAt(i+1));
                }

            }

        }

    }

    public static void main(String[] args) {
       // String s = "5A5B3CD";
        pattern("5A5B3CD2rS");



    }
}

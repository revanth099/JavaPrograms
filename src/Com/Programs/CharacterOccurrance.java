package Com.Programs;

import javax.swing.*;
import java.util.HashMap;

public class CharacterOccurrance {

    public static  void CharacterCount(String s){

        HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
        //Converting the string to char array
        char[] chr = s.toCharArray();
        //Looping the char array and verifying with hashmap
        for(char c: chr){
            //Increasing the count for hashmap if the character is repeated
            if(hp.containsKey(c)){
                hp.put(c,hp.get(c)+1);
            }
            else{
                hp.put(c,1);
            }

        }
        System.out.println(s +" : "+ hp);
    }

    public static void main(String[] args) {
        CharacterCount("JavaaConceptoftheday");

    }


}

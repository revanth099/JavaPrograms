package Com.Programs;

import java.util.Arrays;

public class SortSentence {
    public static void sen(String a){
        String[] s = a.split(" ");
        for (int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if (s[i].length()>s[j].length()){
                    String temp = s[j];
                    s[j]=s[i];
                    s[i]=temp;
                }
            }

        }//System.out.println(Arrays.toString(s));
        String rev="";
        for (int i=0;i<s.length;i++){
            for (int j=0;j<s[i].length();j++){
                rev+=s[i].charAt(j);
            }rev+=" ";

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        sen("this is a work");
    }
}

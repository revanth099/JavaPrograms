package Com.Programs;

import javax.xml.transform.sax.SAXSource;

public class StringReverseWithSplChars {

    public static void SpecialChars(String a){
        a=a.toLowerCase();
        char[] a1 = new char[a.length()];

        for(int i=0;i<a1.length;i++){
            final char c1 = a.charAt(i);
            if(!((c1>='a') && (c1 <='z'))){
                a1[i]= a.charAt(i);
            }
        }
        for (int i=a.length()-1;i>=0;i--){
            if(a1[i]==1){

            }
        }











        /*StringBuilder r= new StringBuilder();
        char[] a1 = new char[a.length()];
        for (int i=a.length()-1;i>=0;i--){
            final char c = a.charAt((a.length() - 1) - i);
            if((c >='a') && (c <='z')){
               //r+=a.charAt(a.length()-1-i);
                r.append(a.charAt(i));
               // a1[a.length()-1-i]=a.charAt(i);
            }
            else{
                r.append(c);
            }


        }*/
       /* for (int i=a1.length-1;i>=0;i--){
            if()
        }*/


    }

    public static void main(String[] args) {
        SpecialChars("P@$$word");
    }
}

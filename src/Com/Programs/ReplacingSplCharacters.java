package Com.Programs;

public class ReplacingSplCharacters {

    public static String splchars(String str){
        String str1 = "";

        int k=0;
       for(int i=0;i<str.length();i++){
           if(!((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z'))){
               str1+=str.substring(k,i);
               k=i;
               k++;


           }
           else{
               str1+=str.charAt(i);

           }
       }


       return str1;
    }

    public static void main(String[] args) {
        System.out.println( splchars("turvo@test!"));
    }
}

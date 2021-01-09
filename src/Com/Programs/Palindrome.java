package Com.Programs;

public class Palindrome {

    public static void StringPalindrome(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        if(!reverse.equalsIgnoreCase(s)){
            s+=reverse;
            reverse="";
            for(int i=s.length()-1;i>=0;i--){
                reverse+=s.charAt(i);

            }



        }
        System.out.println(reverse);

    }

    public static void main(String[] args) {
       StringPalindrome("tat1");
    }
}

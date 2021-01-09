package Com.Programs;

public class CheckStringSentanceIsPalindrome {

    public static boolean isPalindrome(String str){
        String s1 = str.replaceAll("\\W","");
        //System.out.println(s1);
        int j=s1.length()-1;
        for (int i=0;i<s1.length();i++){

            boolean b = String.valueOf(s1.charAt(i)).equalsIgnoreCase(String.valueOf(s1.charAt(j)));
            if((i==j)||((j-i==1)&&b)){
                    System.out.println("this is palindrome");
                    return true;
                }

                if(!b){
                    System.out.println("not palindrome");
                    break;
                }
                j--;

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Test.:NNT:s,Et"));

    }
}

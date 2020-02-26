package Com.Programs;

public class ReversingEveryWord {
    public static String Reverse(String ar){
        String sd="";
        for (int i=ar.length()-1;i>=0;i--){
            sd+=ar.charAt(i);
        }

        return sd+" ";

    }
    public static void ReverseWord(String s){
        String[] sp = s.split(" ");
        String rev="";
       for (int i=0; i<sp.length;i++){

                rev+=Reverse(sp[i]);


        }


        System.out.println(rev);
    }

    public static void main(String[] args) {
        String s = "this is the main function";
        ReverseWord(s);
    }
}

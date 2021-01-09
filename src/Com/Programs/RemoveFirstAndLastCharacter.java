package Com.Programs;

public class RemoveFirstAndLastCharacter {

    public static void Remove(String s){
        String t="";
        for (int i=1;i<s.length()-1;i++){
        t+=s.charAt(i);


    }
        System.out.println(t);
}

    public static void main(String[] args) {
        Remove("laptop");
    }
}

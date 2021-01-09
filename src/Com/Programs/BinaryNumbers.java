package Com.Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BinaryNumbers {
    public static void numbers(int n){
        Set<Integer> s1 = new LinkedHashSet<>();
        String s ="";
        for (int i=0;i<=n;i++){
            int t=i%10;
            if(t==1 || t==0) {
                if (!(i > 9)) {
                    s1.add(i);
                }
                else{
                    s = Integer.toString(i);
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == '0' || s.charAt(j) == '1') {
                            s1.add(i);
                        }
                        else{
                            s1.remove(i);
                            break;
                        }
                    }
                }
            }


        }
        System.out.println(s1);

    }

    public static void main(String[] args) {
        numbers(1002);
    }
}

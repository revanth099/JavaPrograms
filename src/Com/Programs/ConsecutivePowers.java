package Com.Programs;

import java.util.ArrayList;

public class ConsecutivePowers {

    public static void Cpower(int a){
        double sum=0;

        ArrayList<Integer> a1 = new ArrayList<>();
        int a2 =0;
        while(a>0){
            a2 = a%10;
            a=a/10;
            a1.add(a2);

        }
        //int[] b = new int[a1.size()];

        System.out.println(a1);
        int e=a1.size();
        for (int i=a1.size()-1;i>=0;i--){
            sum+=(Math.pow(a1.get(i),e));
            e--;


        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Cpower(1111111111);
    }
}

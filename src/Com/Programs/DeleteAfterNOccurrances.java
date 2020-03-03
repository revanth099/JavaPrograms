package Com.Programs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class DeleteAfterNOccurrances {
    public static void Delete(int N, int[] a){
        LinkedHashMap<Integer, Integer> a1 = new LinkedHashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int q:a
             ) {
            Integer count=a1.get(q);
            if(count==null){
                a1.put(q,1);
                al.add(q);
            }
            else{
                if(a1.get(q)<N){

                    a1.put(q, ++count);
                    al.add(q);
                }
            }

        }

        System.out.println(al);






    }

    public static void main(String[] args) {
        int[] a={2,1,1,2, 1,1,2,2,2,1,3,3,3,4,3};
        // Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Delete(3, a);
    }


}

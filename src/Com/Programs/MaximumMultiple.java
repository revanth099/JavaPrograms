package Com.Programs;

public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        /*int maxnumber = 0;
       if(bound>divisor){
           for(int i= 0;i<=bound;i++){
               if((i%divisor==0)){
                   maxnumber=i;
               }

           }
       }else{
           System.out.println("Invalid range");
       }
        System.out.println(maxnumber);*/

         return (bound / divisor) * divisor;
    }

    public static void main(String[] args) {
        int i=5;
        int j=i++;
        float t = 0;
        String s="revanth";
        s.concat("rrr");
        System.out.println(t);
       // System.out.println( maxMultiple(37,200));

    }
}

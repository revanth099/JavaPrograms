package Com.Programs;

public class IntegerReverse {

    public static int getIterations(int climb, int fall, int destination){
        int iterations=1;
        int climb1 = climb;
        int currentposition=0;

       while(currentposition<=destination){
           currentposition= climb1-fall;
           climb1=currentposition+climb;
           if(currentposition>destination){
               int cp=currentposition-destination;

           }


           if(climb1==destination){
                iterations++;
               break;
           }else{
               iterations++;
           }


       }

        return iterations;
    }

    public static void main(String[] args) {
        System.out.println(getIterations(5,2,15));
    }


}

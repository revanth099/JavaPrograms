package Com.Programs;

public class TimeConversion {

    public static void timeconversion(String s){
        String newtme ="";
       String[] s1 = s.split(":");
       if(s.contentEquals("PM")){
           int t1 = Integer.parseInt(s1[0])+12;

           s1[0]= Integer.toString(t1);
           for(String a:s1){
               newtme+=a;
           }
       }
        System.out.println(newtme);

    }

    public static void main(String[] args) {
        timeconversion("07:05:45PM");
    }
}

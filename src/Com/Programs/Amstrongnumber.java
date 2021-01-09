package Com.Programs;

public  class Amstrongnumber {
    public  static void AMnumber(int number){
        int rem=0;

        String s = "";
        int mul=0;
        int temp=number;
        while(number>0){

            rem=number%10;
            mul+=(rem*rem*rem);
            number=number/10;
        }
        if(mul==temp){
            System.out.println("AMN");
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        AMnumber(153);
    }
}

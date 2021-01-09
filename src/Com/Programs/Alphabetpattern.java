package Com.Programs;

public class Alphabetpattern {

    public static void pattern(int N)  {
        char ch='A';
        int extra=0;
        int space1=N+3;
        for(int i=1;i<=N;i++){
            for(int space=i;space<=space1;space++){
                System.out.print(" ");

            }
            space1=space1-1;
            for(int j=1;j<=i;j++){

                if(i==1){
                    System.out.print(ch);
                }
                else{
                    System.out.print(ch+" ");
                }
            }

            for(int e= 1;e<=extra;e++){
                if(extra!=0&&e<extra)
                {
                    System.out.print(ch+" ");
                }
                if(e==extra){
                    System.out.print(ch);
                }     }

            if(i!=N){
                System.out.println();
            }
            extra++;
            ch++;
        }

    }

    public static void main(String[] args)  {
        pattern(6);
    }
}

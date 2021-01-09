package Com.Programs;

public class PascalTriangle {
    public static void ps(int n){
        for(int i=0;i<=n;i++){
            for(int space=i;space<=n-1;++space){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
               int number = (factorial(i)/(factorial(j)*(factorial(i-j))));
                int bino = binomial(i,j,i,j);
                System.out.print(number+" ");
            }
            System.out.println("");
        }
    }
    public static int factorial(int n){
        return (n>=1)?(n*factorial(n-1)):1;
    }
    public static int binomial(int n, int k, int i, int j){
        return (int) ((Math.pow(i,(n-k)))*(Math.pow(j,k)));

    }

    public static void main(String[] args) {
        ps(7);
    }
}

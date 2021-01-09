package Com.Programs;

public class RecursionConcept {

    //Factorial concept

    public static int factorial(int n){
        return (n>=1)?n*factorial(n-1):1;
    }

    public static int  fib(int n){


        return (n>=3)?(fib(n-1)+fib(n-2)):1;
    }

    public static int frog(int feet){

        return (feet>=2)?frog(feet-1)+frog(feet-2):1;
    }

    public static void main(String[] args) {
        //System.out.println(factorial(10));
       // System.out.println(fib(10));
        System.out.println(frog(4));
    }
}

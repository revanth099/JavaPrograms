package Com.Programs;

import java.util.Scanner;

public class NoofPassengersInBus {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of stops");
        int stops = sc.nextInt();
        System.out.println("Enter no.of passengers present initially");
        int n = sc.nextInt();
        for (int i=0;i<stops;i++){
            System.out.println("enter no.of passengers boarded at "+i+" stop");
            int boarded= sc.nextInt();
            System.out.println("Enter no.of passengers dropped at "+i+" stop");
            int dropped = sc.nextInt();
            n+=(boarded-dropped);

        }
        System.out.println("No.of passengers in the bus are: "+n);


    }
}

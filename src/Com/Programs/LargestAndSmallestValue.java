package Com.Programs;

public class LargestAndSmallestValue {

    public static void LargestandSmallest(int[] a){
        for (int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if (a[i]>a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }

        }
        System.out.println("Largest is: "+ a[a.length-1] +" And Smallest is :"+ a[0]);
    }

    public static void main(String[] args) {
        int a[] = {5,8,3,1,4,-7};
        LargestandSmallest(a);
    }


}

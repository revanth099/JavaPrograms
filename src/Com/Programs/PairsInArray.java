package Com.Programs;

public class PairsInArray {

    public static void pairs(int[] a, int sum){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==sum){
                    System.out.println("pairs are : "+ a[i]+","+a[j]);
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] a = {4, 5, 7, 11, 9, 13, 8, 12};
        pairs(a, 20);
    }
}

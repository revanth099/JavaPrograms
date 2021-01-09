package Com.Programs;

public class SumOfLeftAndRightIndex {

    public static void sum(int[] a){
        int leftsum=0;
        int rightsum=0;
        for (int i=0;i<a.length;i++){
            for(int j=i;j>=0;j--){
                leftsum+=a[j];
            }
            for(int q=i;q<a.length;q++){
                rightsum+=a[q];
            }
            if(leftsum!=rightsum){
                leftsum=0;
                rightsum=0;
            }else{
                System.out.println(a[i]+" is the index");
                break;
            }
        }
    }

    public static void main(String[] args) {
        sum(new int[] {2,2,3,2,2});
    }
}

package Com.Programs;

public class IdentifyMissingElementSortedArray {

    public static void missingElement(int[] arr){
        for (int i=0;i<arr.length;i++){
            if(!(i+1>=arr.length)){
                if(arr[i+1]-arr[i]!=1){
                    System.out.println("missing number is "+(arr[i]+1));
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {21,23,25,26,27,29,31,33};
        missingElement(arr);
    }
}

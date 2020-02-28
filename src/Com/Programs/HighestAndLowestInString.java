package Com.Programs;

public class HighestAndLowestInString {

    public static String Number(String a){
        String[] s = a.split(" ");
       // char[] c = a.toCharArray();
        int[] arr = new int[s.length];
        for (int i=0;i<s.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if (arr[i]>arr[j]){
                   int temp = arr[j];
                   arr[j]=arr[i];
                   arr[i]= temp;
               }
            }
        }
        String HighestAndLowest= Integer.toString(arr[arr.length-1])+" "+Integer.toString(arr[0]);


        return HighestAndLowest;
    }

    public static void main(String[] args) {
        System.out.println(Number("5 4 7 14 8 7 -1 -9 7"));
        System.out.println(Number("14 14 14 14 "));
        System.out.println(Number("-6 -2 -5 -5 -6 -6 0"));
    }
}

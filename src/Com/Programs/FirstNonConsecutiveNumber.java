package Com.Programs;

public class FirstNonConsecutiveNumber {
    public static Integer NonConsecutiveNumber(int[] a) {
        Integer n=null;
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                break;
            } else {
                if (a[i] + 1 != a[i + 1]) {
                    //System.out.println(a[i + 1]);


                    n= a[i + 1];
                    break;

                } /*else {
                    n= null;

                }*/
            }
        }
        return n;
    }



    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(NonConsecutiveNumber(a));
        System.out.println(NonConsecutiveNumber((new int[]{1, 2, 3, 4, 6, 7, 8})));
        System.out.println(NonConsecutiveNumber(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(NonConsecutiveNumber(new int[]{4, 6, 7, 8, 9, 11}));
    }
}

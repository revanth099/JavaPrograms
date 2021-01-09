package Com.Programs;

public class RepeatedString {
    public static long charactercount(String s,long n){
        int count=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == 'a') {
                count++;
            }

        }
        System.out.println(count+" "+s.length()+"  "+(n/s.length())+"  "+n%s.length());
        if(n%2==0){
            return (count!=0)?(n/s.length())*count+(n%s.length()):0;
        }
        else{
            return (count!=0)?(n/s.length())*count:0;
        }
       // n%2==0? return (count!=0)?(n/s.length())*count+(n%s.length()):0: return (count!=0)?(n/s.length())*count+count:0;
        //return (count!=0)?(n/s.length())*count+(n%s.length()):0;
       /* if(count!=0){
            return (n/s.length())*count+(n%s.length());
        }
        else{
            return 0;
        }*/
        //long totalcount=(n/s.length())*count+(n%s.length());
        //System.out.println(totalcount);
    }

    public static void main(String[] args) {
        System.out.println(charactercount("aaba",10));
        System.out.println(charactercount("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",549382313570l));
    }
}

package Com.Programs;

public class StringExtension {
    public static void test1(String s){
        String front = "";
        String back = "";
        String finalstring ="";
        for (int i=0;i<s.length();i++){
            //front+=(s.charAt(i)!='{')?s.charAt(i):;
            if(s.charAt(i)!='{'&&s.charAt(i)!=','){
                front+=s.charAt(i);
            }
            if(s.charAt(i)=='{'){
                break;
            }
        }
        System.out.println(front);

        for (int j=s.length()-1;j>=0;j--){
            if(s.charAt(j)!='}'&&s.charAt(j)!=','){
                back=s.charAt(j)+back;
            }
            if(s.charAt(j)=='}'){
                break;
            }
        }
        System.out.println(back);

        for (int q=0;q<s.length();q++){
            if(s.charAt(q)=='{'){
                finalstring+=s.charAt(q);
                for(int i=q+1;i<s.length();i++){
                    if(s.charAt(i)==','){
                        finalstring+=s.charAt(i);
                    }
                    if(s.charAt(i)!=','&&s.charAt(i)!='}') {
                        finalstring += front + s.charAt(i) + back;
                    }
                    if(s.charAt(i)=='}'){
                        finalstring+=s.charAt(i);

                        break;
                    }
                }q=s.length()+1;
            }
        }
        System.out.println(finalstring);

    }

    public static void main(String[] args) {
        test1("a,y{b,c,d}e,r");
    }
}

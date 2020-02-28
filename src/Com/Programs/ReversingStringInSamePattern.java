package Com.Programs;

public class ReversingStringInSamePattern {
    public static void ReverseString(String s){

        char[] sp =  s.toCharArray();
        char[] op = new char[s.length()];
        int z = op.length-1;


        for (int i=0;i<sp.length;i++){
            if(sp[i]==' '){
                op[i] =' ';
            }


        }
        for (int j=0;j<op.length;j++){
            if (op[j]!=' '){
                if (sp[z]==' '){
                    z--;
                }
                if (sp[z]!=' '){
                    op[j]=sp[z];
                    z--;
                }

            }







            /*if (op[j]!=' '){
                op[j]=sp[z];
                z--;

            }
            else{
                z--;
            }*/

        }

        System.out.println(op);
        

    }

    public static void main(String[] args) {
        ReverseString("I am not string");
    }
}

package Com.Programs;

public class CamelCaseConverter {
    public static void CamelCase(String a){
        String s = a.replaceAll("\\s\\w","");
        System.out.println(s);





        }

    public static void main(String[] args) {
        CamelCase("test test test");
    }
    }


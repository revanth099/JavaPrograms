package Com.Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*abstract class a1{
    public abstract void A2();
    public void A3(){
        System.out.println("A3");
    }
}
class b1 extends a1{

    @Override
    public void A2() {
        System.out.println("A2 in b1 class");
    }
    void d1(){

    }
}*/
@FunctionalInterface
interface abc{
    void show();


}
final class b1{
    void m1(){
        System.out.println("t");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        abc jj = () -> System.out.println("test");
        List n = new ArrayList();




        jj.show();
        b1 a = new b1();
        a.m1();


    }





}

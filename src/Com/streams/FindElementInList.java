package Com.streams;

import java.util.ArrayList;
import java.util.List;
class Customer{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
public class FindElementInList {

    public static void main(String[] args) {
       Customer c1 = new Customer();
       c1.setId(22);
        System.out.println(c1.getId());;


    }
}

package Com.Programs;

import java.util.ArrayList;
import java.util.List;

public class GradingSystem {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<grades.size();i++){
            int grade=0;
            int g1=0;
            if(grades.get(i)>=38){
                grade = grades.get(i)%10;
                g1=grades.get(i)-grade;
                if(grade>5){
                    g1=g1+10;
                }
                if(grade<=5){
                    g1+=5;
                }
                if(g1-grades.get(i)<3){
                    list.add(g1);
                }
                else{
                    list.add(grades.get(i));
                }
            }
            else{
                list.add(grades.get(i));
            }

        }


        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades));
    }
}

package Com.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamsFirstProgram {

    public static void main(String[] args) {
        int[] arr = {1,3,2,-9,-1,4,6,7,-1,-9,0,4};
       IntSummaryStatistics st =  IntStream.of(arr).summaryStatistics();
        System.out.println("Max Value"+st.getMax());
        System.out.println("Average"+st.getAverage());
        System.out.println("Min Value"+st.getMin());
        System.out.println("Sum "+st.getSum());
        System.out.println("Count "+ st.getCount());
        IntStream.of(arr).sorted().limit(4).forEach(System.out::println);
        IntStream.of(arr).distinct().forEach(System.out::println);



    }
}

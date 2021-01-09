package Com.fileActions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FIleReader {
    public static void main(String[] args) throws IOException {
        String data="";
        int min=0;
        data = new String(Files.readAllBytes(Paths.get("E:\\test.txt")));
        System.out.println(data);
        String[] data1=data.split("\\s");
        for(String s1:data1){

        }
    }
}

package Com.fileActions;

import javax.activation.FileDataSource;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

    public static void main(String[] args) {
        Path filepath = Paths.get("E:\\test.txt");
        try{
            Files.createFile(filepath);
            System.out.println("File created successfully!");

        }catch (FileAlreadyExistsException e){
            System.out.println("file already exists "+e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();

        } catch (SecurityException e) {
        System.out.println("No permission to create file: " + e.getMessage());
    }
    }
}

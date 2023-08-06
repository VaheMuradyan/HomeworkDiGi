package Servis;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class FileService {
    public static String [] read(String url) throws IOException {
        return  Files.readAllLines(Paths.get(url)).toArray(new String[0]);
    }

    public static void wright(String url, String text) throws IOException{
        Files.write(Paths.get(url),text.getBytes(), StandardOpenOption.APPEND);
    }

    public static void createIndividualFiles(String url) throws IOException{
    
        String [] text = read(url);
        for(String word : text){
            String path = word.split(",")[0];
            Files.write(Paths.get(path + ".txt"),word.getBytes(), StandardOpenOption.CREATE);
        }
    }
}

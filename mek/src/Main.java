import Model.Student;
import Servis.FileService;
import Servis.StudentService;

import java.io.IOException;


public class Main {
    public static final String URL = "Lesson.txt";

    public static void main(String[] args) throws IOException {
        String[] text = FileService.read(URL);
        Student[] students = StudentService.convert(text);
        
        FileService.createIndividualFiles(URL);
        
        Student student = StudentService.maxMark(students);
        FileService.wright(URL,"\nMax mark = " + student.toString());
        
        

        
        
    }
}
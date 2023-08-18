package service;

import model.Student;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class StudentService {



    public static Student [] convert(String [] text){
        Student [] students = new Student[text.length];
        for(int i = 0; i < text.length; i++){
            students[i] = new Student(text[i]);
        }
        return students;
    }

    public static Student maxAge(Student [] students){
        Student max = students[0];
        for(int i = 1; i < students.length; i++){
            if(students[i].getYear() < max.getYear()){
                max = students[i];
            }
        }
        return max;
    }

    public static Student maxMark(Student [] students){
        Student max = students[0];
        for(int i = 1; i < students.length; i++){
            if(students[i].getMark() > max.getMark()){
                max = students[i];
            }
        }
        return max;
    }

    public static String sortByName(List<Student> studentList){
        Collections.sort(studentList, new NameComparator());
        StringJoiner sj = new StringJoiner(", ");
        for(Student x : studentList){
            sj.add(x.toString());
        }
        return sj.toString();
    }

}

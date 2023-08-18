package model;

public class Student implements Comparable<Student>{

    private String name;
    private int year;
    private int mark;

    public Student(String val) {
        String [] arr = val.split(",");
        name = arr[0];
        year = Integer.parseInt(arr[1]);
        mark = Integer.parseInt(arr[2]);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMark() {
        return mark;
    }


    @Override
    public String toString() {
        return name + " " + year + " " + mark;
    }


    @Override
    public int compareTo(Student o) {
        return (this.mark - o.getMark());
    }
}


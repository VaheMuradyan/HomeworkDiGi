package Model;

public class Student {
    private String name;
    private int year;
    private double mark;

    public Student(String val) {
        String [] arr = val.split(",");
        name = arr[0];
        year = Integer.parseInt(arr[1]);
        mark = Double.parseDouble(arr[2]);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getMark() {
        return mark;
    }


    @Override
    public String toString() {
        return name + " " + year + " " + mark;
    }
}

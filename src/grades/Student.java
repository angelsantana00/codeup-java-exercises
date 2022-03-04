package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String studentName;
    private ArrayList <Integer> grades;
    private HashMap <String, String> attendance;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return this.studentName;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int gradeSum = 0;
        for (int num : grades) {
            gradeSum += num;
        }
        return gradeSum / grades.size();
    }






}

package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap<>();

        Student angel = new Student("Angel");
        angel.addGrade(78);
        angel.addGrade(85);
        angel.addGrade(94);

        Student chris = new Student("Christian");
        chris.addGrade(99);
        chris.addGrade(95);
        chris.addGrade(94);

        Student ryan = new Student("Ryan");
        ryan.addGrade(69);
        ryan.addGrade(57);
        ryan.addGrade(75);

        Student brand = new Student("Brandon");
        brand.addGrade(79);
        brand.addGrade(76);
        brand.addGrade(98);

        students.put("SantanaBoy00", angel);
        students.put("ChristianNASA", chris);
        students.put("Diblings", ryan);
        students.put("BrandonFluffy", brand);

        commandInfo(students);

//        students.put("Angel");
//        student angel = new Student
//
//        students.put("Christian");
//
//        students.put("Ryan");
//
//        students.put("Brandon");

    }

    public static void commandInfo(HashMap<String, Student> students) {

        Input input = new Input();
        do {
            System.out.println
                    ("Welcome!\n" +
                    "\n" +
                    "Here are the GitHub usernames of our students:\n");
            for (String key: students.keySet()) {
                System.out.print("|" + key + "| ");
            }
            System.out.println("What student would you like to see more info on?\n");
            String userKey = input.getString();

            if (students.containsKey(userKey)) {
                Student currentStudent = students.get(userKey);
                System.out.println("Name: " + currentStudent.getName() + " - GitHub Username: " + userKey);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userKey + ".");
            }
            System.out.println("Would you like to see another student?");
        } while (input.yesNo());
        System.out.println("Thank You! Goodbye!");

    }


}

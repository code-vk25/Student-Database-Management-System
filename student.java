package StudentDatabaseApp;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int courseCost = 600;
    private int studentTuition = 0;
    private int numOfStudents = 0;

    student() {
        System.out.println("Enter student's first name: ");
        Scanner sc = new Scanner(System.in);
        this.firstName = sc.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = sc.nextLine();

        System.out.println("Enter student's grade year : ");
        this.gradeYear = sc.nextInt();

        this.studentID = createStudentId();

        courseList();
        payTuition();

       // sc.close();

    }

    // create student id
    private int createStudentId() {
        numOfStudents++;
        return (this.gradeYear * 10000 + numOfStudents);
    }

    // create course list
    private void courseList() {
        String course;
        while (true) {
            System.out.print("Enter course or Enter 'Q' to quit: ");
            Scanner sc = new Scanner(System.in);
            course = sc.nextLine();

            if (course.matches("Q")) {
                break;
            } else {
                courses = courses + " " + course;
                studentTuition += courseCost;
            }
          //  sc.close();
        }
    }

    // method to pay tuition
    void payTuition(){
        showBalance();
        System.out.println("Enter the amount you want to pay: ");
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        studentTuition -= balance;
        showBalance();
    }
    
    // show balance
    void showBalance(){
        System.out.println("Student balance is : " + studentTuition);
    }

    // show student Info
    void studentInfo(){
        System.out.println("Student name: " + firstName + " " + lastName + "\n"+
                           "Grade Year: " + gradeYear + 
                           "\nStudent ID: " + studentID +
                           "\nTuition Fee: " + studentTuition +
                           "\nCourses Enrolled: " + courses);
    }
}

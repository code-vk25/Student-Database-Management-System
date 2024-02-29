package StudentDatabaseApp;

import java.util.Scanner;

public class studentapp {
    public static void main(String[] args) {
        System.out.println("Enter no. of Students : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        student[] arr = new student[num];
        for(int i = 0; i < num; i++){
            System.out.println("Enter details of " + i + "th student : ");
            arr[i] = new student();
        }

        for(int i = 0; i< num; i++){
            arr[i].studentInfo();
        }



    }

}

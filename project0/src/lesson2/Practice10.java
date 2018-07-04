package lesson2;

import java.util.Scanner;

/**
 * Score to grade converter
 */
public class Practice10 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score 0 to 100: ");

        int score = scanner.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else {
            if (score >= 80) {
                grade = "B";
            } else {
                if (score >= 70) {
                    grade = "C";
                } else {
                    if (score >= 60) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
                }
            }
        }

        System.out.println("Grade for score " + score + " is " + grade);


    }

}

package ex_07082026;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
/*      Grade Calculator:
        Write a program that calculates and displays the letter grade for a given
        numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Score: ");
        int score = sc.nextInt();
        char grade = 'O';
        if(score > 100 || score < 0){
            System.out.println("Invalid Score.");
        } else if (score <= 100 && score >=90) {
            grade = 'A';
        } else if (score <=89 && score>=80) {//B: 80-89
            grade = 'B';
        } else if (score<=79 && score>=70) {//C: 70-79
            grade = 'C';
        } else if (score<=69 && score>=60) {//D: 60-69
            grade = 'D';
        } else if (score<=59 && score>=0) {//F: 0-59
            grade = 'F';
        }
        System.out.println("Grade: "+ grade);
        sc.close();
    }
}

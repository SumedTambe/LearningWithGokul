package ex_07242026;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //Grade
        // Score 1-34 - Fail
        // 35 - 60 - third class
        // 61 - 75 - second class
        // 76 - 90 - first class
        // 91-100 - merit class

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you score: ");
        int score = sc.nextInt();

        if (score>=1 && score<=34){
            System.out.println("Fail");
        } else if (score>=35 && score<=60) {
            System.out.println("Third Class");
        } else if (score >=61 && score <=75) {
            System.out.println("Second Class");
        } else if (score >=76 && score<=90) {
            System.out.println("First Class");
        } else if (score >= 91 && score<=100) {
            System.out.println("Merit");
        }else {
            System.out.println("Invalid Score");
        }
    }
}

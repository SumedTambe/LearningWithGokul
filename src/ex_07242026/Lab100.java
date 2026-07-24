package ex_07242026;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        //Max two number using Math class
        //java.lang.math

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        System.out.println("Max Number is: "+Math.max(num1, num2));
    }
}

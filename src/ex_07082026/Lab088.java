package ex_07082026;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Num 2: ");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        System.out.println("Max Num is " + max);
    }
}

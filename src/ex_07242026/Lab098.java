package ex_07242026;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        //Max number between two which are user input nums.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
    }
}

package ex_07082026;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num 2: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Max Num is " + num1);
        }else if (num1 < num2){
            System.out.println("Max Num is " + num2);
        }else {
            System.out.println("Both Nums are equal.");
        }
    }
}

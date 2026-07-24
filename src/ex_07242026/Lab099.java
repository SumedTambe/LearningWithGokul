package ex_07242026;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        //Max between two numbers;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Max: "+num1);
        }
        else if (num2 > num1){
            System.out.println("Min: "+num2);
        }
        else{
            System.out.println("Both Num1 and Num2 are equals.");
        }
    }
}

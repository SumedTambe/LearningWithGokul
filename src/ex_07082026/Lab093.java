package ex_07082026;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        //Which browser you want to run the program.
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Browser you want to run the Program?: ");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Chrome browser is running.");
                break;
            case "firefox":
                System.out.println("Firefox browser is running.");
                break;
            case "edge":
                System.out.println("Edge browser is running.");
                break;
            case "mozilla":
                System.out.println("Mozilla browser is running.");
                break;
            case "safari":
                System.out.println("Safari browser is running.");
                break;
            default:
                System.out.println("Unrecognized browser!!!");
        }
    }
}

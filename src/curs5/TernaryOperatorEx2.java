package curs5;

import java.util.Scanner;

public class TernaryOperatorEx2 {

    public static void main(String[]args){

        int num1;
        int num2;
        String answer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();

        answer  = (num1 >0)?"First number is positive":"First number is negative";
        System.out.println(answer);

        answer  = (num2 >0)?"Second number is positive":"Second number is negative";
        System.out.println(answer);

        answer = (num1 > 0 && num2 > 0)?"Both numbers are positive":"One or both numbers are negative";
        System.out.println(answer);

        answer = (num1 == num2)?"Numbers are equal":(num1<num2) ? "First number is smaller":"Second number is smaller";
        System.out.println(answer);

    }

}

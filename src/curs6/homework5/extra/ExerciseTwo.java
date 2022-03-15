package curs6.homework5.extra;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main (String[] args){
        ExerciseTwo test = new ExerciseTwo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("For method: ");
        test.forPrint(firstNumber,secondNumber);

        System.out.println("While method:");
        test.whilePrint(firstNumber,secondNumber);

        System.out.println("Do while method: ");
        test.doWhilePrint(firstNumber,secondNumber);




    }

    public void forPrint(int firstNumber, int secondNumber){
        int a,b;
        a = (firstNumber < secondNumber)? firstNumber:secondNumber;
        b=(firstNumber > secondNumber)? firstNumber:secondNumber;
        if(firstNumber == secondNumber || a == b - 2 || a + 1 == b){
            System.out.println("Nothing to print.");
        } else {
            for(int i = a + 1; i < b; i++ ){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }

    }

    public void whilePrint(int firstNumber, int secondNumber){
        int a,b;
        a = (firstNumber < secondNumber)? firstNumber:secondNumber;
        b=(firstNumber > secondNumber)? firstNumber:secondNumber;
        if(firstNumber == secondNumber || a == b - 2 || a + 1 == b){
            System.out.println("Nothing to print.");
        } else {
            a++;
            while (a <b){

                if(a % 2 == 0){
                    System.out.println(a);
                }
                a++;
            }
        }

    }

    public void doWhilePrint(int firstNumber, int secondNumber){
        int a,b;
        a = (firstNumber < secondNumber)? firstNumber:secondNumber;
        b=(firstNumber > secondNumber)? firstNumber:secondNumber;
        if(firstNumber == secondNumber || a == b - 2 || a + 1 == b){
            System.out.println("Nothing to print.");
        } else {
            a++;
            do{

                if(a % 2 == 0){
                    System.out.println(a);
                }
                a++;
            }while (a < b);
        }

    }

}

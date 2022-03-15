package curs7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TryCatchExampleTwo {

    public static void main(String[]args){

        //useless catch.
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int numberOne = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int numberTwo = scanner.nextInt();
            System.out.println(numberOne/numberTwo);

        }catch(ArithmeticException e){
            System.out.println("Division with 0 not possible.");

        }catch(InputMismatchException e){
            System.out.println("Numeric inputs only.");
        }catch (NullPointerException e){
            System.out.println("Null not possible.");
        }catch (Exception e){
            System.out.println("Wrong");
            e.printStackTrace();
        }

        System.out.println("Code outside try - catch");

    }
}

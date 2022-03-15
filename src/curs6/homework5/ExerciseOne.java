package curs6.homework5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ExerciseOne {
    public static void main (String[] args){
        ExerciseOne test = new ExerciseOne();
        test.execute();

        test.executeBasic();



    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i =0;i<array.length;i++){
            System.out.println("Enter number "+ (i+1) + " : ");
            array[i] = scanner.nextInt();
        }

        int sum = IntStream.of(array).sum();
        System.out.println("The sum is: " + sum);


    }

    /*
    * Scrierea aceluias program, dar mai basic
    * */

    public void executeBasic(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        array[3] = scanner.nextInt();
        array[4] = scanner.nextInt();
        array[5] = scanner.nextInt();
        array[6] = scanner.nextInt();
        array[7] = scanner.nextInt();
        array[8] = scanner.nextInt();
        array[9] = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("The sum is: " + sum);
    }

}

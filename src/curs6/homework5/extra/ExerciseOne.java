package curs6.homework5.extra;

import java.util.Scanner;

public class ExerciseOne {

    public static void main (String[] args){
        ExerciseOne test = new ExerciseOne();
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of elements of the array: ");
        size = scanner.nextInt();
        int [] array = new int[size];
        for (int i =0; i<size; i++){
            System.out.println("Enter element number " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }
        array = test.reverseArray(array);
        System.out.print("Array reversed ");
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }


    }

    public int[] reverseArray(int[] arrayToInverse){
        int[] newArray = new int[arrayToInverse.length];
        for(int i =0; i<arrayToInverse.length; i++){
            newArray[arrayToInverse.length - 1 - i] = arrayToInverse[i];
        }

        return newArray;

    }

}

package curs6.homework5.extra;

import java.util.Scanner;

public class ExerciseThree {
    public static void main (String[] args){
        ExerciseThree test = new ExerciseThree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number that corresponds with a day of the week: ");
        int day = scanner.nextInt();
        test.printDay(day);




    }

    public void printDay(int day){
        String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        switch(day){
            case 1:
                System.out.println(daysOfTheWeek[0]);
                break;
            case 2:
                System.out.println(daysOfTheWeek[1]);
                break;
            case 3:
                System.out.println(daysOfTheWeek[2]);
                break;
            case 4:
                System.out.println(daysOfTheWeek[3]);
                break;
            case 5:
                System.out.println(daysOfTheWeek[4]);
                break;
            case 6:
                System.out.println(daysOfTheWeek[5]);
                break;
            case 7:
                System.out.println(daysOfTheWeek[6]);
                break;
            default:
                System.out.println("Error: Number does not match with any day of the week.");
        }
    }
}

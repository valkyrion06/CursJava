package curs2.homework1;

import java.util.Scanner;

public class Exercise3 {

    public static void main (String[] args){
        String day;
        Exercise3 exercise3 = new Exercise3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        day = exercise3.dayOfTheWeek(scanner.nextInt());
        if(day.equals("error")){
            System.out.println("Please Enter a number between 1 and 7");
        } else {
            System.out.println("The day of the week is " + day);
        }

    }


    public String dayOfTheWeek(int number){
        String dayOfTheWeek;

        switch (number){
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "error";
                break;
        }




        return dayOfTheWeek;
    }

}

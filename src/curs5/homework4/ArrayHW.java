package curs5.homework4;

import java.util.Scanner;

public class ArrayHW {

    public static void main (String [] args){
        ArrayHW test = new ArrayHW();
        test.execute();

    }

    public void execute(){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner scanner = new Scanner(System.in);
        int input;
        String month;
        do{
            System.out.println("Please enter the number of a month:");
            input = scanner.nextInt();
            month = (input<=12 && input >=1) ? months[input-1]:"You have entered an invalid number of the month.";
            System.out.println(month);
        }while(input >12 || input <1);
        scanner.close();
    }

}

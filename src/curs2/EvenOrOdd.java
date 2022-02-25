package curs2;

public class EvenOrOdd {

    public static void main (String[]args){
        /*int number = 6;

        if(number % 2 == 0){
            System.out.println("The number " + number + " is " + "even");
        } else {
            System.out.println("The number " + number + " is " + "odd");
        } */

        EvenOrOdd evenOrOdd = new EvenOrOdd();
        evenOrOdd.verifyEvenOrOdd(4);


    }

    public void verifyEvenOrOdd(int number){

        if(number % 2 == 0){
            System.out.println("The number " + number + " is " + "even");
        } else {
            System.out.println("The number " + number + " is " + "odd");
        }


    }
    }



package curs6;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[]args){

        boolean condition = true;

        while(condition){

            int diceOne = (int) (Math.random()*6+1);
            int diceTwo = (int) (Math.random()*6+1);
            int sum = diceOne + diceTwo;
            System.out.println("Dice values: " + sum);
            if (sum == 2 || sum == 6 || sum == 12){
                System.out.println("You lost");
                break;
            } else if(sum == 7 || sum == 1){
                System.out.println("You won.");
                break;
            }else if (sum == 3 || sum == 1){
                System.out.println("You automatically roll again.");
                continue;
            }else {
                System.out.println("Would you like to role again?");
                Scanner scanner = new Scanner(System.in);
                condition = scanner.nextBoolean();
            }

        }

    }

}

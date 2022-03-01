package curs3;

import java.util.Scanner;

public class LetterSearch {

    public static void main (String[] args){
        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");
        word = scanner.next();
        scanner.close();
        boolean letterFound = false;
        int counter = 0;

        for(int i = 0 ; i< word.length(); i++){
            char currentLetter = word.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
            letterFound = true;
            counter ++;
            }
        }
        if(letterFound){
            System.out.println("Letter 'a' is present in the word " + counter + " times");
        } else {
            System.out.println("Letter was not found");
        }



    }

}

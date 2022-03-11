package curs6;

import java.util.Scanner;

public class ForEachExample3 {

    public static void main (String[] args){
        String word;
        Scanner scanner = new Scanner(System.in);
        char[] charArray;

        System.out.println("Please enter a word:");
        word = scanner.next();
        scanner.close();
        boolean letterFound = false;
        int counter = 0;

       /* for(int i = 0 ; i< word.length(); i++){
            char currentLetter = word.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                counter ++;
            }
        } */

        charArray = word.toCharArray();
        for(char ch : charArray){
            if(ch == 'A' || ch == 'a'){
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

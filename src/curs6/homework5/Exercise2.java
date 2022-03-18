package curs6.homework5;

import java.util.ArrayList;

public class Exercise2 {

    public static void main (String[] args){
        Exercise2 test = new Exercise2();
        System.out.println("Number of Vowels: " + test.countVowels("Eu invat Java"));

    }

    public int countVowels(String sentence){
        int numberOfVowels =0;
        char[] sentenceArray = sentence.toCharArray();
        //char[] vowels = {'a','A','e','E','I','i','o','O','u','U'};
        for(int i=0; i<sentenceArray.length; i++){
            if(Character.toLowerCase(sentenceArray[i])=='a'||Character.toLowerCase(sentenceArray[i])=='e'||Character.toLowerCase(sentenceArray[i])=='i'||Character.toLowerCase(sentenceArray[i])=='o'||Character.toLowerCase(sentenceArray[i])=='u'){
                numberOfVowels ++;

            }

        }

        return  numberOfVowels;
    }

}

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
            if(sentenceArray[i]=='a'||sentenceArray[i]=='A'||sentenceArray[i]=='e'||sentenceArray[i]=='E'||sentenceArray[i]=='i'||sentenceArray[i]=='I'||sentenceArray[i]=='o'||sentenceArray[i]=='O'||sentenceArray[i]=='u'||sentenceArray[i]=='U'){
                numberOfVowels ++;
            }

        }

        return  numberOfVowels;
    }

}

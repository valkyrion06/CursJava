package curs5;

public class ArrayExample {



    public static void main(String[]args){
        String[] textArray = new String[5];
        String[] example = {"unu","doi","trei"};

        textArray[0] = "This";
        textArray[1] = "is";
        textArray[2] = "an";
        textArray[3] = "array";
        textArray[4] = "!";

        for(int i =0; i<textArray.length; i++){
            System.out.print(textArray[i] + " ");
        }


    }

}

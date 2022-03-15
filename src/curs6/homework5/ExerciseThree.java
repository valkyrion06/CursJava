package curs6.homework5;

public class ExerciseThree {

    public static void main (String[] args){
        String[] myStringArray = {"Maria","Bob","Ion","George","Oana","Bogdan","Oana","Ion"};
        ExerciseThree test = new ExerciseThree();
        test.checkDuplicates(myStringArray);


    }

    public void checkDuplicates(String [] array){
        for (int i =0; i<array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i].equals(array[j])){
                    System.out.println("Duplicated: " + array[i]);
                }
            }
        }


    }



}

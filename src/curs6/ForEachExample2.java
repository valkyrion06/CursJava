package curs6;

public class ForEachExample2 {
    public static void main(String[]args){

        String[] citites = {"Iasi","Alba","Arad","Cluj","Timis"};


        for(String city: citites){

            if(city.equals("Cluj")){
               //break; breaks out of loop
                continue; //skips the current iteration
            }

            System.out.println(city);
        }

    }

}

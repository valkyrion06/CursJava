package curs1;

public class ExampleVariables {

    String prenume = "Oana";

    public static void main (String[] args){
        ExampleVariables exampleVariables= new ExampleVariables();
        exampleVariables.printName();

    }

    public void printName(){
        String nume = "Ion";
        System.out.println(nume + " " + prenume);
    }
}

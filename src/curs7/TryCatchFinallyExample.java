package curs7;

public class TryCatchFinallyExample {

    public static void main (String[]args){

        try{
            String name = null;
            System.out.println(name.length());

        }catch(NullPointerException e){
            System.out.println("NullPointerException occurs.");

        }finally{
            System.out.println("Finally block of code.");
            //finally se executa indiferent de exceptie.

        }

    }

}

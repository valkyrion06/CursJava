package curs7;

public class MyCustomException extends Exception{

    public MyCustomException(String message){
        super(message); //referinta la obiectul clasei in care se afla
    }

}

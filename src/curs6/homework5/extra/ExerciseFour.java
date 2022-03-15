package curs6.homework5.extra;

import java.util.Scanner;

public class ExerciseFour {
    public static void main (String[] args){
        ExerciseFour test = new ExerciseFour();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String username = scanner.next();
        String password;
        do{
           System.out.println("Please enter password: ");
           password = scanner.next();

        }while(!test.validate(username,password));
        System.out.println("Account created.");
        scanner.close();
    }

    public boolean validate(String username, String password){
        boolean valid = true;
        String message= "Password: ";



        if(password.length()<10){
            valid = false;
            message = message + "\r\n" + "* must be at least 10 characters";

        }

        if(!hasUpperCase(password)){
            valid = false;
            message = message + "\r\n" + "* must have at least one uppercase character";
        }

        if(username.equalsIgnoreCase(password)){
            valid = false;
            message = message + "\r\n" + "* can not be the same as the username";
        }

        if(!valid){
            System.out.println(message);
        }



        return valid;
    }

    public boolean hasUpperCase(String string){
        boolean hasUpperCase = false;
        char[] passwordCharArray = string.toCharArray();
        for(char c : passwordCharArray){
            if(Character.isUpperCase(c)){
                hasUpperCase= true;
            }
        }
        return hasUpperCase;
    }
}

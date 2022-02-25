package curs2;

import java.util.Scanner;

public class IfElseExample {

    public static void main (String[] args){
        String username = "test";
        String password = "test123";

        System.out.println("Type username:");

        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();

        System.out.println("Type password");
        String introducedPassword = scanner.next();

        if(username.equals(user) && password.equals(introducedPassword)){
            System.out.println("Logged in");
        } else {System.out.println("Username of password is wrong.");}




    }

}

package curs5;

import java.util.Scanner;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char calculus;
    private double result;

    public void askTheUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        this.firstNumber = scanner.nextInt();
        do {
            System.out.println("Please enter the calculus (+, -, *, x, X, /): ");
            this.calculus = scanner.next().charAt(0);
           }while(calculus!='+'&&calculus!='-'&&calculus!='x'&&calculus!='X' && calculus!='*'&&calculus!='/');
        System.out.println("Please enter the second number: ");
        this.secondNumber = scanner.nextInt();
    }

    public void calculateValues(){
        if(calculus == '+') {result = firstNumber + secondNumber;}
        else if(calculus == '-') {result = firstNumber + secondNumber;}
        else if(calculus == 'x' ||calculus == '*'||calculus=='X') {result = firstNumber * secondNumber;}
        else if(calculus == '/') {result = firstNumber / secondNumber;}
    }

    public void printResult(){
        System.out.println(firstNumber +" "+calculus+ " " + secondNumber + " = " + result);
    }


    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.askTheUser();
        calculator.calculateValues();
        calculator.printResult();
    }



}

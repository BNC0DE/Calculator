package com.myapp.calculator;

import java.util.Scanner;

public class Main {
    
    // calculate the value of two variables
    public static double calculateValue(String op, int x, int y) {
        
        double calc = 0;
        switch(op) {
            case "+":
                calc = (double) x + (double) y; // addition
            break;
            case "-":
                calc = (double) x - (double) y; // subtraction
            break;
            case "×":
                calc = (double) x * (double) y; // multiplication
            break;
            case "÷":
                calc = (double) x / (double) y; // division
            break;
        }
        
        return calc;
    }
    
    public static void main(String[] args) {
        
        final var scan = new Scanner(System.in);
        
        // data variables
        int x, y;
        
        // operator variables
        String op;
        String result;
        
        
        System.out.print("enter x value: ");
        x = scan.nextInt(); // x value 
        System.out.print("enter y value: ");
        y = scan.nextInt(); // y value
        
        scan.nextLine();
        
        System.out.print("enter operator: ");
        op = scan.nextLine();
    
        result = String.valueOf(calculateValue(op, x, y));
        if (result.contains(".0")) {
            result = result.substring(0, result.length() - 2);
        }
        
        System.out.println(result);
        
    }
}


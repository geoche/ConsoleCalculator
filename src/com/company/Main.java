package com.company;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String operation = "";
        double firstValue = 0;
        double secondValue = 0;
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter first value:");
            firstValue = scn.nextDouble();
            System.out.println("Please enter operation symbol: ");
            operation = scn.nextLine(); // reads empty line from console
            operation = scn.nextLine();
            System.out.println("Please enter second value:");
            secondValue = scn.nextDouble();
        }
        catch (Exception e){
            System.out.println("Input error.");
        }
            //Math operations
            switch (operation) {
                case "+":
                    System.out.println("Your result is: " + (firstValue + secondValue));
                    break;
                case "-":
                    System.out.println("Your result is: " + (firstValue - secondValue));
                    break;

                case "/":
                    System.out.println("Your result is: " + (firstValue / secondValue));
                    break;

                case "*":
                    System.out.println("Your result is: " + (firstValue * secondValue));
                    break;
            }





        //Enter to exit
        System.out.println("Press ENTER to exit programm. ");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrion Alexander Soler Galindo
      Date: 18/04/20
      Description: This software convert Kilometers, miles and yards
    */

    public static void main(String[] args) {
        byte option;
        Scanner keyboard = new Scanner(System.in);

        menu();

        System.out.println("Select an option:\n1.Kilometers to Miles\n2.Miles to Kilometers\n3.Kilometers to Yards\n4.Yards to Kilometers");

        option = keyboard.nextByte();

        while (option < 1 || option > 4){
            System.err.println("ERROR, The input must be between 1 and 4\nRetry: ");
            option = keyboard.nextByte();
        }

        switch (option){
            case 1:f_Kilometers_Miles((byte) 1);
            break;
            case 2:f_Kilometers_Miles((byte) 2);
            break;
            case 3:f_Kilometers_Yards((byte) 1);
            break;
            case 4:f_Kilometers_Yards((byte) 2);
            break;
        }
    }
    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("│       Distsoft        │");
        System.out.println("│   By Harrizon Soler   │");
        System.out.println("-------------------------\n");
    }
    public static void f_Kilometers_Miles(byte direction){
        double input;
        Scanner keyboard = new Scanner(System.in);
        String kind[] = {" kilometers"," miles"};

        System.out.println("Type the" + kind[direction-1] + " to convert:");
        input = keyboard.nextDouble();

        input = f_error(input);

        System.out.print(input);

        switch (direction){
            case 1:
                System.out.println(" kilometers to miles is equal to " + input/1609 + " miles");
                break;
            case 2:
                System.out.println(" miles to kilometers is equal to " + input*1609 + " kilometers");
                break;
        }
    }
    public static void f_Kilometers_Yards(byte direction){
        double input;
        Scanner keyboard = new Scanner(System.in);
        String kind[] = {" kilometers"," yards"};

        System.out.println("Type the" + kind[direction-1] + " to convert:");
        input = keyboard.nextDouble();

        input = f_error(input);

        System.out.print(input);

        switch (direction){
            case 1:
                System.out.println(" kilometers to yards is equal to " + input*1094 + " yards");
                break;
            case 2:
                System.out.println(" yards to kilometers is equal to " + input/1094 + " kilometers");
                break;
        }
    }
    public static double f_error(double input){
        Scanner keyboard = new Scanner(System.in);

        while (input < 0){
            System.err.println("ERROR, The input must be greater than 0\nRetry:");
            input = keyboard.nextDouble();
        }
        return input;
    }
}

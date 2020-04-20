package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
     Name: Harrion Soler
     Date: 20/04/20
     Description: This software converts colombian pesos, dollars and euros.
    */

    public static void main(String[] args) {
        byte option;
        Scanner keyboard = new Scanner(System.in);

        menu();

            System.out.println("Select an option:\n1.Pesos to Dollars\n2.Dollars to Pesos\n3.Pesos to Euros\n4.Euros to Pesos\n5.Dollars to Euros\n6.Euros to Dollars");

        option = keyboard.nextByte();

        while (option < 1 || option > 6){
            System.err.println("ERROR, The input must be between 1 and 6\nRetry: ");
            option = keyboard.nextByte();
        }

        switch (option){
            case 1:f_Pesos_Dollars((byte) 1);
                break;
            case 2:f_Pesos_Dollars((byte) 2);
                break;
            case 3:f_Pesos_Euros((byte) 1);
                break;
            case 4:f_Pesos_Euros((byte) 2);
                break;
            case 5:f_Dollars_Euros((byte) 1);
                break;
            case 6:f_Dollars_Euros((byte) 2);
                break;
        }
    }
    public static void menu(){
        System.out.println("╔════════════════════╗");
        System.out.println("║      Moneysoft     ║");
        System.out.println("║ By: Harrizon Soler ║");
        System.out.println("╚════════════════════╝");
    }
    public static void f_Pesos_Dollars(byte direction){
        double input;
        Scanner keyboard = new Scanner(System.in);
        String kind[] = {" Pesos"," Dollars"};

        System.out.println("Type the" + kind[direction-1] + " to convert:");
        input = keyboard.nextDouble();

        input = f_error(input);

        System.out.print(input);

        switch (direction){
            case 1:
                System.out.println(" Pesos to Dollars is equal to " + input * 0.00025  + " Dollars");
                break;
            case 2:
                System.out.println(" Dollars to Pesos is equal to " + input*3963.43 + " Pesos");
                break;
        }
    }
    public static void f_Pesos_Euros(byte direction){
        double input;
        Scanner keyboard = new Scanner(System.in);
        String kind[] = {" Pesos"," Euros"};

        System.out.println("Type the" + kind[direction-1] + " to convert:");
        input = keyboard.nextDouble();

        input = f_error(input);

        System.out.print(input);

        switch (direction){
            case 1:
                System.out.println(" Pesos to Euros is equal to " + input * 0.00023 + " Euros");
                break;
            case 2:
                System.out.println(" Euros to Pesos is equal to " + input*4309.84 + " Pesos");
                break;
        }
    }
    public static void f_Dollars_Euros(byte direction){
        double input;
        Scanner keyboard = new Scanner(System.in);
        String kind[] = {" Dollars"," Euros"};

        System.out.println("Type the" + kind[direction-1] + " to convert:");
        input = keyboard.nextDouble();

        input = f_error(input);

        System.out.print(input);

        switch (direction){
            case 1:
                System.out.println(" Dollars to Euros is equal to " + input * 0.92 + " Euros");
                break;
            case 2:
                System.out.println(" Euros to Dollars is equal to " + input*1.09 + " Dollars");
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

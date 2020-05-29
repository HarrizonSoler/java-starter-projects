package usta.sistemas;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 16/04/2020
      Description: This software convert seconds to hours,minutes and backwards
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte option;

        menu();

        System.out.println("Type an option:\n1.Seconds to Hours-Minutes and Seconds\n2.Hours to Seconds\n3.Minutes to Seconds");
        option = keyboard.nextByte();

        option = f_error_list(option);

        switch (option) {
            case 1:
                f_Seconds_to_H_M_S();
                break;
            case 2:
                f_to_Seconds(1);
                break;
            case 3:
                f_to_Seconds(2);
                break;
        }
    }

    public static void menu() {
        System.out.println("---------------------");
        System.out.println("│    Timesoft       │");
        System.out.println("│ By Harrizon Soler │");
        System.out.println("---------------------\n");
}

    public static void f_to_Seconds(int type) {
        String kind[] = {" hours", " minutes"};
        double input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the " + kind[type-1] + " to convert:");
        input = keyboard.nextDouble();

        input = f_error(input);

        System.out.print(input + kind[type-1] + " to seconds is ");

        switch (type) {
            case 1:
                System.out.print(beforeDot(input * 3600));
                break;
            case 2:
                System.out.print(beforeDot(input * 60));
                break;
        }

        System.out.println(" seconds");
    }

    public static void f_Seconds_to_H_M_S() {
        double secondsInput, hours, minutes, seconds;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the seconds to convert:");
        secondsInput = keyboard.nextDouble();

        secondsInput = f_error(secondsInput);

        hours = secondsInput / 3600;
        minutes = Math.round(thenDot(hours) * 60);
        seconds = Math.round(thenDot(minutes) * 60);

        System.out.println("The time converted is: " + beforeDot(hours) + " Hours - " + beforeDot(minutes) + " Mitutes - " + beforeDot(seconds) + " Seconds");
    }

    public static int beforeDot(double s) {
        String toString = String.valueOf(s);

        return Integer.valueOf(toString.substring(0, toString.indexOf('.')));
    }

    public static double thenDot(double input) {
        String toString = String.valueOf(input);

        return Double.parseDouble(toString.substring(toString.indexOf('.')));
    }

    public static byte f_error_list(byte option) {
        Scanner keyboard = new Scanner(System.in);

        while (option < 1 || option > 3) {
            System.err.println("ERROR, The input must be between 1 and 3\nRetry:");
            option = keyboard.nextByte();
        }
        return option;
    }

    public static double f_error(double input) {
        Scanner keyboard = new Scanner(System.in);

        while (input < 0) {
            System.err.println("ERROR, The input must be greater than o\nRetry:");
            input = keyboard.nextDouble();
        }
        return input;
    }
}

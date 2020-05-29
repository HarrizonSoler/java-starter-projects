package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 19/04/2020
      Description: This software simulates a bus route.
    */

    public static void main(String[] args) {
        f_menu();

        int stops = f_stops(),passengers[] ,pin = 0,pout = 0;

        for (int i = 1; i <= stops; i++){
            passengers = f_passengers(i);

            pin += passengers[0];
            pout += passengers[1];
        }

        System.out.println("A total of " + pin + " passengers entered and " + pout + " passengers left the Bus with " + stops + " stops");
        System.out.println(pin*150 + " dollars were obtained");

    }
    public static void f_menu(){
        System.out.println("----------------------");
        System.out.println("|      Busoft        |");
        System.out.println("| By: Harrizon Soler |");
        System.out.println("----------------------");
    }
    public static int f_stops(){
        Scanner keyboard = new Scanner(System.in);
        int stops;

        System.out.println("Type the number of stops in the route:");
        stops = f_input();

        return stops;
    }
    public static int[] f_passengers(int i){
        Scanner keyboard = new Scanner(System.in);
        int passengers[] = new int[2];

        System.out.println("Type the number of get in passengers in the stop " + i);
        passengers[0] = f_input();

        if (i != 1){
            System.out.println("Type the number of get off passengers in the stop " + i);
            passengers[1] = f_input();
        }

        return passengers;
    }
    public static int f_input(){
        Scanner keyboard = new Scanner(System.in);
        int input;

        input = keyboard.nextInt();

        while (input < 1){
            System.err.println("ERROR, The input must be greater than 0\nRetry:");
            input = keyboard.nextInt();
        }

        return input;
    }
}

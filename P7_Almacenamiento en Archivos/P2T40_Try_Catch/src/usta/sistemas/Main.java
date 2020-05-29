package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 28/05/2020
      Description: This Software calculates the sum of 2 numbers without errors.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("Type the fist number:");
            int number1 = keyboard.nextInt();

            System.out.println("Type the second number:");
            int number2 = keyboard.nextInt();

            int number3 = number1 + number2;

            System.out.println("The sum (" + number1 + " + " + number2 + ") is: " + number3);
        }catch (Exception e){
            System.err.println("ERROR, Tne number must be an integer (public static void main): " + e.toString());
        }
    }
}

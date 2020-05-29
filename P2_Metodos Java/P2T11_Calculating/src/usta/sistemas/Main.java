package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 28/04/2020
      Description: This software calculates the four basic operations with two numbers.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1,num2;
        byte option;

        f_menu();

        System.out.println("Type the fist number:");
        num1 = keyboard.nextDouble();

        System.out.println("Type the second number:");
        num2 = keyboard.nextDouble();

        System.out.println("Select the operation to calculate:\n1.Sum\n2.Difference\n3.Product\n4.Division");
        option = keyboard.nextByte();

        while (option < 1 || option > 4){
            System.err.println("ERROR, The input must be between 1 and 4\nRetry:");
            option = keyboard.nextByte();
        }

        while (num2 == 0 && option == 4){
            System.err.println("The second number cannot be 0 in a division\nType the second number again:");
            num2 = keyboard.nextDouble();
        }

        switch (option){
            case 1:
                f_sum(num1,num2);
                break;
            case 2:
                f_difference(num1,num2);
                break;
            case 3:
                f_product(num1,num2);
                break;
            case 4:
                f_division(num1,num2);
                break;
        }
    }

    public static void f_menu(){
        System.out.println("----------------------");
        System.out.println("|    OperationSoft   |");
        System.out.println("| By: Harrizon Soler |");
        System.out.println("----------------------");
    }

    public static void f_sum(double num1,double num2){
        System.out.println("The sum of " + num1 + " and " + num2 + " is equal of " + (num1 + num2));
    }
    public static void f_difference(double num1,double num2){
        System.out.println("The difference of " + num1 + " and " + num2 + " is equal of " + (num1 - num2));
    }
    public static void f_product(double num1,double num2){
        System.out.println("The product of " + num1 + " and " + num2 + " is equal of " + (num1 * num2));
    }
    public static void f_division(double num1,double num2){
        System.out.println("The division of " + num1 + " and " + num2 + " is equal of " + (num1 / num2));
    }
}

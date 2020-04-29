package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 29/04/2020
      Description: This software calculate the value of N products.
    */

    public static void main(String[] args) {
        f_menu();

        int products = f_products();
        double totalValue = 0;

        for (int i = 1; i <= products; i++){
            totalValue += f_value(i);
        }

        System.out.println("The total value of " + products + " products is " + totalValue + "$");
    }
    public static void f_menu(){
        System.out.println("-----------------------");
        System.out.println("|      Billsoft       |");
        System.out.println("| By: Harrizon Soler  |");
        System.out.println("-----------------------");
    }
    public static int f_products(){
        //Retorna el numero de productos que desea el usuario.
        Scanner keyboard = new Scanner(System.in);
        int Nproducts;

        System.out.println("Type the number of products to calculate:");
        Nproducts = keyboard.nextInt();

        while (Nproducts < 1){
            System.err.println("ERROR, The number of products must be greater than 0\nRetry:");
            Nproducts = keyboard.nextInt();
        }

        return Nproducts;
    }
    public static double f_value(int i){
        Scanner keyboard = new Scanner(System.in);
        double value;

        System.out.println("Type the value for the product " + i);
        value = keyboard.nextDouble();

        while(value < 0){
            System.out.println("ERROR, The value must be greater or equal than 0\nRetry:");
            value = keyboard.nextDouble();
        }

        if (value > 1000){
            value *= 1.19;
        }

        return value;
    }
}

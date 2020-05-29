package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 4/05/2020
      Description: This fotware simulates the total value of n products while sum 500000.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0,product = 0,surplus;
        int index = 0;

        f_menu();

        while (sum <= 500000){ //Repite y verifica el ciclo para no exceder 500000.
            index++; //Va sumando 1 al contador de productos
            System.out.println("Type the value for the product (" + index + "):");
            product = keyboard.nextDouble();

            while (product < 0){
                System.err.println("ERROR, The input must be greater than 0, Retry:");
                product = keyboard.nextDouble();
            }

            sum += product; //Acumula la entrada del usuario

            System.out.print("The bill goes by " + sum);

            if (sum == 500000){
                System.out.println(" (It is recommended not to add more)");
            }

            System.out.println("");
        }
        if (sum > 500000){
            System.out.println("Had to be discounted (" + product + ") of the bill");
            sum -= product;
        }

        surplus = 500000 - sum; //Calcula el sobrante de la compra

        System.out.println("The total of the bill is " + sum + ", left over " + surplus);
    }
    public static void f_menu(){
        //Prints the menu.
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║    Purchasesoft    ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

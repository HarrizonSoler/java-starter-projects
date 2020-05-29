package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 2/05/2020
      Description: This software sum and average the numbers typed by the user until get one lower than 100.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num,sum = 0, average;
        int index = 0;

        f_menu();

        do {
            index++; // Le va sumando 1 al contador
            System.out.println("Type the " + index + " number:");
            num = keyboard.nextDouble();

            sum += num; //Acumula las entradas del usuario
        }while (num >= 100);

        average = sum/index; //Calcula el promedio (El acumulado sobre el contador).

        System.out.println("The sum of " + index + " numbers is: (" + sum + ") and its average is: (" + average + ")");
    }
    public static void f_menu(){
        //Prints the menu.
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║    Hundredsoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

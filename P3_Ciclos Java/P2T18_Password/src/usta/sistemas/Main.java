package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 5/05/2020
      Description: This software simulates a user enter with 3 attemps.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pass,attempts = 3;

        f_menu();

        while (attempts > 0) {
            System.out.println("Type the password to compare:");
            pass = keyboard.nextInt();

            if (pass == 259 || pass == 352 || pass == 569){ // Compara con alguna de las contraseñas
                System.out.println("*******Correct Password*******");
                attempts = 0; // Deja intentos en 0 para terminar el while
            }else {
                attempts--; //Si la caga le resta 1 a los intentos
                System.out.println("Incorrect password (Attemps " + attempts + ")"); //Y le avisa
            }
        }
    }
    public static void f_menu(){
        // Prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Passsoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

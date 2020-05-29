package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 6/05/2020
      Description: This software prints the length of a number typed for the user.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number,digits;

        f_menu();

        System.out.println("Type the number to calculate:");
        number = keyboard.nextInt();

        digits = String.valueOf(Math.abs(number)).length();  //Covierte en string el valor absoluto del numero ingresado para poder sacar su numero de digitos

        System.out.println("The length of the number " + number + " is: " + digits);
    }
    public static void f_menu(){
        //prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║     Lengthsoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

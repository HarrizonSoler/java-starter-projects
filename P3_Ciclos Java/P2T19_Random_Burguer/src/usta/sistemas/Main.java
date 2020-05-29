package usta.sistemas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    Name: Harrizon Alexander Soler Galindo
    Date: 27/04/2020
    Description: This software generates a chance game with a random number.
    */

    public static void main(String[] args) {
	f_menu();

	int randomNumber = f_randomNumber();
	int numberUser = f_input();
	int attemps = 5;

	while (numberUser != randomNumber && attemps > 1){
	    attemps--;
        System.err.println("The number is different than the generated number (Attemps = " + attemps + ")");
        numberUser = f_input();
    }

	if (attemps > 1){
        System.out.println("Congratulations, you win a Olimpo Hamburguer with the number " + randomNumber);
    }else{
        System.out.println("Sorry you lost, The random number was "+ randomNumber);
    }
    }
    public static void f_menu(){
        System.out.println("----------------------");
        System.out.println("|     Burguersoft    |");
        System.out.println("| By: Harrizon Soler |");
        System.out.println("| Date: 27/04/2020   |");
        System.out.println("----------------------");
    }

    public static int f_randomNumber(){
        //Esta funcion crea el numero aleatorio.
        int number = (int) Math.floor(Math.random() * 100 + 1);

        if (number < 50 ){
            System.out.println("Hint 1: The number is minor than 50.");
        }else{
            System.out.println("Hint 1: The number is greater than 50.");
        }

        if (number % 2 == 0){
            System.out.println("Hint 2: The number is pair.");
        }else{
            System.out.println("Hint 2: The number is odd.");
        }

        return number;
    }

    public static int f_input(){
        // Esta funcion pide el numero al usuario.
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Type the number to compare (0 - 100):");
        input = keyboard.nextInt();

        while (input < 0 || input > 100 ){
            System.err.println("ERROR, The input must be between 0 and 100\nRetry:");
            input = keyboard.nextInt();
        }

        return input;
    }
}

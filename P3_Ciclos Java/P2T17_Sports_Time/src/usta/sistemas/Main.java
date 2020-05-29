package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harizon Alexander Soler Galindo
      Date: 4/05/2020
      Description: This software calculates the average and best time of n laps.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int index = 0,bestLap = 0,lap,acum = 0;
        double average;
        boolean tired = false;

        f_menu(); //Imprime la funcion menu.

        while (tired == false){
            index++;// Le va sumando 1 al contador de vueltas.

            lap = f_lap(index); //Recibe la entrada del usuario de la vuelta.

            if (lap < bestLap || index == 1){ //Verifica si este es el mejor tiempo o si es la primera vuelta.
                bestLap = lap;
            }

            acum += lap; //Va acumulando las vueltas para sacar el promedio.

            System.out.println("Are you tired? (true - false):");
            tired = keyboard.nextBoolean();
        }

        average = acum / index;  //Divide el acumulado de tiempo sobre el numero de vueltas hechas.

        System.out.println("The number of laps is " + index + "\nThe best lap is " + bestLap + " seconds\nThe average is " + average + " seconds");
    }
    public static int f_lap(int index){
        // Retorna la entrada del usuario y verifica que sea mayor que 0
        Scanner keyboard = new Scanner(System.in);
        int lap;

        System.out.println("Type the time for the lap " + index + " (in seconds):");
        lap = keyboard.nextInt();

        while (lap <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            lap = keyboard.nextInt();
        }

        return lap;
    }
    public static void f_menu(){
        //Prints the menu.
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║     Sportsoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

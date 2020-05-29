package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/04/2020
      Description: This software calculates the total saves in N months, and their average.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        f_menu();

        int months = f_months();
        double save, acum = 0;

        for (int i = 1; i <= months; i++){
            System.out.println("Type the saves of the month " + i);
            save = keyboard.nextDouble();

            while (save < 0){
                System.err.println("ERROR, The saves must be greater or equal than 0\nRetry (month " + i +"):");
                save = keyboard.nextDouble();
            }

            acum += save;
        }

        System.out.println("The total saves in " + months + " months is " + acum + "$ and the average is " + acum/months + "$");
    }

    public static void f_menu(){
        System.out.println("-----------------------");
        System.out.println("|       Savesoft      |");
        System.out.println("| By: Harrizon Soler  |");
        System.out.println("-----------------------");
    }

    public static int f_months(){
        //Retorna los meses que desea calcular el usuario.
        Scanner keyboard = new Scanner(System.in);
        int months;

        System.out.println("Type the number of months to calculate:");
        months = keyboard.nextInt();

        while (months < 1){
            System.err.println("ERROR, The number of months must be greater than 0\nRetry:");
            months = keyboard.nextInt();
        }

        return months;
    }
}

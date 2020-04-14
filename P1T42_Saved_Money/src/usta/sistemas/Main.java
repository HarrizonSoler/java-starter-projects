package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*Name: Harrizon Alexander Soler Galindo
      Date: 8/04/20
      Description: This software calculates a person's savings from their salary.
     */
    public static void main(String[] args) {
	f_menu();
	f_saved_money();
    }

    public static void f_menu(){
        System.out.println("--------------------------");
        System.out.println("│       Salarysoft       │");
        System.out.println("│ By: Harrizon Soler     │");
        System.out.println("--------------------------\n");
    }

    public static void f_saved_money(){
        Scanner keyboard = new Scanner(System.in);
        double week;

        System.out.println("Type the weekly salary of the user:");
        week = keyboard.nextInt();

        System.out.println("The year user savings is "+(week*7.2)+" and weekly saves "+(week*0.15));
    }
}

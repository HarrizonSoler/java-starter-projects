package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 6/05/2020
      Description: This software stores the salaries of the employees grouped by shift.
    */

    public static void main(String[] args) {
        f_menu();

        int morning[] = f_ArrayExpenses(),afternoon[] = f_ArrayExpenses(),acum; //Genera los salarios aleatorios.

        acum = f_ShowArray("morning",morning) + f_ShowArray("afternoon",afternoon);

        System.out.println("The total salary is: " + acum + "$");
    }
    public static void f_menu(){
        //prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║     2Arraysoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static int[] f_ArrayExpenses(){
        int salary[] = new int[8];

        for (int i = 1; i <= 8; i++){
            salary[i-1] = (int) Math.floor(Math.random()*(2000000-980658)+980658);
        }
        return salary;
    }
    public static int f_ShowArray(String shift,int[] expenses){
        int acum = 0;

        System.out.println("The salaries of " + shift + " shift is:");

        for (int i=1; i <= 8; i++){
            System.out.println("Employee " + i + ": " + expenses[i-1] + "$");
            acum += expenses[i-1];
        }
        System.out.println("The total salary of the " + shift + " shift is: " + acum + "$\n");

        return acum;
    }
}

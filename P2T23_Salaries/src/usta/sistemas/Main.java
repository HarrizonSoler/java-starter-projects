package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 6/05/2020
      Description: This software calculates different salaries.
    */

    public static void main(String[] args) {
        int employees = f_NumberSalaries();
        double salary,max = 0,min = 0,acum = 0,average;

        for (int i = 1; i <= employees; i++){

            salary = f_inputSalary(i);

            acum += salary;

            if (salary > max){
                max = salary;
            }
            if (i == 1 || salary < min){
                min = salary;
            }
        }

        average = acum/employees;

        System.out.println("The maximum salary is " + max + "$" +
                         "\nThe minimum salary is " + min + "$" +
                         "\nThe average is " + average + "$");
    }
    public static void f_menu(){
        //prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║       Paysoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static int f_NumberSalaries(){
        Scanner keyboard = new Scanner(System.in);
        int salaries;

        System.out.println("Type the number of salaries to calculate:");
        salaries = keyboard.nextInt();

        while (salaries <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            salaries = keyboard.nextInt();
        }

        return salaries;
    }
    public static double f_inputSalary(int i){
        Scanner keyboard = new Scanner(System.in);
        double salary;

        System.out.println("Type the salary for the employee " + i);
        salary = keyboard.nextDouble();

        while (salary <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            salary = keyboard.nextDouble();
        }

        return salary;
    }
}

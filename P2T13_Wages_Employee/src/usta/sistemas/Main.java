package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 29/04/2020
      Description: This software calculates the salary of N employees.
    */

    public static void main(String[] args) {
        f_menu();

        int employees = f_employees();
        double salary,acum = 0,hightest = 0,average;

        for (int i = 1; i <= employees; i++){
            salary = f_salary(i);
            acum += salary;

            if (salary > hightest){
                hightest = salary;
            }
        }
        average = acum/employees;

        System.out.println("The total salary is " + acum + "$" +
                         "\nThe average salary is " + average + "$" +
                         "\nThe hightest salary is " + hightest + "$");
    }
    public static void f_menu(){
        System.out.println("----------------------");
        System.out.println("|     Wagesoft       |");
        System.out.println("| By: Harrizon Soler |");
        System.out.println("......................");
    }
    public static int f_employees(){
        Scanner keyboard = new Scanner(System.in);
        int employees;

        System.out.println("Type the number of employees:");
        employees = keyboard.nextInt();

        while (employees < 1){
            System.err.println("ERROR, The input must be greater than 0\nRetry:");
            employees = keyboard.nextInt();
        }

        return employees;
    }
    public static double f_salary(int i){
        Scanner keyboard = new Scanner(System.in);
        double wages;
        int days;

        System.out.println("Type the wage of the employee " + i);
        wages = keyboard.nextDouble();

        while (wages < 0){
            System.err.println("The input must be greater than 0\nRetry:");
            wages = keyboard.nextDouble();
        }

        System.out.println("Type the working days of the employee " + i);
        days = keyboard.nextInt();

        while (days < 1){
            System.err.println("ERROR, The input must be greater than 1");
            days = keyboard.nextInt();
        }

        return (wages/30)*days;
    }
}

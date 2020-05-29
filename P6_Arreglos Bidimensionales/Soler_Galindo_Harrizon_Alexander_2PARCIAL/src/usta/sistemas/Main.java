package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 26/05/2020
      Description:This software simulates the automatic generation of twelve salaries of the year for N employees.
    */

    public static void main(String[] args) {
        int salary[][] = new int[f_Menu_Employees()][12];

        salary = f_FillSalary(salary);

        f_ShowMostSalary(salary);

        f_ShowAverageTotal(salary);

        f_ShowTable(salary);
    }
    public static int f_Menu_Employees(){
        // Prints the menu and request-return the number of employees.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║  SmartPeople.inc   ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of employees to calculate:");
        int employees = keyboard.nextInt();

        while (employees < 1){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            employees = keyboard.nextInt();
        }

        return employees;
    }
    public static int[][] f_FillSalary(int[][] salary){
        //Fill the salaries matrix with random salaries.
        for (int x = 0; x < salary.length; x++){
            for (int y = 0; y < salary[x].length; y++){
                salary[x][y] = (int) (Math.random()*((877803*5)-877804)+877803); //Random Between 877803 and (877803*5)
            }
        }
        return salary;
    }
    public static void f_ShowMostSalary(int[][] salary){
        //Prints the most salary of n employees.
        int acum = 0,mostSalary = 0,salaryEmployee = 0;
        for (int x = 0; x < salary.length; x++){
            for (int y = 0; y < salary[x].length; y++){
                acum += salary[x][y];  //Accumulates the salary of a single employee.
            }
            if (acum > mostSalary){  //Evaluate the acum and determines the most salary.
                mostSalary = acum;
                salaryEmployee = x;
            }
            acum = 0;  //Reboot the acum.
        }

        System.out.println("\nThe employee " + (salaryEmployee+1) + " has the most total salary with " + mostSalary + "$ int 12 months.");
    }
    public static void f_ShowAverageTotal(int[][] salary){
        //Prints the average total and number of employees
        int sum = 0,average;

        for (int x = 0; x < salary.length; x++){
            for (int y = 0; y < salary[x].length; y++){
                sum += salary[x][y];
            }
        }

        average = sum/(salary.length*salary[0].length);

        System.out.println("Employees : " + salary.length + "; Average: " + average + "$; Total: " + sum + "$");
    }
    public static void f_ShowTable(int[][] salary){
        //Prints the table
        System.out.println("\n-----Salary Table-----\n");

        f_ShowColumn("╔═════╦","══════════╦","═══════════╗");

        System.out.print("║  E  ║"); //Start second column

        for (int i=1; i <= 12; i++){
            if (i<10){
                System.out.print(" Month "+ i +"  ║");
            }else{
                System.out.print(" Month "+ i +" ║");
            }
        }

        System.out.println("   Total   ║"); //End second column

        f_ShowColumn("╠═════╬","══════════╬","═══════════╣");

        f_ShowSalaryTotal(salary);

        f_ShowColumn("╚═════╩","══════════╩","═══════════╝");
    }
    public static void f_ShowSalaryTotal(int[][] salary) {
        //Print employees, salaries and totals on the table
        int lenght,lenght2,totalSalary = 0;

        for (int i = 0; i < salary.length; i++){ //Starts print employees
            System.out.print("║  " + (i+1));

            lenght = 3-(String.valueOf(i+1).length()); //Calculate spacing to center employee table

            for (int a=1; a <= lenght; a++){
                System.out.print(" ");
            }

            System.out.print("║");


            for (int a = 0; a < salary[i].length; a++) {
                //Print salaries
                System.out.print(" " + salary[i][a]+"$");

                if (salary[i][a] > 1000000){
                    System.out.print(" ");
                }else{
                    System.out.print("  ");
                }

                System.out.print("║");

                totalSalary += salary[i][a];
            }
            System.out.println(" " + totalSalary + "$ ║");  //Prints the total salary per employee

            totalSalary = 0;
        }
    }
    public static void f_ShowColumn(String str1,String str2,String str3){
        //Prints a 3 strings column
        System.out.print(str1);

        for (int i=1; i <= 12; i++){
            System.out.print(str2);
        }

        System.out.println(str3);
    }
}

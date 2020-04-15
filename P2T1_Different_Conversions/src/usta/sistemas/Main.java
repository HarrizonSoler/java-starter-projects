package usta.sistemas;

import java.rmi.ServerError;
import java.util.Scanner;

public class Main {
    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 15/04/2020
      Description: This software converts different kind of temperature (No use of conditional if :) ).
    */

    public static void main(String[] args) {
        int op1,op2;
        String kind[] = {" °C"," °F"," °K"};
        menu();
        op1 = f_T_Option(1);
        op2 = f_T_Option(2);
        System.out.println("The conversion is equal to "+ f_convert((op1-1),(op2-1),f_T_Input()) + kind[op2-1]);
    }
    public static void menu(){
        System.out.println("-----------------------");
        System.out.println("│       Tempsoft      │");
        System.out.println("│ By: Harrizon Soler  │");
        System.out.println("-----------------------");
    }
    public static int f_T_Option(int i){
        String option[] = {" initial",""}, option1[] = {"from","to"};
        Scanner keyboard = new Scanner(System.in);
        int temp;

        System.out.println("select the type of" + option[i-1] + " temperature " + option1[i-1] + " convert \n" +
                           "(Celcius = 1 ; Farenheit = 2 ; Kelvin = 3):");
        temp = keyboard.nextInt();

        f_error(temp,3);

        return temp;
    }
    public static double f_T_Input(){
        Scanner keyboard = new Scanner(System.in);
        double temp;
        System.out.println("Type the temperature to convert:");
        temp = keyboard.nextDouble();
        return temp;
    }
    public static double f_convert(int x,int y,double z){
        double convert[][] = new double[3][3];
        convert[0][0] = z;              convert[0][1] = z * 1.8 + 32;             convert[0][2] = z + 273.15;
        convert[1][0] = (z - 32) / 1.8; convert[1][1] = z;                        convert[1][2] = convert[1][0] + 273.15;
        convert[2][0] = z - 273.15;     convert[2][1] = convert[2][0] * 1.8 + 32; convert[2][2] = z;

        return convert[x][y];
    }
    public static int f_error(int temp,int fin){
        Scanner keyboard = new Scanner(System.in);
        while (temp<1 || temp>fin){
            System.err.println("ERROR, The input must be between 1 and " + fin +
                               "\nRetry;");
            temp = keyboard.nextInt();
        }
        return temp;
    }
}

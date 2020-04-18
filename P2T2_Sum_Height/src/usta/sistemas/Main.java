package usta.sistemas;

import java.util.Scanner;

public class Main {
       /*
      Name: Harrizon Alexander Soler Galindo
      Date: 15/04/2020
      Description: This software calculates the average height of 5 children).
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double heights[] = new double[5],acum = 0;

	    for (int i = 1;i <= 5;i++){
           System.out.println("Write the height of the children " + i);
           heights[i-1] = keyboard.nextDouble();

           heights[i-1] = f_error(heights[i-1]);

           acum += heights[i-1];
        }

	    for (int i = 1; i <= 5;i++){
            System.out.println("The height of the children "+i+" is "+heights[i-1]);
        }

        System.out.println("\nThe average height of the 5 children is " + (acum/5));
    }
    public static double f_error(double num){
        Scanner keyboard = new Scanner(System.in);

        while (num<0){
            System.err.println("ERROR, The Input must be greater than 0\nRetry:");
            num = keyboard.nextDouble();
        }
        return num;
    }
}

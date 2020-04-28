package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 28/04/2020
      Description: This software calculates the average height of N children.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Ncicles,Nchildren = 0;
        double height,acum = 0;

        System.out.println("Type the number of children to calculates the average height:");
        Ncicles = keyboard.nextInt();

        while (Ncicles <= 0 ){
            System.err.println("ERROR, The input must be greater than 0\nRetry:");
            Ncicles = keyboard.nextInt();
        }

        for (int i = 1; i <= Ncicles; i++){
            System.out.println("Type the height of the children " + i + " in meters");
            height = keyboard.nextDouble();

            while (height <= 0){
                System.err.println("The input must be greater than 0\nRetry:");
                height = keyboard.nextDouble();
            }

            acum += height;
            Nchildren = i;
        }

        System.out.println("The average height of " + Nchildren + " children is " + (acum/Nchildren) + " mts");
    }
}

package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Name: Harrizon Alexander Soler Galindo
      Date: 31/03/20
      Description: This software calculates the volume of a cilinder
     */
    public static void main(String[] args) {
        double r,h;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the radius of the cilinder");
        r = keyboard.nextDouble();

        r = error(r);

        System.out.println("Type the height of the cilinder");
        h = keyboard.nextDouble();

        h = error(h);

        System.out.println("The volume of the cilinder with radius "+r+" and height "+h+" is "+(Math.PI*(Math.pow(r,2))*h));
    }
    public static double error(double var){
        Scanner input = new Scanner(System.in);

        while (var<=0){
            System.out.println("The input must be greater than 0");
            var = input.nextDouble();
        }
        return var;
    }
}

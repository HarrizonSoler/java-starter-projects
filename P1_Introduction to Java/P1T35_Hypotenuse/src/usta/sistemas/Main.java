package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Name: Harrizon Alexander Soler Galindo
       Date: 30/03/20
       Description: This software calculates the hypotenuse of an rectangle triangle
    */
    public static void main(String[] args) {
        double co,ca;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the Hick Opposite");
        co = keyboard.nextDouble();

        co = error(co);

        System.out.println("Type the Hick Adyacent");
        ca = keyboard.nextDouble();

        ca = error(ca);

        System.out.println("The hypotenuse of "+co+" and "+ca+" is "+Math.sqrt(Math.pow(co,2)+Math.pow(ca,2)));
    }

    public static double error(double var){
        Scanner input = new Scanner(System.in);

        while (var<=0){
            System.out.println("ERROR, the input must be greater than 0");
            var = input.nextDouble();
        }
        return var;
    }
}

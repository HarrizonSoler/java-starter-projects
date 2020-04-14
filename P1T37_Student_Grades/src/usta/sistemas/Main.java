package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Name: Harrizon Alexander Soler Galindo
       Date: 31/03/20
       Description: This software calculates the grades of a student
    */

    public static void main(String[] args) {
        double e1,e2,e3,e4,sum;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the grade of exam 1");
        e1 = keyboard.nextDouble();

        e1 = error(e1);

        System.out.println("Type the grade of exam 2");
        e2 = keyboard.nextDouble();

        e2 = error(e2);

        System.out.println("Type the grade of exam 3");
        e3 = keyboard.nextDouble();

        e3 = error(e3);

        System.out.println("Type the grade of exam 4");
        e4 = keyboard.nextDouble();

        e4 = error(e4);

        sum = (e1*0.2) + (e2*0.25) + (e3*0.25) + (e4*0.3);

        System.out.println("The student grade is "+sum);
    }
    public static double error(double var){
        Scanner input = new Scanner(System.in);

        while (var<0 || var>5){
            System.out.println("ERROR, the input must be between 0 and 5");
            System.out.print("Retry: ");
            var = input.nextDouble();
        }
        return var;
    }
}

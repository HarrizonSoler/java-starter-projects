package usta.sistemas;

import java.util.Scanner;

public class Main {

    /* Name: Harrizon Alexander Soler Galindo
       Date: 31/03/20
       Description: This software determines the time of a journey.
     */

    public static void main(String[] args) {
        int op1,op2;
        double dist=0,vel;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type an option");
        System.out.println("1. Tunja to Other City");
        System.out.println("2. Type distance (Km)");
        System.out.println("");
        op1 = keyboard.nextInt();

        op1 = error(op1,2);

        switch (op1){
            case 1:
                System.out.println("Select the city to go");
                System.out.println("1.Bogota (140 Km)");
                System.out.println("2.Medellin (422.6 Km)");
                System.out.println("3.Bucaramanga (282.1 Km)");
                System.out.println("4.Cartagena (933.4 Km)");

                op2 = keyboard.nextInt();

                op2 = error(op2,4);

                switch (op2){
                    case 1: dist = 140;
                     break;
                    case 2: dist = 422.6;
                     break;
                    case 3: dist = 282.1;
                     break;
                    case 4: dist = 933.4;
                     break;
                }
                time(dist);
                break;
            case 2:
                System.out.println("Type the distance of the journey (Km)");
                dist = keyboard.nextDouble();

                disterror(dist);
                time(dist);
                break;
        }
    }
    public static int error(int var,int fin){
        Scanner input = new Scanner(System.in);

        while (var<1 || var>fin){
                System.out.println("ERROR, The input must be between 1 and "+fin);
                System.out.print("Retry: ");
                var = input.nextInt();
            }
        return var;
    }
    public static void time(double dist){
        double vel;
        Scanner inout2 = new Scanner(System.in);

        System.out.println("Type the velocity of the journey (Km/h)");
        vel = inout2.nextDouble();

        disterror(vel);

        System.out.println("The time of the journey is "+Math.round(dist/vel)+" hours");
    }
    public static double disterror(double dist){
        Scanner input3 = new Scanner(System.in);

        while (dist<=0){
            System.out.println("ERROR, The input must be greater than 0");
            System.out.print("Retry: ");
            dist = input3.nextDouble();
        }
        return dist;
    }
}

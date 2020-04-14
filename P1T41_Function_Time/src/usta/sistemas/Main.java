package usta.sistemas;

import java.util.Scanner;

public class Main {

    /* Name: Harrizon Alexander Soler Galindo
       Date: 31/03/20
       Description: This software determines the time of a journey.
     */

    public static void main(String[] args) {
        int op1,op2;
        double vel,dist;
        double distlist[] = {140,422.6,282.1,933.4};
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type an option\n1. Tunja to Other City\n2. Type distance (Km)");
        op1 = keyboard.nextInt();

        op1 = error(op1,2);

        switch (op1){
            case 1:
                System.out.println("Select the city to go\n1.Bogota (140 Km)\n2.Medellin (422.6 Km)\n3.Bucaramanga (282.1 Km)\n4.Cartagena (933.4 Km)");

                op2 = keyboard.nextInt();

                op2 = error(op2,4);

                time(distlist[op2]);
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
        Scanner keyboard = new Scanner(System.in);

        while (var<1 || var>fin){
                System.out.println("ERROR, The input must be between 1 and "+fin);
                System.out.print("Retry: ");
                var = keyboard.nextInt();
            }
        return var;
    }
    public static void time(double dist){
        double vel;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the velocity of the journey (Km/h)");
        vel = keyboard.nextDouble();

        disterror(vel);

        System.out.println("The time of the journey is "+Math.round(dist/vel)+" hours aprox.");
    }
    public static double disterror(double dist){
        Scanner keyboard = new Scanner(System.in);

        while (dist<=0){
            System.out.println("ERROR, The input must be greater than 0");
            System.out.print("Retry: ");
            dist = keyboard.nextDouble();
        }
        return dist;
    }
}

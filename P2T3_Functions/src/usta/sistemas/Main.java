package usta.sistemas;

import java.util.Scanner;

public class Main {
       /*
      Name: Harrizon Alexander Soler Galindo
      Date: 15/04/2020
      Description: This software calculates the area of 3 geometric figures).
    */

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner keyboard = new Scanner(System.in);
        byte op;

        System.out.println("---------------------");
        System.out.println("│      Areasoft     │");
        System.out.println("│ By Harrizon Soler │");
        System.out.println("---------------------\n");

        System.out.println("Select an option:\n1.Area of a Circle\n2.Area of a Triangle\n3.Area of a Square");
        op = keyboard.nextByte();

        f_error_op(op);

        switch (op) {
            case 1:
                a_circle();
                break;
            case 2:
                a_triangle();
                break;
            case 3:
                a_square();
        }
    }

    public static void a_circle() {
        double rad;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the radius of the circle (cm)");
        rad = keyboard.nextDouble();

        rad = f_error(rad);

        System.out.println("The area of the circle is " + (Math.pow(rad, 2) * Math.PI) + " cm2");
    }

    public static void a_triangle() {
        double base, height;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the base of the triangle (cm)");
        base = keyboard.nextDouble();

        base = f_error(base);

        System.out.println("Type the height of the triangle (cm)");
        height = keyboard.nextDouble();

        height = f_error(height);

        System.out.println("The area of the triangle is " + ((base * height) / 2) + " cm2");
    }

    public static void a_square() {
        double side;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the side of the square (cm)");
        side = keyboard.nextDouble();

        side = f_error(side);

        System.out.println("The area of the square is " + (Math.pow(side, 2) + " cm2"));
    }

    public static double f_error(double r) {
        Scanner keyboard = new Scanner(System.in);
        while (r <= 0) {
            System.err.println("ERROR, The input must be greater than 0\nRetry:");
            r = keyboard.nextDouble();
        }
        return r;
    }

    public static byte f_error_op(byte o) {
        Scanner keyboard = new Scanner(System.in);

        while (o < 1 || o > 3) {
            System.err.println("ERROR, The input must be between 1 and 3\nRetry:");
            o = keyboard.nextByte();
        }
        return o;
    }
}

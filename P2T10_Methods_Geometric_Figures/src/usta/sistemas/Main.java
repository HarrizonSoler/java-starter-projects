package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Soler
      Date: 28/04/2020
      Description: This software calculates the area and perimeter of a triangle, square and circle.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte option;

        f_menu();

        System.out.println("Select the kind of figure to calculate:\n1.Triangle\n2.Square\n3.Circle");
        option = keyboard.nextByte();

        while (option<1 || option>3){
            System.err.println("ERROR, The input must be between 1 and 2\nRetry:");
            option = keyboard.nextByte();
        }

        switch (option){
            case 1: f_triangle();
            break;
            case 2: f_square();
            break;
            case 3: f_circle();
        }
    }

    public static void f_menu(){
        System.out.println("---------------------");
        System.out.println("│   Geometrysoft    │");
        System.out.println("│ By Harrizon Soler │");
        System.out.println("---------------------\n");
    }

    public static void f_triangle() {
        Scanner keyboard = new Scanner(System.in);

        if (f_area_or_p() == 1){
            double base, height;

            System.out.println("Type the base of the triangle (cm):");
            base = f_input();

            System.out.println("Type the height of the triangle (cm):");
            height = f_input();

            System.out.println("The area of the triangle is " + (base * height) / 2 + " cm");
        }else if (f_SidesQuest() == 1){
                double side, acum = 0;

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Type the value of the side (" + i + ") (cm)");

                    side = f_input();

                    acum += side;
                }
                System.out.println("The perimeter of the triangle is " + acum);
            }else{
                switch (f_kindTriangle()){
                    case 1:
                        double op, ad, perimeter;

                        System.out.println("Type the value of the Hick Opposite (cm)");
                        op = f_input();

                        System.out.println("Type the value of the Adjacent Leg (cm)");
                        ad = f_input();

                        perimeter = op + ad + Math.sqrt(Math.pow(op, 2) + Math.pow(ad, 2));

                        System.out.println("The perimeter of the triangle is " + perimeter + " cm");
                        break;
                    case 2:
                        double eside,angle,perimeter2;

                        System.out.println("Type the value of the equal side (cm)");
                        eside = f_input();

                        System.out.println("Type the angle that forms the equal sides (cm):");
                        angle = f_input();

                        perimeter2 = (eside * 2) + Math.sqrt(Math.pow(2 * eside, 2) - Math.pow(2 * eside, 2) * Math.cos(angle));

                        System.out.println("The perimeter of the triangle is " + perimeter2 + " cm");
                        break;
                    case 3:
                        double side[] = new double[2],angle1,perimeter3;

                        for (int i=1;i<=2;i++){
                            System.out.println("Type the value of the side " + i);
                            side[i-1] = f_input();
                        }

                        System.out.println("Type the value of the angle that forms the 2 sides");
                        angle1 = f_input();

                        perimeter3 = side[0] + side[1] + (Math.sqrt(Math.pow(side[0],2) + Math.pow(side[1],2) - 2*(side[0] * side[1]) * Math.cos(angle1)));

                        System.out.println("The perimeter of the triangle is " + perimeter3);
                        break;
                }
            }
        }

    public static void f_square(){
        if (f_area_or_p() == 1) {
            switch (f_KindSquare()) {
                case 1:
                    double sideA;

                    System.out.println("Type a side of the square (cm):");
                    sideA = f_input();

                    System.out.println("The area of the square is " + Math.pow(sideA,2) + " cm");
                    break;
                case 2:
                    double diagonalA, diagonalB;

                    System.out.println("Type the first diagonal (cm):");
                    diagonalA = f_input();

                    System.out.println("Type the second diagonal (cm):");
                    diagonalB = f_input();

                    System.out.println("The area of the diamond is " + (diagonalA*diagonalB)/2 + " cm");
                    break;
                case 3:
                case 4:
                    double base,height;

                    System.out.println("Type the base of the figure (cm):");
                    base = f_input();

                    System.out.println("Type the height of the figure (cm):");
                    height = f_input();

                    System.out.println("The area of the figure is " + (base*height) + " cm");
                    break;
            }
        }else
            switch (f_KindSquare()){
                case 1:
                case 2:
                    double side;
                    System.out.println("Type the value of a side (cm)");
                    side = f_input();

                    System.out.println("The perimeter of the figure is" + (side*4) + " cm");
                    break;
                case 3:
                case 4:
                    double sidea,sideb;
                    System.out.println("Type the value of the side A (cm):");
                    sidea = f_input();

                    System.out.println("Type the value of the side B (cm):");
                    sideb = f_input();

                    System.out.println("The perimeter of the figure is " + (2 * (sidea + sideb)) + " cm");
                    break;
                case 5:
                    double side1,acum = 0;

                    for (int i=1 ; i <= 4 ; i++){
                        System.out.println("Type the value of the side " + i);
                        side1 = f_input();

                        acum += side1;
                    }

                    System.out.println("The perimeter of the figure is " + acum + " cm");
                    break;
            }
        }

    public static void f_circle(){
        if (f_area_or_p() == 1){
            double radio;

            System.out.println("Type the radio of the circle (cm):");
            radio = f_input();

            System.out.println("The area of the circle is " + Math.PI * Math.pow(radio,2) + " cm");
        } else {
            double radio1;

            System.out.println("Type the radio of the circle (cm):");
            radio1 = f_input();

            System.out.println("The perimeter of the circle is " + 2 * Math.PI * radio1 + " cm");
        }
    }

    public static byte f_area_or_p() {
        Scanner keyboard = new Scanner(System.in);    //Funcion para solicitar si calcule el perimetro o el area de la figura que llamo la funcion.
        byte op1;

        System.out.println("Type an option to calculate:\n1.Area\n2.Perimeter");
        op1 = keyboard.nextByte();

        while (op1 < 1 || op1 > 2) {
            System.err.println("ERROR, The input must be between 1 and 2\nRetry:");
            op1 = keyboard.nextByte();
        }
        return op1;
    }

    public static byte f_SidesQuest() {  // Funcion que pregunta si conoce los lados de la figura.
        Scanner keyboard = new Scanner(System.in);
        byte op;

        System.out.println("Do you know the value of the sides of the figure? (1 or 0)");
        op = keyboard.nextByte();

        while (op < 0 || op > 1) {
            System.err.println("ERROR, The input must be between 1 and 0\nRetry:");
            op = keyboard.nextByte();
        }
        return op;
    }

    public static byte f_kindTriangle(){
        Scanner keyboard = new Scanner(System.in);
        byte option;

        System.out.println("Select the kind of triangle to calculate:" +   // Ya que selecciona hallar el perimetro, selecciona el tipo de triangulo.
                "\n1.Right Triangle" +
                "\n2.Isoseles Triangle" +
                "\n3.Scalene Triangle");
        option = keyboard.nextByte();

        while (option < 1 || option > 3) {
            System.err.println("ERROR, The input must be between 1 and 3\nRetry:");
            option = keyboard.nextByte();
        }
        return option;
    }

    public static byte f_KindSquare(){
        Scanner keyboard = new Scanner(System.in);
        byte option;

        System.out.println("Select the kind of square to calculate:" +   // Ya que selecciona hallar el perimetro, selecciona el tipo de triangulo.
                "\n1.Square" +
                "\n2.Diamond" +
                "\n3.Rectangle" +
                "\n4.Parallelogram" +
                "\n5.Trapezoid");
        option = keyboard.nextByte();

        while (option < 1 || option > 5) {
            System.err.println("ERROR, The input must be between 1 and 5\nRetry:");
            option = keyboard.nextByte();
        }
        return option;
    }

    public static double f_input() {  //Funcion que detecta si la entrada no es correcta
        Scanner keyboard = new Scanner(System.in);
        double input;

        input = keyboard.nextDouble();

        while (input <= 0) {
            System.err.println("ERROR, The input must be greater than 0\nRetry:");
            input = keyboard.nextDouble();
        }
        return input;
    }
}

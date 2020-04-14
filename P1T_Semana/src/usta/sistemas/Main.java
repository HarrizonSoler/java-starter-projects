package usta.sistemas;

import java.util.Scanner;

public class Main {

    /* Autor: Harrizon Alexander Soler Galindo
       Date: 27 de Marzo 2020
       Descripcion: Este software simula una calculadora :I
     */
        public static void main (String[]args){
            int opcion;
            Scanner keyboard = new Scanner(System.in);

            System.out.println("╔========================================╗");
            System.out.println("║----------Menu-(Calculadora)------------║");
            System.out.println("║ Seleccione una Opcion                  ║");
            System.out.println("║ 1. Sumar                               ║");
            System.out.println("║ 2. Restar                              ║");
            System.out.println("║ 3. Multiplicar                         ║");
            System.out.println("║ 4. Dividir                             ║");
            System.out.println("║ 5. Salir                               ║");
            System.out.println("╚========================================╝");
            System.out.println("");
            opcion = keyboard.nextInt();

            while (opcion < 1 || opcion > 5) {
                System.out.println("ERROR, La entrada debe estar entre 1 y 5");
                System.out.print("Vuelva a intentar: ");
                opcion = keyboard.nextInt();
            }
            System.out.println("");

            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    div(0);
                    break;
            }
        }

        public static void sumar() {
        int n, n1, acum = 0, nn = 0;
        String esp;
        Scanner met1 = new Scanner(System.in);
        System.out.println("Cuantos numeros desea sumar?");
        n = met1.nextInt();

        while (n <= 1) {
            System.out.println("ERROR, la entrada debe ser mayor que 1");
            System.out.print("Vuelva a intentarlo: ");
            n = met1.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite el valor para el numero " + i);
            n1 = met1.nextInt();
            acum += n1;
            nn = i;
        }
        System.out.println("La suma de " + nn + " numeros es igual a " + acum);
}

        public static void restar () {
        int n, n1, acum = 0, nn = 0,esp;
        Scanner met2 = new Scanner(System.in);
        System.out.println("Cuantos numeros desea restar?");
        n = met2.nextInt();

        while (n <= 1) {
            System.out.println("ERROR, la entrada debe ser mayor que 1");
            System.out.print("Vuelva a intentarlo: ");
            n = met2.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite el valor para el numero " + i);
            n1 = met2.nextInt();

            if (i == 1) {
                acum = n1;
            } else {
                acum -= n1;
            }
            nn = i;
        }

        System.out.println("La resta de " + nn + " numeros es igual a " + acum);
    }

        public static void mult () {
        int n, n1, acum = 0, nn = 0,esp;
        Scanner met3 = new Scanner(System.in);
        System.out.println("Cuantos numeros desea multiplicar?");
        n = met3.nextInt();

        while (n <= 1) {
            System.out.println("ERROR, la entrada debe ser mayor que 1");
            System.out.print("Vuelva a intentarlo: ");
            n = met3.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite el valor del numero " + i);
            n1 = met3.nextInt();

            if (i == 1) {
                acum = n1;
            } else {
                acum *= n1;
            }
            nn = i;
        }
        System.out.println("La multiplicacion de " + nn + " numeros es igual a " + acum);
    }

        public static void div ( double a){
        int n2, yes,esp;
        double n1, div, res;
        Scanner met4 = new Scanner(System.in);

        if (a == 0) {
            System.out.println("Digite el valor del dividendo");
            n1 = met4.nextInt();
        } else {
            n1 = a;
        }

        System.out.println("Digite el valor del divisor");
        n2 = met4.nextInt();

        div = n1 / n2;
        res = n1 % n2;

        System.out.println("La division de " + n1 + " entre " + n2 + " es igual a " + div + " con resto " + res);

        System.out.println("Desea dividir " + div + " entre otro numero? (0-1)");
        yes = met4.nextInt();

        while (yes < 0 || yes > 1) {
            System.out.println("ERROR, Entrada no valida, debe ser 0 o 1");
            System.out.print("Vuelva a intentar: ");
            yes = met4.nextInt();
        }

        if (yes == 1) {
            div(div);
        }
    }
}



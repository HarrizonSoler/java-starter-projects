package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
    Name: Harrizon Alexander Soler Galindo
    Date: 30/04/2020
    Description: This software simulates a coffee machine.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        f_menu();

        int total[] = f_drink(),pay;

        System.out.println("Deposit the value of the Drink (Minimum:" + total[0] + "):");
        pay = keyboard.nextInt();

        while (pay < 50 || pay > 5000){
            System.err.println("ERROR, The pay must be between 50 and 5000. Retry:");
            pay = keyboard.nextInt();
        }

        while (pay < total[0]){
            System.err.println( (total[0]-pay) + "$ missing (the drink costs " + total[0] + ")\nDeposit the missing money:");
            pay += keyboard.nextInt();
        }

        if (pay > total[0]){
            System.out.println("Take your residue : (" + (pay-total[0]) + "$)");
        }

        System.out.println("Wait " + total[1] + " seconds, Enjoy your drink!");


    }
    public static void f_menu(){
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║     Coffeesoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static int[] f_drink(){
        Scanner keyboard = new Scanner(System.in);
        int prices[] = {2500,2700,1600,1000,1900,1300},time[] = {60,70,45,30,50,30}, option, value;
        byte glass;

        System.out.println("╔══════════════╦══════════════╦══════════════╗");
        System.out.println("║     ((       ║     ((       ║     ((       ║");
        System.out.println("║      ))      ║      ))      ║      ))      ║");
        System.out.println("║     |▒▒|     ║     |░░|     ║    (|  |     ║");
        System.out.println("║   Ca|▓▓|     ║   Mo|▒▒|     ║   Mi|▓▓|     ║");
        System.out.println("║ 1. Capuccino ║ 2. Mocaccino ║ 3. Cof. Milk ║");
        System.out.println("║    2500$     ║    2700$     ║     1600$    ║");
        System.out.println("║  60 Seconds  ║  70 Seconds  ║  45 Seconds  ║");
        System.out.println("╠══════════════╬══════════════╬══════════════╣");
        System.out.println("║     ((       ║     ((       ║     ((       ║");
        System.out.println("║      ))      ║      ))      ║      ))      ║");
        System.out.println("║     |  |     ║     |  |     ║    (|  |     ║");
        System.out.println("║   Co|░░|     ║   Ch|▒▒|     ║   Ar|░░|     ║");
        System.out.println("║  4. Coffee   ║ 5. Chocolate ║ 6. Aromatic  ║");
        System.out.println("║    1000$     ║    1900$     ║     1300$    ║");
        System.out.println("║  30 Seconds  ║  50 Seconds  ║  30 Seconds  ║");
        System.out.println("╚══════════════╩══════════════╩══════════════╝");
        System.out.println("Select a drink to proceed:\n");

        option = keyboard.nextByte();

        while (option < 1 || option > 6){
            System.err.println("ERROR, The input must be between 1 and 6. Retry:");
            option = keyboard.nextInt();
        }

        System.out.println("Do you want the drink with a glass? (0 - 1)");
        glass = keyboard.nextByte();

        while (glass < 0 || glass > 1){
            System.err.println("ERROR, The input must be between 0 and 1. Retry:");
            glass = keyboard.nextByte();
        }

        value = prices[option-1];

        if (glass == 0){
            value -= 100;
        }

        int total[] = {value,time[option-1]};

        return total;
    }
}

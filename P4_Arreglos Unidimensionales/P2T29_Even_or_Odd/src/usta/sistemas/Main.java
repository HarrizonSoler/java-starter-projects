package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 10/05/2020
      Description: This software clasifies which numbers are even or odd.
    */

    public static void main(String[] args) {
	int num_Values = f_Menu_Values(), values[] = f_FillValues(num_Values);

	f_AnalizeValues(values);
	f_ShowValues(values);
    }
    public static int f_Menu_Values(){
        // Prints the menu and save the number of values to calculate.
        Scanner keyboard = new Scanner(System.in);
        int values;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Evensoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of values to calculate:");
        values = keyboard.nextInt();

        while (values <= 0){
            System.err.println("ERROR, The input must be greater or equal than 0,Retry:");
            values = keyboard.nextInt();
        }
        return values;
    }
    public static int[] f_FillValues(int num_Values){
        //Llena la lista de numeros por entrada del usuario
        Scanner keyboard = new Scanner(System.in);

        int[] values = new int[num_Values];

        for (int i = 0; i < num_Values; i++){
            System.out.println("Type the value for the number " + (i+1) + ":");
            values[i] = keyboard.nextInt();
        }

        return values;
    }
    public static void f_AnalizeValues(int[] values){
        // Clasifica que numeros son pares o impares
        int indexEven = 0, indexOdd = 0;

        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 == 0){
                indexEven++;
            }else {
                indexOdd++;
            }
        }

        System.out.println("There are " + indexEven + " number(s) Even" +
                         "\nThere are " + indexOdd + " number(s) Odd");
    }
    public static void f_ShowValues(int[] values){
        // Muestra una lista de los numeros
        System.out.println("\n----------List of Values----------");
        for (int i = 0; i < values.length; i++){
            System.out.println("Number " + (i+1) + ": " + values[i]);
        }
    }
}

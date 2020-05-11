package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 10/05/2020
      Description: This Software calculates N numbers to compare it.
    */

        public static void main(String[] args) {
            int numbers = f_Menu_Values(), values[] = f_Vector_Values(numbers);

            f_Show_Values(values);
        }
        public static int f_Menu_Values(){
            // Prints the menu and save the number of values to calculate.
            Scanner keyboard = new Scanner(System.in);
            int values;

            System.out.println("           ╔════════════════════╗");
            System.out.println("           ║       Numsoft      ║");
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
        public static int[] f_Vector_Values(int persons){
            //Genera la lista por entrada del usuario.
            Scanner keyboard = new Scanner(System.in);
            int[] values = new int[persons];

            for (int i = 0; i < values.length; i++){
                System.out.println("Type the number for the value " + (i+1) + " (Integer):");
                values[i] = keyboard.nextInt();
            }

            return values;
        }
        public static void f_Show_Values(int[] values){
            //Imprime y analiza la lista de valores.
            int smallestNumber = 0, largestNumber = 0;
            System.out.println("\n----------List of Values----------");

            for (int i = 0; i < values.length; i++){
                System.out.println("Number " + (i+1) + " is: " + values[i]);

                if (values[i] < smallestNumber || i == 0){
                    smallestNumber = values[i];
                }
                if (values[i] > largestNumber){
                    largestNumber = values[i];
                }
            }

            System.out.println("\nThe smallest number is: " + smallestNumber);
            System.out.println("The largest number is: " + largestNumber);
        }
}

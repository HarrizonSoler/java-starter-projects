package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 13/05/2020
      Description: This software fill a matrix with random numbers (1 - 1000) .
    */

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int size[] = f_Menu_RowsColumns(), sum = 0, average, rowIndex;
        int[][] numbersMatrix= new int[size[0]][size[1]];

        numbersMatrix = f_FillNumbers(numbersMatrix);

        System.out.println("Input the row to calculate sum and average (lenght = " + numbersMatrix.length + "):");
        rowIndex = keyboard.nextInt();

        while (rowIndex < 0 || rowIndex > numbersMatrix.length){
            System.err.println("ERROR, The input must be greater than 0 and minor or equal than " + numbersMatrix.length);
            rowIndex = keyboard.nextInt();
        }

        while (rowIndex > 0 ){
            for (int i = 0; i < numbersMatrix[0].length; i++){
                sum += numbersMatrix[rowIndex-1][i];
            }

            average = sum/numbersMatrix[0].length;

            System.out.println("The sum of the row " + rowIndex + " is " + sum + " and the average is " + average);
            System.out.print("Row 12: ");

            for (int i = 0; i < numbersMatrix[0].length; i++){
                System.out.print(" | " + numbersMatrix[rowIndex-1][i]);
            }

            System.out.println(" |");

            System.out.println("Input other row position to calculate: ");
            rowIndex = keyboard.nextInt();
        }

        System.out.println("Thanks for using this software.");

    }
    public static int[] f_Menu_RowsColumns(){
        // Prints the menu and returns the number of competitors to calculate.
        int rows,columns,size[] = new int[2];

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║       Rowsoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of rows to calculate in the matrix:");
        rows = keyboard.nextInt();

        while (rows <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            rows = keyboard.nextInt();
        }

        System.out.println("Type the number of columns to calculate in the matrix:");
        columns = keyboard.nextInt();

        while (columns <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            columns = keyboard.nextInt();
        }

        size[0] = rows; size[1] = columns;

        return size;
    }
    public static int[][] f_FillNumbers(int[][] numbersMatrix){

        for (int x = 0; x < numbersMatrix.length; x++){

            for (int y = 0; y < numbersMatrix[x].length; y++){

                numbersMatrix[x][y] = (int) Math.floor(Math.random()*(1000-1+1)+1);
            }
        }

        return numbersMatrix;
    }

}

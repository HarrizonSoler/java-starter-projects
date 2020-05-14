package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 13/05/2020
      Description: This software simulates rating food.
    */

    public static void main(String[] args) {
	int students = f_Menu_Students(), ratings[][] = f_FillRating(students);

	f_ShowRatings(ratings,students);
    }
    public static int f_Menu_Students(){
        // Prints the menu and returns the number of competitors to calculate.
        Scanner keyboard = new Scanner(System.in);
        int students;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Ratesoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of students to calculate:");
        students = keyboard.nextInt();

        while (students <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            students = keyboard.nextInt();
        }
        return students;
    }
    public static int[][] f_FillRating(int students){
        // This method returns the matrix with the random ratings
        int ratings[][] = new int[students][20];

        for (int i=0; i<students; i++){
            for (int a=0; a<20; a++){
                ratings[i][a] = (int) Math.floor(Math.random()*(10-1+1)+1);
            }
        }

        return ratings;
    }
    public static void f_ShowRatings(int[][] ratings, int students){
        System.out.println("╔════════════╦══════════╦══════════╦══════════╦══════════╦══════════╦══════════╦══════════╦══════════╦══════════╦═══════════╗");
        System.out.println("║  Student   ║ Rating 1 ║ Rating 2 ║ Rating 3 ║ Rating 4 ║ Rating 5 ║ Rating 6 ║ Rating 7 ║ Rating 8 ║ Rating 9 ║ Rating 10 ║");
        System.out.println("╠════════════╬══════════╬══════════╬══════════╬══════════╬══════════╬══════════╬══════════╬══════════╬══════════╬═══════════╣");

        int lenght;

        for (int i = 0; i < students; i++){
            System.out.print("║     " + (i+1));

            lenght = 7-(String.valueOf(i+1).length());

            for (int a=1; a <= lenght; a++){
                System.out.print(" ");
            }

            System.out.print("║");


            for (int a = 0; a < 10; a++) {
                if (a == 9){
                    System.out.print("     " + ratings[i][a]);

                    lenght = 6-(String.valueOf(ratings[i][a]).length());

                    for (int j = 1; j <= lenght; j++){
                        System.out.print(" ");
                    }

                    System.out.println("║");
                }else{
                    System.out.print("    " + ratings[i][a]);

                    lenght = 6-(String.valueOf(ratings[i][a]).length());

                    for (int j = 1; j <= lenght; j++){
                        System.out.print(" ");
                    }

                    System.out.print("║");
                }
            }
        }
        System.out.println("╚════════════╩══════════╩══════════╩══════════╩══════════╩══════════╩══════════╩══════════╩══════════╩══════════╩═══════════╝");
    }
}

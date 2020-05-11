package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 10/05/2020
      Description: This software couts how many words have the letter a and e.
    */

    public static void main(String[] args) {
	int num_Names = f_Menu_Names();
	String[] names = f_Vector_Names(num_Names);

	f_AnalyzeNames(names);
	f_ShowNames(names);
    }
    public static int f_Menu_Names(){
        // Prints the menu and save the number of names to calculate.
        Scanner keyboard = new Scanner(System.in);
        int num_Names;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Namesoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of names to calculate:");
        num_Names = keyboard.nextInt();

        while (num_Names <= 0){
            System.err.println("ERROR, The input must be greater than 0,Retry:");
            num_Names = keyboard.nextInt();
        }
        return num_Names;
    }
    public static String[] f_Vector_Names(int num_Names){
        //Genera la lista por entrada del usuario.
        Scanner keyboard = new Scanner(System.in);
        String[] names = new String[num_Names];

        for (int i = 0; i < names.length; i++){
            System.out.println("Type the string for the name " + (i+1) + ": ");
            names[i] = keyboard.nextLine();
        }

        return names;
    }
    public static void f_AnalyzeNames(String[] names){
        // Busca y cuenta cuantas palabras tienen la letra a y e.
        int index_a = 0,index_e = 0;

        for (int i = 0; i < names.length; i++){
            if (names[i].indexOf('a') != -1 || names[i].indexOf('A') != -1){
                index_a++;
            }
            if (names[i].indexOf('e') != -1 || names[i].indexOf('E') != -1){
                index_e++;
            }
        }

        System.out.println("There are " + index_a + " words with the letter a or A" +
                         "\nThere are " + index_e + " words with the letter e or E");
    }
    public static void f_ShowNames(String[] names){
        //Imprime los nombres ingresados.
        System.out.println("\n----------List of Names----------");

        for (int i = 0; i < names.length; i++){
            System.out.println("Name " + (i+1) + ": " + names[i]);
        }
    }
}

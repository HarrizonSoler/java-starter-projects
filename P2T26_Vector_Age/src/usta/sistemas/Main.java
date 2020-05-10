package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 10/05/2020
      Description: This Software generates N ages and classifies them.
    */

    public static void main(String[] args) {
        int persons = f_Menu_Persons(), ages[] = f_Vector_Ages(persons);

        f_Analize_Ages(ages);

        f_Show_Ages(ages);
    }
    public static int f_Menu_Persons(){
        // Prints the menu and save the number of persons to calculate
        Scanner keyboard = new Scanner(System.in);
        int persons;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║       Agesoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of persons to calculate:");
        persons = keyboard.nextInt();

        while (persons <= 0){
            System.err.println("ERROR, The input must be greater or equal than 0,Retry:");
            persons = keyboard.nextInt();
        }
        return persons;
    }
    public static int[] f_Vector_Ages(int persons){
        //Genera la lista de edades aleatoriamente.
        int[] ages = new int[persons];

        for (int i = 0; i < ages.length; i++){
            ages[i] = (int) Math.floor(Math.random()*(99-2)+1);
        }

        return ages;
    }
    public static void f_Analize_Ages(int[] ages){
        //Clasifica e imprime las personas por edad.
        int under_18 = 0,over_18 = 0,over_60 = 0;

        for (int i = 0; i < ages.length; i++){
            if (ages[i] < 18){
                under_18++;
            } else if (ages[i] >= 18 && ages[i] < 60){
                over_18++;
            }else if (ages[i] >= 60){
                over_60++;
            }
        }

        System.out.println("There are " + under_18 + " people under 18" +
                         "\nThere are " + over_18 + " people over 18" +
                         "\nThere are " + over_60 + " people over 60");
    }
    public static void f_Show_Ages(int[] ages){
        //Imprime la lista de personas con sus edades.
        System.out.println("\n----------List of Ages----------");

        for (int i = 0; i < ages.length; i++){
            System.out.println("Person " + (i+1) + " is: " + ages[i] + " years old");
        }
    }
}

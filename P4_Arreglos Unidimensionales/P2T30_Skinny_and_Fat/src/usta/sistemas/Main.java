package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 7/05/2020
      Description: This software calculates N persons for detect if are skinny, normal or fat.
    */

    public static void main(String[] args) {
        int persons = f_Menu_TotalPersons(),weights[] = f_FillWeights(persons);

        f_AnalyzeWeights(weights);
    }
    public static int f_Menu_TotalPersons(){
        // Prints the menu and save the number of persons to calculate
        Scanner keyboard = new Scanner(System.in);
        int persons;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║     Weightsoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of persons to calculate:");
        persons = keyboard.nextInt();

        while (persons <= 0){
            System.err.println("ERROR, The input must be greater than 0,Retry:");
            persons = keyboard.nextInt();
        }

        return persons;
    }
    public static int[] f_FillWeights(int persons){
        // Return the weight vector
        int weights[] = new int[persons];

        for (int i = 0; i < persons; i++){
            weights[i] =(int) Math.floor(Math.random()*(120-21)+20);
        }

        return weights;
    }
    public static void f_AnalyzeWeights(int[] weights){
        //Dice el tipo de peso de cada persona.
        int totalMal = 0,totalSkin = 0,totalFat = 0;

        for (int i = 0; i < weights.length; i++){
            if (weights[i] < 40){
                System.out.println("The person " + (i+1) + " with the weight " + weights[i] + " is malnourished");
                totalFat++;
            }else if (weights[i] >= 30 && weights[i] < 70){
                System.out.println("The person " + (i+1) + " with the weight " + weights[i] + " is skinny");
                totalSkin++;
            }else if (weights[i] >= 70){
                System.out.println("The person " + (i+1) + " with the weight " + weights[i] + " is fat");
                totalFat++;
            }
        }

        System.out.println("The total malnourished persons is: " + totalMal);
        System.out.println("The total skinny persons is: " + totalSkin);
        System.out.println("The total fat persons is: " + totalFat);
    }
}

package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
       Name: Harrizon Alexander Soler Galindo
       Date: 18/04/20
       Description: This software converts a String to uppercase, replace vowels for @ and prints the fist letter.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;

        menu();

        System.out.println("Type the word to convert (min 5 letters):");
        input = keyboard.nextLine();

        input = f_error(input);

        System.out.println("The fist char of "+ input +" is " + f_irst_char(input));
        System.out.println(input + " to uppercase is " + f_Uppercase(input));
        System.out.println(input + " with replaced vowels is " + f_Vowels(input));
    }
    public static void menu(){
        System.out.println("---------------------");
        System.out.println("│     Stringsoft    │");
        System.out.println("│ By Harrizon Soler │");
        System.out.println("---------------------");
    }
    public static char f_irst_char(String word){
        return word.charAt(0);
    }
    public static String f_Uppercase(String word){
        return word.toUpperCase();
    }
    public static String f_Vowels(String word){
        char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};

        for (int i=1; i<=10 ; i++){
            word = word.replace(vowels[i-1],'@');
        }
        return word;
    }
    public static String f_error(String input){
        Scanner keyboard = new Scanner(System.in);

        while (input.length() < 5){
            System.err.println("ERROR, The input must be greater than 5\nRetry:");
            input = keyboard.nextLine();
        }
        return input;
    }
}

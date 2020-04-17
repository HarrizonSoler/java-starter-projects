package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 16/04/20
      Description: This software determines if a number is multiple of the other
    */

    public static void main(String[] args) {
        int n1,n2;
        Scanner keyboard = new Scanner(System.in);

	    menu();

        System.out.println("Type the fist number:");
        n1 = keyboard.nextInt();

        System.out.println("Type the second number:");
        n2 = keyboard.nextInt();

        if (isMultiple(n1,n2)){
            System.out.println(n1 + " is multiple of " + n2);
        }else{
            System.out.println(n1 + " is not multiple of " + n2);
        }

        if (isMultiple(n2,n1)){
            System.out.println(n2 + " is multiple of " + n1);
        }else{
            System.out.println(n2 + " is not multiple of " + n1);
        }
    }
    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("│     Multiplesoft      │");
        System.out.println("│   By Harrizon Soler   │");
        System.out.println("-------------------------\n");
    }
    public static boolean isMultiple(int n1,int n2){
        if (n2 == 0){
            return false;
        }else {
            if (n1 % n2 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
}

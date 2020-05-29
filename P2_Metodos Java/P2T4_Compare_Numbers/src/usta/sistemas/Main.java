package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
     Name: Harrizon Alexander Soler Galindo
     Date: 16/04/20
     Description: This software determines if 2 numbers are equal or different.
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1,n2;

        menu();

        System.out.println("Type the first number (Integer):");
        n1 = keyboard.nextInt();

        System.out.println("Type the second number (Integer):");
        n2 = keyboard.nextInt();

        System.out.print("The numbers "+ n1 + " and " + n2);

        if (CompareNumbers(n1,n2)){
            System.out.println(" are equal");
        } else{
            System.out.println(" are different");
        }
    }
    public static void menu(){
        System.out.println("------------------------");
        System.out.println("│      Comparesoft     │");
        System.out.println("│   By Harrizon Soler  │");
        System.out.println("------------------------\n");
    }
    public static boolean CompareNumbers(int n1,int n2){
        boolean can;

        if (n1 == n2){
            can = true;
        }else {
            can = false;
        }
        return can;
    }
}

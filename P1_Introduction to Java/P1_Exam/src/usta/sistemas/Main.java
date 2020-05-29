package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	  Name:Harrizon Alexander Soler Galindo
	  Date: 30/03/20
	  Description:This software modifies the user name
    */

	String name,namec;
	Scanner keyboard = new Scanner(System.in);

        System.out.println("╔===============================╗");
        System.out.println("║  Stringsoft USTA 2020         ║");
        System.out.println("║  Version: 1.0                 ║");
        System.out.println("║  Created by: Harrizon Soler   ║");
        System.out.println("╚===============================╝");

        System.out.println("");

        System.out.println("Type your full name");
        name = keyboard.nextLine();

        if (name.length()<6){
            System.out.println("ERROR, the name must be greater than 6 characters, must type name and surname");
        } else if (name.length()>20){
            System.out.println("ERROR, the name must be less than 20 characters, must type name and surname");
        }else{
            namec = name.replace("A","a").replace("E","e").replace("O","o").replace("a","@").replace("e","3").replace("i","1").replace("o","0");

            System.out.println("The name ("+name+") replaced is "+namec);
        }
    }
}

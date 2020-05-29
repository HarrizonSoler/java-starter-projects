package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int lenght;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("----------StringSoft-----------");
        System.out.println("----Made by Harrizon Soler-----");
        System.out.println("Type your Name:");

        name = keyboard.nextLine();
        lenght = name.length();

        if (name.indexOf("Gomez")!=-1){
            System.out.println("Gomez already exist");
        }else {
            System.out.println("Gomez not found in your name");
        }

        System.out.println("Your name in uppercase is "+name.toUpperCase());

        name = name.replace("a","@");
        System.out.println("Your name with @ is "+name);

        if (name.length()<12){
            System.out.println("Your name with cut is "+name.substring(7,lenght));
        }else{
            System.out.println("Your name with cut is "+ name.substring(7,12));
        }
    }
}

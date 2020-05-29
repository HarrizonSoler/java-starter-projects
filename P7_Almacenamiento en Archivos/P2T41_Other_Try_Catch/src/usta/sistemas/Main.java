package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 28/05/2020
      Description: This Software calculates N people without errors.
    */

    public static void main(String[] args) {
        boolean funciona = false;
        int totalPeople;

        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Type the total people");
                totalPeople = keyboard.nextInt();
                funciona = true;
            } catch (Exception e) {
                System.err.println("ERROR, This software allowed only integer");
            }
        }while (funciona == false);
    }
}

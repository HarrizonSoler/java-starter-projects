package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int y1,y2,dif;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the year of birth of the first person");
        y1 = keyboard.nextInt();

        System.out.println("Type the year of birth of the second person");
        y2 = keyboard.nextInt();

        dif = Math.abs(y1-y2);

        System.out.println("The difference between "+y1+" and "+y2);
    }
}

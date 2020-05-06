package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number,negNumbers = 0,sumNeg = 0,numZeros = 0,posNumbers = 0,sumPos = 0;
        double averageNeg,averagePos;

        f_menu();

        for (int i = 1; i <= 10; i++){
            System.out.println("Type the number (" + i + ") to calculate:");
            number = keyboard.nextInt();

            if (number < 0){
                negNumbers++; //Contador de numeros negativos
                sumNeg += number; //Acumulador de los numeros negativos
            }else if (number == 0){
                numZeros++; //Contador de ceros
            }else if (number > 0){
                posNumbers++; //Contador de numeros positivos
                sumPos += number;  //Acumulador de los numeros positivos
            }
        }

        averageNeg = sumNeg / negNumbers; //Calcula la media (acumulado sobre el contador)
        averagePos = sumPos / posNumbers;

        System.out.println("The average of " + negNumbers + " negative numbers is: " + averageNeg +
                         "\nThe average of " + posNumbers + " positive numbers is: " + averagePos +
                         "\nThe number of Zeros is " + numZeros);
    }
    public static void f_menu(){
        //prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║    Separatesoft    ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

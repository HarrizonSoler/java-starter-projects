package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 30/03/20
      Description: This software calculates the sum of products and them IVA
    */
    public static void main(String[] args) {
        int p1,p2,p3,p4,sum;
        double iva,total;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the value of the first product");
        p1 = keyboard.nextInt();

        p1 = error(p1);

        System.out.println("Type the value of the second product");
        p2 = keyboard.nextInt();

        p2 = error(p2);

        System.out.println("Type the value of the third product");
        p3 = keyboard.nextInt();

        p3 = error(p3);

        System.out.println("Type the value of the fourth product");
        p4 = keyboard.nextInt();

        p4 = error(p4);

        sum = p1 + p2 + p3 + p4;
        iva = sum * 0.19;

        System.out.println("The sum of total ("+sum+") and iva ("+iva+") is "+(sum+iva));
    }

    public static int error(int val){
        Scanner input = new Scanner(System.in);

        while (val<0){
            System.out.println("ERROR, the input must be greater than 0");
            val = input.nextInt();
          }
        return val;
    }
}

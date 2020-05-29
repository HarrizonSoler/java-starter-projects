package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
     Name: Harrizon Alexander Soler Galindo
     Date: 11/05/2020
     Description: This software calculates random values for N products (with IVA).
    */

    public static void main(String[] args) {
        int numProducts = f_Menu_Products(), products[] = f_FillProducts(numProducts);

        f_ShowProducts(products);
    }
    public static int f_Menu_Products(){
        // Prints the menu and save the number of products to calculate.
        Scanner keyboard = new Scanner(System.in);
        int numProducts;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Shopsoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of values to calculate:");
        numProducts = keyboard.nextInt();

        while (numProducts <= 0){
            System.err.println("ERROR, The input must be greater or equal than 0,Retry:");
            numProducts = keyboard.nextInt();
        }
        return numProducts;
    }
    public static int[] f_FillProducts(int numProducts){
        //Llena la lista de productos con precios aleatorios entre 1000 y 99000 (añade IVA si es mayor que 10000)
        int[] productsValue = new int[numProducts];

        for (int i = 0; i < numProducts; i++){
            productsValue[i] = (int) Math.floor(Math.random()*(99000-1000+1)+1000);

            if (productsValue[i] >= 10000){
                productsValue[i] *= 1.19;
            }
        }

        return productsValue;
    }
    public static void f_ShowProducts(int[] products){
        //Imprime la lista de productos y su total.
        int totalValue = 0;

        System.out.println("----------List of Products----------");
        for (int i = 0; i < products.length; i++){
            System.out.print("Product " + (i+1) + ": " + products[i] + "$");

            if (products[i] >= 10000){
                System.out.println(" (+IVA)");
            }else {
                System.out.println("");
            }

            totalValue += products[i];
        }

        System.out.println("\nThe total value of " + products.length + " products is: " + totalValue + "$");
    }
}

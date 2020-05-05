package usta.sistemas;

public class Main {

    /*
      Name: Harrizon Aexander Soler Galindo
      Date: 5/05/2020
      Description: This software prints the multiplication table.
    */

    public static void main(String[] args) {
        int multiplicand = 10, multiplier = 10;

        f_menu();

        for (int i = 1; i <= multiplicand; i++) { //Este ciclo limita el multiplicando (a 10)
            for (int a = 1; a <= multiplier; a++) { // Este ciclo limita el multiplicador (se repite 10 veces)
                System.out.println(i + " x " + a + " = " + a * i);
            }
            System.out.println("");
        }
    }
    public static void f_menu(){
        //prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Tablesoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
}

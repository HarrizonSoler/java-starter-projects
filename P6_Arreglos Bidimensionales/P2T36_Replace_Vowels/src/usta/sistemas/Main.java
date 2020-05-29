package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 14/05/2020
      Description: This software replace vowels for symbols and numbers in a matrix.
    */

    public static void main(String[] args) {
        f_Menu();

        String[][] names = {{"maria","pedro","JOSE","camilo","rodrigo"}
	                   ,{"Ana","Lucia","Martha","Juliana","Patricia"},
                        {"Felipe","ALEXANDER","soffy","Carmen","Augusto"},
                        {"Alfredo","Luis","Ramiro","Karen","Andrea"}};

        names = f_ReplaceVowels(names);

        f_ShowNames(names);
    }
    public static void f_Menu(){
        // Prints the menu.

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Repsoft       ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ║ Matrix 4*5 (Names) ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static String[][] f_ReplaceVowels(String[][] names){
        //Replace the vowels of the matrix  (a,e,i,o,u and Uppercase for symbols)
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'}, replace = {'@','3','1','Ø','⌂'};
        int index = 0;

        for (int i=0; i<names.length; i++){
            for (int a=0; a< names[i].length; a++){
                    for (int e = 0; e < 10; e++){
                        names[i][a] = names[i][a].replace(vowels[e],replace[index]);

                        if (index == 4){
                            index = 0;
                        }else{
                            index++;
                        }
                    }
                }
            }
        return names;
    }
    public static void f_ShowNames(String[][] names){
        // Prints the matrix
        for (int i=0; i<names.length; i++){
            System.out.print("(" + (i+1) + ")  ");

            for (int a=0; a<names[i].length; a++){
                System.out.print(names[i][a] + " ");

            }
            System.out.println("");

        }
    }
}

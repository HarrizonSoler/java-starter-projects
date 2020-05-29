package usta.sistemas;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 6/05/2020
      Description: This software prints 5 random salaries between (1000000 - 2000000)
    */

    public static void main(String[] args) {
	int salaries[] = f_RandomArray();

	f_menu();

	f_ShowArray(salaries);
    }
    public static void f_menu(){
        //prints the menu
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Arraysoft     ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static int[] f_RandomArray(){
        //Genera los salarios aleatorios
        int salaries[] = new int[5];

        for (int i = 1; i <= 5; i++){
            salaries[i-1] = (int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        }

        return salaries;
    }
    public static void f_ShowArray(int[] salaries){
        //Imprime los salarios generados
        System.out.println("----------List of Salaries----------");
        for (int i = 1; i <= 5; i++){
            System.out.println("The salary of the employee " + i + " is: " + salaries[i-1] + "$");
        }
    }
}

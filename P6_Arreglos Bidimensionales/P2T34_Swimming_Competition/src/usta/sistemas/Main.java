package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int competitors = f_Menu_Competitors(), numTimes;

        System.out.println("Type how many times have the competition:");
        numTimes = keyboard.nextInt();

        while (numTimes <= 0 || numTimes >= 13){
            System.err.println("ERROR, The input must be between 1 and 12, Retry:");
            numTimes = keyboard.nextInt();
        }

        double times[][] = f_FillTimes(competitors,numTimes);

        f_ShowTable(times,numTimes,competitors);
    }
    public static int f_Menu_Competitors(){
        // Prints the menu and returns the number of competitors to calculate.
        Scanner keyboard = new Scanner(System.in);
        int competitors;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Swimsoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of competitors to calculate:");
        competitors = keyboard.nextInt();

        while (competitors <= 0){
            System.err.println("ERROR, The input must be greater than 0, Retry:");
            competitors = keyboard.nextInt();
        }
        return competitors;
    }
    public static double[][] f_FillTimes(int competitors, int numTimes){
        //This method return a filled matrix of times of the competition
        double times[][] = new double[competitors][numTimes];

        for (int i=0; i<competitors; i++){ //Recorre las columnas
            for (int a=0; a<numTimes; a++){ //Recorre las filas
                times[i][a] =(int) Math.floor(Math.random()*(10-7)+6);
            }
        }
        return times;
    }
    public static void f_ShowTable(double[][] times, int numTimes, int competitors){
        f_ShowColumn(numTimes,"╔════════════╦","═════════╦","════════════╗");

        System.out.print("║ Competitor ║"); //Comienza segunda columna

        for (int i=1; i<=numTimes; i++){
            if (i<10){
                System.out.print(" Time "+ i +"  ║");
            }else{
                System.out.print(" Time "+ i +" ║");
            }
        }

        System.out.println(" Total Time ║"); //Termina Segunda columna

        f_ShowColumn(numTimes,"╠════════════╬","═════════╬","════════════╣");

        f_ShowCompTimeTotal(competitors,numTimes,times);

        f_ShowColumn(numTimes,"╚════════════╩","═════════╩","════════════╝");
    }
    public static void f_ShowCompTimeTotal(int competitors, int numTimes, double[][] times) {
        //Imprime los competidores, tiempos y total en la tabla
        double totalTime = 0;
        int lenght;

        for (int i = 0; i < competitors; i++){ //Inicia imprimir competidores
            System.out.print("║     " + (i+1));

            lenght = 7-(String.valueOf(i+1).length()); //Calcula el espaciado para centrar la tabla de competidores

            for (int a=1; a <= lenght; a++){
                System.out.print(" ");
            }

                System.out.print("║");


            for (int a = 0; a < numTimes; a++) {                  //imprimir tiempos
                System.out.print(" " + times[i][a] + " sec ║");
                totalTime += times[i][a];
            }
            System.out.println("  " + totalTime + " sec  ║");  //Imprime el tiempo total por competidor
            totalTime = 0;
        }
    }
    public static void f_ShowColumn(int numTimes,String str1,String str2,String str3){
        // Imprime una columna de 3 strings
        System.out.print(str1);

        for (int i=1; i<=numTimes; i++){
            System.out.print(str2);
        }

        System.out.println(str3);
    }
}

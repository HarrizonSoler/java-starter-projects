package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 19/05/2020
      Description: This software performs a simulation to vote in a bill on a department in the close of clubs.
    */

    public static int[][] votes = new int[123][2];
    public static int winner,loser;

    public static void main(String[] args) {
        f_Menu();

        f_FillVotes();

        f_ShowWinner();

        f_ShowRawHigher();
        f_ShowRawLower();

        f_ShowArray();
    }
    public static void f_Menu(){
        // Prints the menu.
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Clubsoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static int[][] f_FillVotes(){
        //Fill the votes array randomly
        for (int i=0; i<votes.length; i++){
            votes[i][0] = (int) (Math.random()*5000+1); //Votes NO
            votes[i][1] = (int) (Math.random()*5000+1); //Votes YES
        }
        return votes;
    }
    public static void f_ShowWinner(){
        //Show the winner and the loser
        double total1 = 0, total0 = 0;
        double percent0,percent1;

        for (int i = 0; i < votes.length; i++){
            total0 += votes[i][0];
            total1 += votes[i][1];
        }

        percent0 = Math.round(total0*100/(total0+total1));
        percent1 = Math.round(total1*100/(total0+total1));

        if (total0 == total1){
            System.out.println("The votes are equal, is a tie. (Votes: " + total0 + ")");
        }else if (total0 > total1){
            System.out.println("The winner is NO");
            System.out.println("NO Votes: " +(int) total0 + "; YES Votes: " +(int) total1);
            System.out.println("NO Percent: " +(int) percent0 + "; YES Percent: "+ (int) percent1);
            winner = 0;
            loser = 1;
        }else {
            System.out.println("The winner is YES");
            System.out.println("NO Votes: " +(int) total0 + "; YES Votes: " +(int) total1);
            System.out.println("NO Percent: " +(int) percent0 + "; YES Percent: " +(int) percent1);
            winner = 1;
            loser = 0;
        }
    }
    public static void f_ShowRawHigher(){
        //Show the municipality with highest votes to winner and loser
        int higherWin = 0,higherWinRaw = 0, higherLoser = 0, higherLoserRaw = 0;

        for (int i=0; i<votes.length; i++){
            if (votes[i][winner] > higherWin){
                higherWin = votes[i][winner];
                higherWinRaw = i;
            }
            if (votes[i][loser] > higherLoser){
                higherLoser = votes[i][loser];
                higherLoserRaw = i;
            }
        }

        System.out.println("The municipality with most votes to the winner was " + (higherWinRaw+1) + " (Votes: " + higherWin + ")");
        System.out.println("The municipality with most votes to the loser was " + (higherLoserRaw+1) + " (Votes: " + higherLoser + ")");
    }
    public static void f_ShowRawLower(){
        //Show the municipality with lowest votes to winner and loser
        int lowerWin = 0,lowerWinRaw = 0, lowerLoser = 0, lowerLoserRaw = 0;

        for (int i = 0; i < votes.length; i++){
            if (votes[i][winner] < lowerWin || i == 0){
                lowerWin = votes[i][winner];
                lowerWinRaw = i;
            }
            if (votes[i][loser] < lowerLoser || i == 0){
                lowerLoser = votes[i][loser];
                lowerLoserRaw = i;
            }
        }

        System.out.println("The municipality with lowest votes to the winner was " + (lowerWinRaw+1) + " (Votes: " + lowerWin + ")");
        System.out.println("The municipality with lowest votes to the loser was " + (lowerLoserRaw+1) + " (Votes: " + lowerLoser + ")");
    }
    public static void f_ShowArray(){
        //Show the table with the votes
        int lenght1, lenght2, lenght3;

        System.out.println("╔══════════════╦═════════════╦════════════╗" +
                         "\n║ Municipality ║  Votes NO   ║  Votes YES ║" +
                         "\n╠══════════════╬═════════════╬════════════╣");

        for (int i = 0; i < votes.length; i++){
            lenght1 = 8-(String.valueOf(i+1).length());
            lenght2 = 9-(String.valueOf(votes[i][0]).length());
            lenght3 = 8-(String.valueOf(votes[i][1]).length());

            f_PrintColumn(i+1,lenght1,6);

            f_PrintColumn(votes[i][0],lenght2,4);

            f_PrintColumn(votes[i][1],lenght3,4);

            System.out.println("║");
        }

        System.out.println("╚══════════════╩═════════════╩════════════╝");
    }
    public static void f_PrintColumn(int value,int lenght, int spaces){
        //Prints a column for the f_ShowArray function.
        System.out.print("║");

        for (int b=1; b <= spaces; b++){
            System.out.print(" ");
        }

        System.out.print(value);

        for (int a=1; a <= lenght; a++){
            System.out.print(" ");
        }
    }
}

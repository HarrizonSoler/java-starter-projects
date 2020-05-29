package usta.sistemas;

import java.util.Scanner;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 7/05/2020
      Description: This software generate votes for N candidates.
    */

    public static void main(String[] args) {
        int candidates = f_Menu_Candidates(), votes[] = f_FillVotes(candidates);

        f_ShowWinners(votes);

        f_ShowList(votes);
    }
    public static int f_Menu_Candidates(){
        // Prints the menu and save the number of persons to calculate
        Scanner keyboard = new Scanner(System.in);
        int candidates;

        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Demosoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");

        System.out.println("Type the number of candidates to calculate:");
        candidates = keyboard.nextInt();

        while (candidates < 2){
            System.err.println("ERROR, The input must be greater or equal than 2,Retry:");
            candidates = keyboard.nextInt();
        }
        return candidates;
    }
    public static int[] f_FillVotes(int candidates){
        // Generate the votes aleatory
        int votes[] = new int[candidates];

        for (int i = 0; i < candidates; i++){
            votes[i] = (int) Math.floor(Math.random()*(5000-1)+1);
        }
        return votes;
    }
    public static void f_ShowWinners(int[] votes){
        // Show the first place and return the number of votes.
        int winner_votes = 0,winner = 0;

        for (int i = 0; i < votes.length; i++){
            if (votes[i] > winner_votes){
                winner_votes = votes[i];
                winner = (i+1);
            }
        }
        System.out.println("The winner is the candidate " + winner + " with " + winner_votes + " votes");

        f_ShowSecond(votes,winner_votes);
    }
    public static void f_ShowSecond(int[] votes, int winner_votes){
        // Show the second place and return the number of votes.
        int second_votes = 0,second = 0;

        for (int i = 0; i < votes.length; i++){
            if (votes[i] > second_votes && votes[i] < winner_votes){
                second_votes = votes[i];
                second = (i+1);
            }
        }
        System.out.println("The second place candidate is " + second + " with " + second_votes + " votes");

        f_ShowThird(votes,second_votes);
    }
    public static void f_ShowThird(int[] votes, int second_votes){
        // Show the third place.
        int third_votes = 0,third = 0;

        for (int i = 0; i < votes.length; i++){
            if (votes[i] > third_votes && votes[i] < second_votes){
                third_votes = votes[i];
                third = (i+1);
            }
        }
        System.out.println("The third place candidate is " + third + " with " + third_votes + " votes");
    }
    public static void f_ShowList(int[] votes){
        // Prints the list of candidates, their votes and the total votes
        int acum = 0;
        System.out.println("\n*********Candidates List*********");

        for (int i = 0; i < votes.length; i++){
            System.out.println("Candidate " + (i+1) + " with " + votes[i] + " votes");
            acum += votes[i];
        }
        System.out.println("\nThe total votes is: " + acum + " votes");
    }
}

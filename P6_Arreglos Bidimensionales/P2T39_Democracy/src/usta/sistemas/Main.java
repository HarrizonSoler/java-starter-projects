package usta.sistemas;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 21/05/2020
      Description: This software generates the votes of 123 municipalities for 8 candidates.
    */

    public static int votes[][] = new int[123][8], total[] = new int[8];
    public static String parties[] = {"Liberal","Conservador","Alianza Verde","de la U","Cambio Radical","Centro Democratico","Mira","Polo"};
    public static int winnerVotes = 0, winnerColumn = 0;

    public static void main(String[] args){
        f_Menu();

        f_FillVotes();
        f_SumColumns();

        f_ShowWinner();
    }
    public static void f_Menu(){
        // Prints the menu.
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║      Demsoft       ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static int[][] f_FillVotes(){
        for (int x = 0; x < votes.length; x++){
            for (int y = 0; y < votes[x].length; y++){
                votes[x][y] = (int) (Math.random()*1000+1);
            }
        }
        return votes;
    }
    public static int[] f_SumColumns(){
        for (int x = 0; x < votes[0].length; x++){
            for (int y = 0; y < votes[x].length; y++){
                total[x] += votes[x][y];
            }
        }
        return total;
    }
    public static void f_ShowWinner(){
        int winner = 0,second = 0;

        for (int i = 0; i < total.length; i++){
            if (total[i] > winner){
                winner = i;
            }
            if (total[i] > second && total[i] < total[winner]){
                second = i;
            }
        }

        System.out.println("The winner is " + parties[winner] + " party with " + total[winner] + " votes");
        System.out.println("The second is " + parties[second] + " party with " + total[second] + " votes");
    }
}

package usta.sistemas;

public class Main {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 12/05/2020
      Description: This software store student grades in a matrix
    */

    public static void main(String[] args) {
        double[][] matrix = f_FillStudents();

        f_Menu();
        f_ShowFGrades(matrix);
    }
    public static void f_Menu(){
        // Prints the menu.
        System.out.println("           ╔════════════════════╗");
        System.out.println("           ║     Gradesoft      ║");
        System.out.println("           ║ By: Harrizon Soler ║");
        System.out.println("           ╚════════════════════╝\n");
    }
    public static double[][] f_FillStudents(){
        //This method returns the matrix filled (10x4)
        double matrix[][] = new double[10][4];
        for (int i = 0; i < 10; i++){
            for (int j=0 ; j<4; j++){
                matrix[i][j] = Math.floor((Math.random()*5)+1);
            }
        }
        return matrix;
    }
    public static void f_ShowFGrades(double[][] matrix){
        //Show the grades of the filled matrix and the average grades of each student.
        double finalGrade;
        System.out.println("\n********** Students Grades **********");

        for (int i = 0; i < 10; i++){
            System.out.println("Student " + (i+1) + ":");

            for (int a = 0; a < 4; a++){
                System.out.println("Grade " + (a+1) + ": " + matrix[i][a]);
            }
            finalGrade = (matrix[i][0] * 0.2) + (matrix[i][1] * 0.25) + (matrix[i][2] * 0.25) + (matrix[i][3] * 0.3);

            System.out.println("Final Grade (Student " + (i+1) + "): " + finalGrade + "\n");
        }
    }
}

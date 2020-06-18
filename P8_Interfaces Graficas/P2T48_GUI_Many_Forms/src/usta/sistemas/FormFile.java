package usta.sistemas;

/*
  Name: Harrizon Alexadner Soler Galindo
  Date: 9/06/2020
  Descrition: This class create and show data in a txt archive.
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FormFile {
    public static boolean addStudent(String name, String lastName, String faculty){
        //Create new file and add a new line in txt archive

        try {
            File file = new File("src/usta/sistemas/Students.txt");
            String jump = "";
            Boolean append;

            if(!file.exists()){ // If the file doesn't exist create it!
                file.createNewFile();

                append = false; // Dont jump the line
            }else {
                Scanner fileReader = new Scanner(file);
                append = true; // Append the file
                    jump = "\n"; // Jump the line

            }

            FileWriter file1 = new FileWriter(file,append);
            BufferedWriter dataFile = new BufferedWriter(file1);

            dataFile.write(jump + name + " | " + lastName + " | " + faculty);
            dataFile.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}

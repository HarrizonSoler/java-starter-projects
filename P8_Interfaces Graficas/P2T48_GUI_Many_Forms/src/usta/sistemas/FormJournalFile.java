package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FormJournalFile {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/06/2020
      Description: This class create the journals file and register the information.
    */

    public static boolean addJournal(String name, String url, String ISBN){
        //Create new file and add a new line in txt archive

        try {
            File file = new File("src/usta/sistemas/Journals.txt");
            String jump = "";
            Boolean append;

            if(!file.exists()){
                file.createNewFile(); // If the file doesn't exist create it!

                append = false; // Dont jump the line
            }else {
                Scanner fileReader = new Scanner(file);
                append = true;

                    jump = "\n"; // Jump the line

            }

            FileWriter file2 = new FileWriter(file,append);
            BufferedWriter dataFile = new BufferedWriter(file2);

            dataFile.write(jump + name + " | " + url + " | " + ISBN); // Write the information.
            dataFile.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}

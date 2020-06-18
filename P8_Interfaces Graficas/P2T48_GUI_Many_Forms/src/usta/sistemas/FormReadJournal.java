package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class FormReadJournal extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/06/2020
      Description: This class read the journals archive and put it in a table.
    */

    JPanel headPanel = new JPanel(new GridLayout(1,2));
    JPanel upperLeftPanel = new JPanel(new BorderLayout(10,10));
    JPanel upperRightPanel = new JPanel(new BorderLayout(10,10));
    JScrollPane centralPanel;
    File file = new File("src/usta/sistemas/Journals.txt");
    boolean close;

    public FormReadJournal(){
        if (file.exists()) { //If the file exists proceed with read the file and set the window.
            setTitle("Read Journals - Test Software"); //Window Title
            setLayout(new BorderLayout()); //Window Layout

            setHead();
            setTable();

            close = true;
            setVisible(true);
            setSize(500, 200);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }else{
            close = false;
            FormPopUp alert = new FormPopUp("No Data in Journals File");
        }
    }
    private void setHead(){
        //Create and initialize the back button and the window title.
        add(headPanel, BorderLayout.NORTH);
        headPanel.add(upperLeftPanel);
        headPanel.add(upperRightPanel);

        JButton back = new JButton("Back");
        upperLeftPanel.add(back,BorderLayout.CENTER);
        upperLeftPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the button
        upperLeftPanel.add(new JLabel(),BorderLayout.WEST);
        upperLeftPanel.add(new JLabel(),BorderLayout.EAST);
        upperLeftPanel.add(new JLabel(),BorderLayout.SOUTH);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormMenu menu = new FormMenu(); //Create the menu window
                setVisible(false); //Close this
            }
        });

        JLabel title = new JLabel("Read Journal",SwingConstants.CENTER);
        title.setFont(new Font("Arial",0,22));
        upperRightPanel.add(title,BorderLayout.CENTER);
        upperRightPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the title.
        upperRightPanel.add(new JLabel(),BorderLayout.WEST);
        upperRightPanel.add(new JLabel(),BorderLayout.EAST);
        upperRightPanel.add(new JLabel(),BorderLayout.SOUTH);
    }
    private String[][] fillJournals(){
        //Read and Clasifies the file info in an array.
        String journals[][] = null, principalLine, tempLine;
        int lines = 0,row = 0;
        byte separator1, separator2;

        try {
            Scanner file2 = new Scanner(file);

            while (file2.hasNextLine()){ //Count the number of lines of the file
                lines++;
                file2.nextLine();
            }
            file2.close();

            journals = new String[lines][3]; //Set the info array of lines size.
            file2 = new Scanner(file);

            while (file2.hasNextLine()){ //Read each line of the file
                principalLine = file2.nextLine();
                separator1 =(byte) principalLine.indexOf("|"); //Separate the line data

                journals[row][0] = principalLine.substring(0,separator1); // Set the journal name

                tempLine = principalLine.substring(separator1+1);

                separator2 =(byte) tempLine.indexOf("|"); //Separate the line data

                journals[row][1] = tempLine.substring(0,separator2); // Set the journal link

                journals[row][2] = tempLine.substring(separator2+1); // Set the journal special number
                row++; //Runs the rows.
            }
            file2.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return journals;
    }
    private void setTable(){
        // Create and Initialize the Table.
        String[][] journals = fillJournals(); //Initialize the array
        String[] header = {"Name","URL","ISBN"}; // Set the table header
        JTable table = new JTable(journals,header); //Initialize the table
        table.setBounds(10, 50, 590, 300); // Table Size
        table.setFont(new Font("Arial", 0, 15)); // Table Font

        centralPanel = new JScrollPane(table);
        add(centralPanel,BorderLayout.CENTER); // Add the table to the window.
    }
    public static void main(String[] args){
        FormReadJournal form = new FormReadJournal();
    }
}

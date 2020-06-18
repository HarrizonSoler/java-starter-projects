package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class FormReadStudent extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/06/2020
      Description: This read the students file info and print it in a table.
    */

    JPanel panel1 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    JScrollPane panel2;
    Boolean close;

    public FormReadStudent() {
        File file = new File("src/usta/sistemas/Students.txt");
        if (file.exists()) { //If the file exists proceed with read the file and set the window.
            setTitle("Read Students - Test Software"); //Window Title
            setLayout(new BorderLayout()); //Window Layout

            setHead();

            setTable();

            close = true;
            setVisible(true);
            setSize(400, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }else{
            close = false;
            FormPopUp alert = new FormPopUp("No Data in Students File"); //Create a pop-up window.
        }
    }

    private String[][] fillStudents() {
        //Read and Clasifies the file info in an array.
        String[][] students = null;
        String principalLine, tempLine;
        byte lines = 0, row = 0, separator1, separator2;

        try {
            File file = new File("src/usta/sistemas/Students.txt");

                Scanner file1 = new Scanner(file);

                while (file1.hasNextLine()) { //Count the number of lines of the file
                    lines++;
                    file1.nextLine();
                }
                file1.close();

                students = new String[lines][3]; //Set the info array of lines size.
                file1 = new Scanner(file);

                while (file1.hasNextLine()) { //Read each line of the file
                    principalLine = file1.nextLine();
                    separator1 = (byte) principalLine.indexOf("|"); //Separate the line data

                    students[row][0] = principalLine.substring(0, separator1); //Set the Student name.

                    tempLine = principalLine.substring(separator1 + 1);

                    separator2 = (byte) tempLine.indexOf("|"); //Separate the line data

                    students[row][1] = tempLine.substring(0, separator2); //Set the Student last name.
                    students[row][2] = tempLine.substring(separator2 + 1); //Set the Student Faculty.
                    row++; //Runs the Rows
                }
                file1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    private void setHead() {
        //Create and initialize the back button and the window title.
        panel1.setLayout(new GridLayout(1, 2));
        add(panel1, BorderLayout.NORTH);
        panel11.setLayout(new BorderLayout(10, 10));
        panel1.add(panel11);
        panel12.setLayout(new BorderLayout());
        panel1.add(panel12);

        JButton back = new JButton("Back");
        panel11.add(back, BorderLayout.CENTER);
        panel11.add(new JLabel(), BorderLayout.NORTH); //Putting up many labels to center the button
        panel11.add(new JLabel(), BorderLayout.WEST);
        panel11.add(new JLabel(), BorderLayout.EAST);
        panel11.add(new JLabel(), BorderLayout.SOUTH);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormMenu menu = new FormMenu(); //Create the menu window.
                setVisible(false); //Close This.
            }
        });

        JLabel title = new JLabel("Read Students", SwingConstants.CENTER);
        title.setFont(new Font("Arial", 0, 22));
        panel12.add(title, BorderLayout.CENTER);
        panel12.add(new JLabel(), BorderLayout.NORTH); //Putting up many labels to center the button
        panel12.add(new JLabel(), BorderLayout.WEST);
        panel12.add(new JLabel(), BorderLayout.EAST);
        panel12.add(new JLabel(), BorderLayout.SOUTH);
    }

    private void setTable() {
        // Create and Initialize the Table.
        String[][] students = fillStudents(); //Initialize the array
        String[] header = {"Name", "Last Name", "Faculty"}; // Set the table header
        JTable table = new JTable(students, header); //Initialize the table
        table.setBounds(10, 50, 590, 300); //Table Size
        table.setFont(new Font("Arial", 0, 15)); //Table Font

        panel2 = new JScrollPane(table);
        add(panel2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FormReadStudent form4 = new FormReadStudent();
    }
}

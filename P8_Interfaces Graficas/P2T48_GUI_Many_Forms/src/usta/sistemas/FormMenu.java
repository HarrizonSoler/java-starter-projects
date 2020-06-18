package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMenu extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 14/06/2020
      Description: This class meet the buttons with their respective JFrames.
    */

    JPanel gridPanel = new JPanel(new GridLayout(3,2,5,5)); //Declaring and initializing the Grid Panel

    public FormMenu(){
        setTitle("Menu - Test Software"); //Window Title
        setLayout(new BorderLayout(5,0)); //Window Layout

        add(gridPanel,BorderLayout.CENTER); //Declaring the central grid to the buttons
        add(new JLabel(),BorderLayout.WEST); // Putting up labels to center the grid
        add(new JLabel(),BorderLayout.EAST);

        configureLabels();
        configureButtons();

        //Set JFrame
        setVisible(true);
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void configureLabels(){
        //Declaring and initializing the labels (author and title), their fonts and alignment.
        JLabel title = new JLabel("Menu",SwingConstants.CENTER);
        title.setFont(new Font("Arial",0,20));
        add(title,BorderLayout.NORTH);

        JLabel by = new JLabel("By: Harrizon Alexander Soler Galindo",SwingConstants.LEFT);
        by.setFont(new Font("Arial",0,15));
        add(by,BorderLayout.SOUTH);
    }
    private void configureButtons(){
        //Declaring the buttons with their respective fonts and events.
        JButton b1 = new JButton("New Student"); //This button go to FormRegStudent class.
        b1.setFont(new Font("Arial",0,15));
        gridPanel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormRegStudent newStudent = new FormRegStudent();
                setVisible(false);
            }
        });

        JButton b2 = new JButton("Read Students");//This button go to FormReadStudent class.
        b2.setFont(new Font("Arial",0,15));
        gridPanel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormReadStudent readStudent = new FormReadStudent();
                if (readStudent.close){
                    setVisible(false);
                }
            }
        });

        JButton b3 = new JButton("New Journal");//This button go to FormRegJournal class.
        b3.setFont(new Font("Arial",0,15));
        gridPanel.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormRegJournal formJournal = new FormRegJournal();
                setVisible(false);
            }
        });

        JButton b4 = new JButton("Read Journals");//This button go to --- class.
        b4.setFont(new Font("Arial",0,15));
        gridPanel.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormReadJournal form = new FormReadJournal();
                if (form.close){
                    setVisible(false);
                }
            }
        });

        JButton about = new JButton("About");//This button go to FormAcercade class.
        about.setFont(new Font("Arial",0,15));
        gridPanel.add(about);
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormAcercade about = new FormAcercade();
                setVisible(false);
            }
        });
    }
    public static void main(String[] args){
        FormMenu form2 = new FormMenu();
    }
}

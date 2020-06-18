package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormRegJournal extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/06/2020
      Description: This class register the journal information from the user.
    */

    JPanel topPanel = new JPanel(new GridLayout(1,2)); //Declaring and initializing the panels
    JPanel bottomPanel = new JPanel(new BorderLayout(10,10));
    JPanel centralPanel = new JPanel(new GridLayout(3,2,5,5));
    JPanel upperLeftPanel = new JPanel(new BorderLayout(10,10));
    JPanel upperRightPanel = new JPanel(new BorderLayout(10,10));
    JTextField name = new JTextField(); //Declaring and initializing the text fields of the grid
    JTextField link = new JTextField();
    JTextField ISBN = new JTextField();

    public FormRegJournal(){
        setTitle("Register Journal - Test Software"); //Window Title
        setLayout(new BorderLayout()); //Window Layout

        setPanels();

        JLabel title = new JLabel("Register Magazine"); //Declaring and initializing the title label.
        title.setFont(new Font("Arial",0,22));
        upperRightPanel.add(title,BorderLayout.CENTER);
        upperRightPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the title.
        upperRightPanel.add(new JLabel(),BorderLayout.WEST);
        upperRightPanel.add(new JLabel(),BorderLayout.EAST);
        upperRightPanel.add(new JLabel(),BorderLayout.SOUTH);

        setButtons();
        fillGrid();

        setVisible(true);
        setSize(450,230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void setPanels(){
        //Initializing the panels of the window
        add(topPanel,BorderLayout.NORTH);
        add(bottomPanel,BorderLayout.SOUTH);
        add(centralPanel,BorderLayout.CENTER);
        topPanel.add(upperLeftPanel);
        topPanel.add(upperRightPanel);
    }
    private void setButtons(){
        //Declaring and initializing the buttons (add and back)
        JButton back = new JButton("Back");
        back.setFont(new Font("Arial",0,15));
        upperLeftPanel.add(back,BorderLayout.CENTER);
        upperLeftPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the button
        upperLeftPanel.add(new JLabel(),BorderLayout.WEST);
        upperLeftPanel.add(new JLabel(),BorderLayout.EAST);
        upperLeftPanel.add(new JLabel(),BorderLayout.SOUTH);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormMenu menu = new FormMenu();
                dispose();
            }
        });

        JButton add = new JButton("Add"); //Declare and Initializing the add button with their event.
        add.setFont(new Font("Arial",0,17));
        bottomPanel.add(add,BorderLayout.CENTER);
        bottomPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the button
        bottomPanel.add(new JLabel(),BorderLayout.WEST);
        bottomPanel.add(new JLabel(),BorderLayout.EAST);
        bottomPanel.add(new JLabel(),BorderLayout.SOUTH);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (name.getText().length() < 3 || link.getText().length() < 3 || ISBN.getText().length() < 3){
                    FormPopUp alert = new FormPopUp("Missing information in Journal Data");
                }else {
                    FormJournalFile journalFile = new FormJournalFile();
                    boolean result = journalFile.addJournal(name.getText(),link.getText(),ISBN.getText());

                    if (result) {
                        FormPopUp alert = new FormPopUp("Journal Registered Sucessful");

                        name.setText(""); //Clean the text fields
                        link.setText("");
                        ISBN.setText("");
                    } else {
                        FormPopUp alert = new FormPopUp("Journal cannot be Registered");
                    }
                }
            }
        });
    }
    private void fillGrid(){
        //Declare and initialize the labels and textfields of the grid
        JLabel lbname = new JLabel("Journal Name:",SwingConstants.CENTER);
        lbname.setFont(new Font("Arial",0,15));
        centralPanel.add(lbname);

        centralPanel.add(name);

        JLabel lblink = new JLabel("Journal URL:",SwingConstants.CENTER);
        lblink.setFont(new Font("Arial",0,15));
        centralPanel.add(lblink);

        centralPanel.add(link);

        JLabel lbISBN = new JLabel("ISBN:",SwingConstants.CENTER);
        lbISBN.setFont(new Font("Arial",0,15));
        centralPanel.add(lbISBN);

        centralPanel.add(ISBN);
    }
    public static void main(String[] args){
        FormRegJournal form = new FormRegJournal();
    }
}

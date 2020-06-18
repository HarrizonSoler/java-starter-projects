package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormStart extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 14/06/2020
      Description: This class houses the initial button to enter to the program menu.
    */

    JPanel panelNorth = new JPanel(new BorderLayout(5,10)); //Declaring and initializing Panels
    JPanel panelSouth = new JPanel(new BorderLayout(20,15));

    public FormStart(){
        setTitle("Test Software"); //Window Title
        setLayout(new BorderLayout(5,10)); //Window Layout

        configurePanels();
        configureLabels();
        configureButtons();

        //Window Initialize
        setVisible(true);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void configurePanels(){
        //Declaring the position of the Panels in the window.
        add(panelNorth,BorderLayout.NORTH);
        add(panelSouth,BorderLayout.CENTER);
    }
    private void configureLabels(){
        //Declaring and initializing the labels (author and title) and their fonts.
        JLabel title = new JLabel("Test Software",SwingConstants.CENTER);
        JLabel name = new JLabel("Harrizon Alexander Soler Galindo",SwingConstants.CENTER);
        title.setFont(new Font("Arial",0,24));
        name.setFont(new Font("Arial",0,15));
        panelNorth.add(name,BorderLayout.CENTER);
        panelNorth.add(title,BorderLayout.NORTH);
    }
    private void configureButtons(){
        //Declaring and initializing the initial button (action and alingment).
        JButton iniciar = new JButton("Start");
        panelSouth.add(iniciar,BorderLayout.CENTER);
        panelSouth.add(new JLabel(""),BorderLayout.SOUTH); //Putting up many labels to align the button in center
        panelSouth.add(new JLabel(""),BorderLayout.NORTH);
        panelSouth.add(new JLabel(""),BorderLayout.EAST);
        panelSouth.add(new JLabel(""),BorderLayout.WEST);
        iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormMenu menu = new FormMenu(); //Open the menu
                setVisible(false); //Hide this window
            }
        });
    }
    public static void main(String[] args){
        FormStart form = new FormStart();
    }
}

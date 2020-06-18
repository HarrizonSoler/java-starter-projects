package usta.sistemas;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPopUp extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/06/2020
      Description: This class create a pop-up window for alert the user of many events.
    */

    Panel panelUp = new Panel();
    Panel panelDown = new Panel();
    Panel panelCenter = new Panel();
    Panel panelLeft = new Panel();

    public FormPopUp(String text) {
        setTitle("Alert - Test Software"); // Window Title
        setLayout(new BorderLayout()); // Window Layout

        setPanels();
        setLabels(text);
        setButton();

        getContentPane().setBackground(Color.GRAY); // Set the color of the window
        setUndecorated(true); //Set the window without borders.
        setVisible(true);
        setSize(370, 115); //Set the size of the window
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void setPanels(){
        // Initialize and Set the panels
        panelUp.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelDown.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(2, 1));
        panelLeft.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(panelCenter, BorderLayout.CENTER);
        add(panelLeft,BorderLayout.WEST);
        panelCenter.add(panelUp);
        panelCenter.add(panelDown);
    }
    private void setLabels(String text){
        //Create the image and text labels.
        JLabel label = new JLabel(); //Create the image label.
        label.setSize(100, 100); // Set the image size.
        String fileRoute = ""; // Create the file route.
        String[] texts = {"Missing information in Student Data","Student cannot be Registered","No Data in Students File","Missing information in Journal Data","Journal cannot be Registered"};
        Boolean agreement = false;

        for (String i : texts){ // Runs the text array for determine the window principal image
            if (i == text){
                agreement = true;
            }
        }

        if (agreement){ // If agreement is true (bad event), set the route to alert.png alse to sucess.png
            fileRoute = "src/usta/sistemas/Alert.png";
        }else{
            fileRoute = "src/usta/sistemas/Sucess.png";
        }

        ImageIcon image = new ImageIcon(fileRoute);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        panelLeft.add(label); // Add the image to the left panel

        JLabel title = new JLabel("Warning", SwingConstants.CENTER);
        title.setFont(new Font("Arial", 0, 25));
        title.setForeground(Color.WHITE);
        //title.setOpaque(true);
        panelUp.add(title);

        JLabel desc = new JLabel(text, SwingConstants.CENTER);
        desc.setFont(new Font("Arial", 0, 15));
        desc.setForeground(Color.WHITE);
        panelDown.add(desc);
    }
    private void setButton(){
        // Create an initialize the back button.
        JButton close = new JButton("Close");
        close.setBackground(Color.WHITE);
        panelDown.add(close);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
    }
}

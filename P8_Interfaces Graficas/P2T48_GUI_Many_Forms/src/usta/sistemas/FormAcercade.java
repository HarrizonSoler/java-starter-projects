package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormAcercade extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 18/06/2020
      Description: This class prints on screen author info and image.
    */

    Panel panelLeft = new Panel(); // Principal Panels
    Panel panelRight = new Panel();
    Panel panelInfo = new Panel(); // Subareas
    Panel panelShield = new Panel();
    Panel panelImage = new Panel();
    Panel panelBack = new Panel();

    public FormAcercade() {
        setTitle("About - Test Software"); // Window Title

        startPanels();
        startLabels();
        startButton();

        setLayout(new GridLayout(1,2));
        setVisible(true);
        setSize(540, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void startLabels(){
        // Initialize and Set the JLabels (Student Image, Info Image and Shield Image).

        //Image
        JLabel label = new JLabel();
        label.setSize(170,200); // Image Size
        ImageIcon image = new ImageIcon("src/usta/sistemas/Icon.jpg"); // Image Route
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT));
        label.setIcon(icon);
        panelImage.add(label);

        // Info
        JLabel name = new JLabel("<html><center>Harrizon Alexander Soler Galindo " +
                                                 "<p> Santo Tomas Tunja University " +
                                                       "<p> Systems Engineering " +
                                                            "<p> 5/06/2020 " +
                                            "<p> Email: harrizon.soler@usantoto.edu.co " +
                                                "<p> GitHub: github.com/HarrizonSoler <center><html>",SwingConstants.CENTER);
        name.setFont(new Font("Arial",0,15));
        panelInfo.add(name,BorderLayout.NORTH);

        // Shield
        JLabel label2 = new JLabel();
        label2.setSize(100,100); // Image Size
        ImageIcon image2 = new ImageIcon("src/usta/sistemas/EscudoUsta.png"); // Image Route
        Icon icon2 = new ImageIcon(image2.getImage().getScaledInstance(label2.getWidth(),label2.getHeight(),Image.SCALE_DEFAULT));
        label2.setIcon(icon2);
        panelShield.add(label2);
    }
    private void startPanels(){
        // Initialize and Set the panels
        panelLeft.setLayout(new BorderLayout(5,5));
        panelRight.setLayout(new GridLayout(2,1));
        panelInfo.setLayout(new FlowLayout());
        panelShield.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelImage.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBack.setLayout(new BorderLayout(5,5));

        add(panelLeft);
        add(panelRight);
        panelRight.add(panelInfo);
        panelRight.add(panelShield);
        panelLeft.add(panelImage,BorderLayout.NORTH);
        panelLeft.add(panelBack,BorderLayout.CENTER);
    }
    private void startButton(){
        // Set the Back Button
        JButton back = new JButton("Back");
        panelBack.add(back,BorderLayout.CENTER); // Centering the label
        panelBack.add(new JLabel(""),BorderLayout.SOUTH); //Putting up many labels to center the title.v
        panelBack.add(new JLabel(""),BorderLayout.NORTH);
        panelBack.add(new JLabel(""),BorderLayout.EAST);
        panelBack.add(new JLabel(""),BorderLayout.WEST);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormMenu menu = new FormMenu(); // Creating the new Frame
                setVisible(false); //Closing this
            }
        });
    }
    public static void main(String[] args){
        FormAcercade form1 = new FormAcercade();
    }
}

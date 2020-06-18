package usta.sistemas;
import javax.swing.*;

public class Formulario extends JFrame {

    public Formulario(){
        // Declares and initialize the labels
        JLabel label = new JLabel("Hola Mundo!");
        JLabel label1 = new JLabel("Name: Harrizon Alexander Soler Galindo");
        JLabel label2 = new JLabel("Date: 4/06/2020");
        label.setBounds(12,5,300,30); //Declares the size of the labels
        label1.setBounds(100,5,300,30);
        label2.setBounds(100,25,300,30);
        add(label); //Add the labels to the container
        add(label1);
        add(label2);

        // Declares and initialize the button
        JButton button = new JButton("Accept");
        button.setBounds(10,35,75,30);
        add(button);

        setLayout(null); //Set the container in the half of the screen.
        setVisible(true);
        setBounds(0,0,350,115);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
    }
}

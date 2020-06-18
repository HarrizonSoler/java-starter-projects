package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormRegStudent extends JFrame {

    /*
      Name: Harrizon Alexander Soler Galindo
      Date: 14/06/2020
      Description: This class meet the student information to the file class.
    */

	JPanel centralPanel = new JPanel(new GridLayout(3,2,5,5)); //Declaring and initializing Panels
    JPanel bottomPanel = new JPanel(new BorderLayout(10,10));
    JPanel topPanel = new JPanel(new GridLayout(1,2));
    JPanel upperRightPanel = new JPanel(new BorderLayout(10,10));
    JTextField name = new JTextField(); //Declaring and Initializing the text fields
    JTextField lastName = new JTextField();
    JComboBox faculty = new JComboBox();

    public FormRegStudent(){
        setTitle("New Student - Test Software");
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Register Student",SwingConstants.CENTER); //Declaring and initializing the label of the title
        title.setFont(new Font("Arial",0,22));
        topPanel.add(title);

        fillPanelGrid();
        setPanels();
        configureButtons();

        setVisible(true);
        setSize(420,220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void fillPanelGrid(){
        //Declaring and initializing the objects of the grid (labels, textfields and the combo box).
        String faculties[] = {"","Administracion de Empresas","Negocios Internacionales","Derecho","Arquitectura","Ambiental","Sistemas","Electronica","Mecanica","Industrial","Cultura Fisica"};

        JLabel lbname = new JLabel("Name:",SwingConstants.CENTER);
        lbname.setFont(new Font("Arial",0,15));
        centralPanel.add(lbname);

        centralPanel.add(name); //Set the JTextField of the student name

        JLabel lblast = new JLabel("Last Name:",SwingConstants.CENTER);
        lblast.setFont(new Font("Arial",0,15));
        centralPanel.add(lblast);

        centralPanel.add(lastName); //Set the JTextField of the student last name

        JLabel lbfaculty = new JLabel("Faculty:",SwingConstants.CENTER);
        lbfaculty.setFont(new Font("Arial",0,15));
        centralPanel.add(lbfaculty);

        for (int i = 0; i < faculties.length; i++){ //Add the items array of the faculties.
            faculty.addItem(faculties[i]);
        }
        centralPanel.add(faculty); //Set the JComboBox of the student faculty
    }
    private void configureButtons(){
        //Declaring and initializing the buttons (back and add student) with their fonts and events.
        JButton create = new JButton("Add");
        create.setFont(new Font("Arial",0,15));
        bottomPanel.add(create,BorderLayout.CENTER);
        bottomPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the button.
        bottomPanel.add(new JLabel(),BorderLayout.EAST);
        bottomPanel.add(new JLabel(),BorderLayout.WEST);
        bottomPanel.add(new JLabel(),BorderLayout.SOUTH);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (name.getText().length() < 3 || lastName.getText().length() < 3 || faculty.getSelectedItem().toString() == ""){
                    FormPopUp alert = new FormPopUp("Missing information in Student Data");
                }else {
                    FormFile fileStudent = new FormFile();
                    boolean result = fileStudent.addStudent(name.getText(), lastName.getText(), faculty.getSelectedItem().toString());

                    if (result) {
                        FormPopUp alert = new FormPopUp("Student Registered Sucessful");

                        name.setText("");
                        lastName.setText("");
                        faculty.setSelectedIndex(0);
                    } else {
                        FormPopUp alert = new FormPopUp("Student cannot be Registered");
                    }
                }
            }
        });

        JButton back = new JButton("Back");
        upperRightPanel.add(back,BorderLayout.CENTER);
        upperRightPanel.add(new JLabel(),BorderLayout.NORTH); //Putting up many labels to center the button
        upperRightPanel.add(new JLabel(),BorderLayout.WEST);
        upperRightPanel.add(new JLabel(),BorderLayout.EAST);
        upperRightPanel.add(new JLabel(),BorderLayout.SOUTH);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FormMenu menu = new FormMenu();
                setVisible(false);
            }
        });
    }
    private void setPanels() {
        //Setting up the panels of the window
        add(centralPanel,BorderLayout.CENTER);
        add(bottomPanel,BorderLayout.SOUTH);
        add(topPanel,BorderLayout.NORTH);
        topPanel.add(upperRightPanel);
    }
    public static void main(String[] args){
        FormRegStudent form4 = new FormRegStudent();
    }
}

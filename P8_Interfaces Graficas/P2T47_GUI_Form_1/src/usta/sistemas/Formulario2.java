package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Formulario2 extends JFrame {
    public Formulario2(){
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

        for (int i = 1; i <= 10; i++){
            JButton button = new JButton("Component " + i);
        }
    }

    public static void main(String[] args){
        Formulario2 formulario2 = new Formulario2();
    }
}

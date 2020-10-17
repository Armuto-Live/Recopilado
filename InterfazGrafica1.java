package com.armutolive;
import javax.swing.*;

public class InterfazGrafica1 extends JFrame
{
    private JLabel label1;
    public InterfazGrafica1()
    {
        setLayout(null);
        label1=new JLabel ("Armuto");
        label1.setBounds(100,50,200,300);
        add(label1);
    }
    public static void main(String[] args)
    {
        InterfazGrafica1 formulario1= new InterfazGrafica1();
        formulario1.setBounds(500,200,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}

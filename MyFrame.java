import javax.swing.*;
import java.awt.*;

public class MyFrame{
    public static void main (String []args){
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Gui Time"); // set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
        frame.setResizable(true); // able change size
        frame.setSize(420,420); // set the x-dimension, and y-dimension of frame
        frame.setVisible(true); // makes frame visible
        frame.getContentPane().setBackground(Color.blue); // change color of background
        JLabel bofa = new JLabel ("bofa");
        frame.add(bofa);

        JButton b = new JButton ("bofa");
        b.setPreferredSize(new Dimension (100,30));
        frame.add (b);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
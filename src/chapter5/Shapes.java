package chapter5;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {
    private int choice;

    public Shapes(int userChoice) {
        choice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i =0; i < 10; i++){
            switch (choice) {
                case 1 -> g.drawRect(10 + i * 10,
                        10 + i * 10, 50 + i * 10, 50 + i * 10);
                case 2 -> g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10,
                        50 + i * 10);
            }
        }
    }

    public static void main(String[] args) {
       String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles" +
               "\nEnter 2 to draw ovals");

       int choice = Integer.parseInt(input);
       Shapes panel = new Shapes(choice);
       JFrame application = new JFrame();

       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       application.add(panel);
       application.setSize(300, 300);
       application.setVisible(true);
    }
}
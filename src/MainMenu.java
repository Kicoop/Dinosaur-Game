import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame {
    

    MainMenu(){


        // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon dinoImage = new ImageIcon("data/dancingdino.gif");
        imageLabel.setIcon(dinoImage);
        // Add image to frame
        this.add(imageLabel);

        // JButton
        JButton button = new JButton();
        button.setText("Play Dinosaur Game");
        button.setFont(new Font("Arial", Font.BOLD, 20));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        // Add button to frame
        this.add(button);

        

        this.setLayout(new FlowLayout());
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.gray);
        // lock frame
        this.setResizable(false);
    }
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            // open color menu frame
            new GameWindow();
            // Close main menu frame
            dispose();
        }
}
}


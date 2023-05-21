// PROGRAMMERS: Abner Molina and Ryan Barrios

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColombianFlag {
    public static void main(String[] args) {
        int width = 800;
        int height = 600;

        // Create a JFrame to display the flag
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Create a JLabel for the flag - Top stripe (Yellow)
        JLabel topStripeLabel = new JLabel();
        topStripeLabel.setBounds((width - 500) / 2, (height - 300) / 2, 500, 100);
        topStripeLabel.setOpaque(true);
        topStripeLabel.setBackground(new java.awt.Color(252, 209, 22)); // Yellow RGB value
        panel.add(topStripeLabel);

        // Create a JLabel for the flag - Middle stripe (Blue)
        JLabel middleStripeLabel = new JLabel();
        middleStripeLabel.setBounds((width - 500) / 2, (height - 300) / 2 + 100, 500, 100);
        middleStripeLabel.setOpaque(true);
        middleStripeLabel.setBackground(new java.awt.Color(0, 56, 168)); // Blue RGB value
        panel.add(middleStripeLabel);

        // Create a JLabel for the flag - Bottom stripe (Red)
        JLabel bottomStripeLabel = new JLabel();
        bottomStripeLabel.setBounds((width - 500) / 2, (height - 300) / 2 + 200, 500, 100);
        bottomStripeLabel.setOpaque(true);
        bottomStripeLabel.setBackground(new java.awt.Color(206, 17, 38)); // Red RGB value
        panel.add(bottomStripeLabel);

        // Create a JLabel for the country name
        JLabel countryLabel = new JLabel("Colombia");
        countryLabel.setBounds((width - 500) / 2, (height + 300) / 2 + 30, 200, 20);
        panel.add(countryLabel);

        // Create a JLabel for the language name
        JLabel languageLabel = new JLabel("Spanish");
        languageLabel.setBounds((width + 500) / 2 - 100, (height + 300) / 2 + 30, 200, 20);
        panel.add(languageLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set the JFrame visible
        frame.setVisible(true);
    }
}







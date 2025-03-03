package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        Font font = null;
        font = new Font("Sitka", Font.PLAIN, 16);

        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);
        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameLabel.setBounds(10, 10, 100, 20);
        JTextField nameField = new JTextField(15);
        nameField.setBounds(50, 10, 100, 20);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageLabel.setBounds(10, 50, 100, 20);
        JTextField ageField = new JTextField(15);
        ageField.setBounds(50, 50, 100, 20);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setBounds(10, 90, 100, 20);
        JTextField emailField = new JTextField(15);
        emailField.setBounds(50, 90, 100, 20);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("Level of familiarity with similar software");
        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        levelLabel.setBounds(10, 130, 250, 20);

        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setAlignmentX(Component.CENTER_ALIGNMENT);
        level1.setBounds(10, 160, 100, 20);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setAlignmentX(Component.CENTER_ALIGNMENT);
        level2.setBounds(100, 160, 100, 20);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setAlignmentX(Component.CENTER_ALIGNMENT);
        level3.setBounds(190, 160, 100, 20);
        JRadioButton level4 = new JRadioButton("Not familiar");
        level4.setAlignmentX(Component.CENTER_ALIGNMENT);
        level4.setBounds(280, 160, 150, 20);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next page");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.setBounds(10, 200, 100, 20);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);
        panel.add(Box.createRigidArea(new Dimension(20, 10)));

        // Add panel to the frame
        frame.add(panel);
    }
}

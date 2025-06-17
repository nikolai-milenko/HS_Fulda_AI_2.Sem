import javax.swing.*;
import java.awt.Font;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Woche 10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        final boolean[] params = {false, false};

        // Create the first menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem fixItem = new JMenuItem("Fix Button");
        fileMenu.add(fixItem);
        fileMenu.add(exitItem);
        exitItem.addActionListener(e -> System.exit(0));
        fixItem.addActionListener(e -> params[1] = true);

        // Create the second menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem infoItem = new JMenuItem("Info");
        helpMenu.add(infoItem);
        infoItem.addActionListener(e -> {
           System.out.println("Info");
        });

        // Create the third menu
        JMenu extraMenu = new JMenu("Extra");
        JMenuItem extraItem_1 = new JMenuItem("Extra 1");
        extraMenu.add(extraItem_1);
        extraMenu.addSeparator();
        JMenuItem extraItem_2 = new JMenuItem("Extra 2");
        extraMenu.add(extraItem_2);
        extraMenu.addSeparator();
        JMenuItem extraItem_3 = new JMenuItem("Extra 3");
        extraMenu.add(extraItem_3);
        extraMenu.addSeparator();
        JMenuItem extraItem_4 = new JMenuItem("Extra 4");
        extraMenu.add(extraItem_4);

        extraItem_1.addActionListener(e -> {
            System.out.println("Extra1");
        });

        extraItem_2.addActionListener(e -> {
            System.out.println("Extra2");
        });
        extraItem_3.addActionListener(e -> {
            System.out.println("Extra3");
        });
        extraItem_4.addActionListener(e -> {
            System.out.println("Extra4");
        });

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(extraMenu);

        frame.setSize(260, 300);
        frame.setVisible(true);

        Font labelFont = new Font("Arial", Font.BOLD, 16);

        // Login label
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setSize(220, 20);
        loginLabel.setLocation(20, 50);
        loginLabel.setFont(labelFont);

        // Password label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setSize(220, 20);
        passwordLabel.setLocation(20, 150);
        passwordLabel.setFont(labelFont);

        // login field
        JTextField loginField = new JTextField("", 20);
        loginField.setSize(220, 20);
        loginField.setLocation(20, 100);

        // password field
        JTextField passwordField = new JTextField("", 20);
        passwordField.setSize(220, 20);
        passwordField.setLocation(20, 200);

        // Counter for login button clicks
        final int[] clickCount = new int[1];

        // login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(labelFont);
        loginButton.setSize(100, 50);
        loginButton.setLocation(70, 250);
        loginButton.addActionListener(e -> {
            clickCount[0]++;

            if (clickCount[0] > 3) {
                System.out.println("WARNUNG");
            }
        });

        //bonus-button
        JButton checkButton = new JButton("Prüfen");
        checkButton.setFont(labelFont);
        checkButton.setSize(100, 50);
        checkButton.setLocation(170, 250);

        checkButton.addActionListener(e -> {
            if (!params[1]) {
                if (params[0]) {
                    checkButton.setLocation(170, 250);
                    params[0] = false;
                } else {
                    checkButton.setLocation(110, 250);
                    params[0] = true;
                }
            }
        });

        // adding everything to frame
        frame.add(loginLabel);
        frame.add(passwordLabel);
        frame.add(loginField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(checkButton);
    }
}

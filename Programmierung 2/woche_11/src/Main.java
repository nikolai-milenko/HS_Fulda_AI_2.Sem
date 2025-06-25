import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // setting up the frame
        JFrame frame = new JFrame("Woche 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);
        frame.setSize(300, 250);
        frame.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Create the menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem resetQueueItem = new JMenuItem("Reset queue");
        JMenuItem printQueueItem = new JMenuItem("Print queue");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(resetQueueItem);
        fileMenu.add(printQueueItem);
        fileMenu.add(exitItem);
        exitItem.addActionListener(e -> {
            System.exit(0);
        });

        menuBar.add(fileMenu);

        // Panels set up
        JPanel labelPane  = new JPanel();
        JPanel buttonsPane = new JPanel();
        JPanel leftButtonPane = new JPanel();
        JPanel rightButtonPane = new JPanel();

        buttonsPane.add(leftButtonPane);
        buttonsPane.add(rightButtonPane);
        contentPane.add(buttonsPane);
        contentPane.add(labelPane);

        leftButtonPane.setLayout(new BoxLayout(leftButtonPane, BoxLayout.Y_AXIS));
        rightButtonPane.setLayout(new BoxLayout(rightButtonPane, BoxLayout.Y_AXIS));
        buttonsPane.setLayout(new BoxLayout(buttonsPane, BoxLayout.X_AXIS));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        labelPane.setLayout(new BoxLayout(labelPane, BoxLayout.X_AXIS));

        JButton leftButton1 = new JButton("Left1");
        JButton leftButton2 = new JButton("Left2");
        JButton leftButton3 = new JButton("Left3");
        JButton rightButton1 = new JButton("Right1");
        JButton rightButton2 = new JButton("Right2");
        JButton rightButton3 = new JButton("Right3");

        leftButtonPane.add(leftButton1);
        leftButtonPane.add(leftButton2);
        leftButtonPane.add(leftButton3);

        rightButtonPane.add(rightButton1);
        rightButtonPane.add(rightButton2);
        rightButtonPane.add(rightButton3);

        JLabel label = new JLabel("Left1 + Left2 + Left3 + Right1 klicken!", SwingConstants.CENTER);
        labelPane.add(label);

        ArrayList<Integer> klicks =  new ArrayList<>();

        ActionListener clickListener = e -> {
            Object src = e.getSource();
            int code = 0;

            if (src == leftButton1) code = 1;
            else if (src == leftButton2) code = 2;
            else if (src == leftButton3) code = 3;
            else if (src == rightButton1) code = 11;
            else if (src == rightButton2) code = 12;
            else if (src == rightButton3) code = 13;

            klicks.add(code);

            // Prüfen ob die letzten 4 Klicks [1, 2, 3, 11] sind
            if (klicks.size() >= 4) {
                int size = klicks.size();
                if (klicks.get(size - 4) == 1 &&
                        klicks.get(size - 3) == 2 &&
                        klicks.get(size - 2) == 3 &&
                        klicks.get(size - 1) == 11) {
                    System.exit(0);
                }
            }
        };

        leftButton1.addActionListener(clickListener);
        leftButton2.addActionListener(clickListener);
        leftButton3.addActionListener(clickListener);
        rightButton1.addActionListener(clickListener);
        rightButton2.addActionListener(clickListener);
        rightButton3.addActionListener(clickListener);

        printQueueItem.addActionListener(e -> {
            for (int id : klicks) {
                switch (id) {
                    case 1 -> System.out.println("Left1");
                    case 2 -> System.out.println("Left2");
                    case 3 -> System.out.println("Left3");
                    case 11 -> System.out.println("Right1");
                    case 12 -> System.out.println("Right2");
                    case 13 -> System.out.println("Right3");
                }
            }
        });

        resetQueueItem.addActionListener(e -> {
            klicks.clear();
        });

        JButton jumpButton = new JButton("Jump");
        contentPane.add(jumpButton);
        jumpButton.addMouseMotionListener(new JumpButtonMouseListener(jumpButton));
    }
}
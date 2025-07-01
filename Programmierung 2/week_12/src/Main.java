import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main {
    private ArrayList<Eintrag> datenbank = new ArrayList<>();
    private int index = 0;

    private JTextField nameField;
    private JTextField adresseField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().createAndShowGUI());
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Datenbank-GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);

        // Menü
        JMenuBar menuBar = new JMenuBar();
        JMenu menuDatei = new JMenu("Datei");
        JMenuItem menuEnde = new JMenuItem("Ende");
        menuEnde.addActionListener(e -> System.exit(0));
        menuDatei.add(menuEnde);
        menuBar.add(menuDatei);
        frame.setJMenuBar(menuBar);

        // Layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Eingabe Panel
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        nameField = new JTextField(15);
        adresseField = new JTextField(15);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Adresse:"));
        inputPanel.add(adresseField);
        inputPanel.setAlignmentY(Component.TOP_ALIGNMENT);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        JButton leftButton = new JButton("<--");
        JButton rightButton = new JButton("-->");
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.setAlignmentY(Component.TOP_ALIGNMENT);

        inputPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        Dimension inpPref = inputPanel.getPreferredSize();
        inputPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, inpPref.height));

        Dimension btnPref = buttonPanel.getPreferredSize();
        buttonPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, btnPref.height));

        // Event-Handling für Buttons
        leftButton.addActionListener(e -> {
            speichernInAktuellenEintrag();
            if (index > 0) {
                index--;
                zeigeAktuellenEintrag();
            } else {
                System.out.println("Bereits erster Eintrag.");
            }
        });

        rightButton.addActionListener(e -> {
            speichernInAktuellenEintrag();
            if (index < datenbank.size() - 1) {
                index++;
                zeigeAktuellenEintrag();
            } else {
                System.out.println("Bereits letzter Eintrag.");
            }
        });

        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);

        // Datenbank füllen mit 2 Threads
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 500; i++) {
                datenbank.add(new Eintrag("Meier" + i, "Teststraße 1"));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 500; i++) {
                datenbank.add(new Eintrag("Müller" + i, "Teststraße 1"));
            }
        });

        thread1.start();
        thread2.start();

        // Auf Fertigstellung warten, danach ersten Eintrag anzeigen
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        if (!datenbank.isEmpty()) {
            zeigeAktuellenEintrag();
        }

        //Aufgabe 3

        JButton neuButton = new JButton("Neu");
        JButton searchButton = new JButton("Search");
        JTextField searchLabel = new JTextField("Search:", 15);

        buttonPanel.add(neuButton);
        buttonPanel.add(searchLabel);
        buttonPanel.add(searchButton);

        neuButton.addActionListener(e -> {
            speichernInAktuellenEintrag();
            datenbank.add(new Eintrag("", ""));
            index = datenbank.size() - 1;
            zeigeAktuellenEintrag();
        });

        /*
         * Aufgabe 4.
         * Welche Interfaces werden hier implementiert? Von welcher Klasse?
         * Das Interface Runnable wird von zwei anonymen Klassen (bzw. Lambdas)
         * implementiert, die an die Threads übergeben werden.
         *
         * Welche Abfolge von Meier und Müller beobachten Sie in der Datenbank? Können Sie das erklären?
         * Die Einträge von „Meier“ und „Müller“ erscheinen in zufälliger Reihenfolge.
         * Das liegt daran, dass beide Threads gleichzeitig (parallel) auf dieselbe ArrayList schreiben.
         *
         * Welches Objekt haben Sie beim Befüllen der Datenbank (Aufgabe 2) als Monitor-Instanz benutzt? Und warum?
         */

        // Aufgabe 5
        searchButton.addActionListener(e -> {
            speichernInAktuellenEintrag();

            String suchtext = searchLabel.getText();

            for (int i = 0; i < datenbank.size(); i++) {
                if (datenbank.get(i).getName().equals(suchtext)) {
                    index = i;
                    zeigeAktuellenEintrag();
                    return;
                }
            }

        });

        mainPanel.add(Box.createVerticalGlue());
        frame.setContentPane(mainPanel);
        frame.setVisible(true);

    }

    private void speichernInAktuellenEintrag() {
        if (index >= 0 && index < datenbank.size()) {
            Eintrag eintrag = datenbank.get(index);
            eintrag.setName(nameField.getText());
            eintrag.setAdresse(adresseField.getText());
        }
    }

    private void zeigeAktuellenEintrag() {
        if (index >= 0 && index < datenbank.size()) {
            Eintrag eintrag = datenbank.get(index);
            nameField.setText(eintrag.getName());
            adresseField.setText(eintrag.getAdresse());
        }
    }
}

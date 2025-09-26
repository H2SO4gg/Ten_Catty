import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Goongoon {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton clearButton, submitButton, backButton, tableButton;

    public Goongoon() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960, 1280);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle("Goongoon");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("The Goongoon.jpg"); // Replace with your image file
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(new BorderLayout());

        // Create a label to display the welcome message
        JLabel welcomeLabel = new JLabel("Welcome Goongoon, How is your day?");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add welcome label to the north of the panel
        panel.add(welcomeLabel, BorderLayout.NORTH);

        // Create a sub-panel to hold the username and password fields
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new GridBagLayout()); // Use GridBagLayout for central positioning
        subPanel.setOpaque(false); // Make the sub-panel transparent
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding between components
        gbc.anchor = GridBagConstraints.CENTER; // Center the components

        // Array to store the paths of your 10 logo images
        String[] logoPaths = {
            "logo1.png.png", "logo2.png", "logo3.png", "logo4.png", "logo5.png",
            "logo6.png", "Hazel.png", "logo8.png", "logo9.png", "logo10.png"
        };

        // Create icons and add them to the sub-panel
        // First row: logos 1 to 5
        gbc.gridy = 0; // Row 1
        for (int i = 0; i < 5; i++) {
            gbc.gridx = i; // Set column position for each icon
            JLabel logoLabel = new JLabel();
            try {
                BufferedImage image = ImageIO.read(new File(logoPaths[i])); // Load each logo from file
                ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                logoLabel.setIcon(icon); // Set the logo icon on the label
            } catch (IOException e) {
                System.err.println("Error loading logo image: " + e.getMessage());
            }
            subPanel.add(logoLabel, gbc); // Add label with icon to panel
        }

        // Second row: logos 6 to 10
        gbc.gridy = 1; // Row 2
        for (int i = 5; i < 10; i++) {
            gbc.gridx = i - 5; // Set column position for each icon in the second row
            JLabel logoLabel = new JLabel();
            try {
                BufferedImage image = ImageIO.read(new File(logoPaths[i])); // Load each logo from file
                ImageIcon icon = new ImageIcon(image.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                logoLabel.setIcon(icon); // Set the logo icon on the label
            } catch (IOException e) {
                System.err.println("Error loading logo image: " + e.getMessage());
            }
            subPanel.add(logoLabel, gbc); // Add label with icon to panel
        }

        // Create username field
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 18)); // Set font size for username label
        subPanel.add(usernameLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        usernameField = new JTextField(20);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 18)); // Set font size for username field
        subPanel.add(usernameField, gbc);

        // Create password field
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18)); // Set font size for password label
        subPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18)); // Set font size for password field
        subPanel.add(passwordField, gbc);

        // Create clear button
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        subPanel.add(clearButton, gbc);

        // Create submit button
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Check the login credentials
                if (username.equals("Sadieee") && password.equals("SADO2022")) {
                    new Sado(); // Replace with your specific logic for Sado page
                } else if (username.equals("Zaimoella") && password.equals("Zaimo@gg")) {
                    new Zaimo(); // Replace with your specific logic for Zaimo page
                } else if (username.equals("Lingora") && password.equals("LIGO@gg")) {
                    new Ligo(); // Replace with your specific logic for Ligo page
                } else if (username.equals("Ragopago") && password.equals("Ragora@gg")) {
                    new Ragora(); // Replace with your specific logic for Ragora page
                } else if (username.equals("Choro ipakhi") && password.equals("Choroi@gg")) {
                    new Choroi(); // Replace with your specific logic for Choroi page
                } else if (username.equals("Finni") && password.equals("FEA@gg")) {
                    new Fea(); // Replace with your specific logic for Fea page
                } else if (username.equals("Milola") && password.equals("Milo@gg")) {
                    new Milo(); // Replace with your specific logic for Milo page
                } else if (username.equals("Nufipoofie") && password.equals("NUFI@gg")) {
                    new Nufi(); // Replace with your specific logic for Nufi page
                } else if (username.equals("Shealipilly") && password.equals("Sheali@gg ")) {
                    new Sheali(); // Replace with your specific logic for Sheali page
                } else if (username.equals("Hazipezi") && password.equals("Hazu@birds")) {
                    new Hazel(); // Replace with your specific logic for Hazel page
                } else {
                    // Display an error message
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });
        subPanel.add(submitButton, gbc);

        // Create back button
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Welcome(); // Replace with your welcome page class
            }
        });
        subPanel.add(backButton, gbc);

        // Create Table button
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        tableButton = new JButton("Table");
        tableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Table();  // This will open the Table frame
            }
        });
        tableButton.setBackground(new Color(0, 128, 0)); // Deep Green color
        subPanel.add(tableButton, gbc);

        // Add sub-panel to the center of the panel
        panel.add(subPanel, BorderLayout.CENTER);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Goongoon();
            }
        });
    }
}

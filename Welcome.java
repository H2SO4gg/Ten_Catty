import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton clearButton;
    private JButton submitButton;

    public Welcome() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        
        frame.setTitle("Welcome to CAT's House");

       
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("1st page.png"); 
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(new BorderLayout());

       
        JLabel welcomeLabel = new JLabel("Welcome to CAT's House");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

      
        panel.add(welcomeLabel, BorderLayout.NORTH);

       
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new GridBagLayout()); 
        subPanel.setOpaque(false); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.anchor = GridBagConstraints.CENTER; 

       
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 18)); 
        usernameField = new JTextField(20);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 18));
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18)); 
        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18)); 
        passwordField.setForeground(Color.RED); 

       
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("GoonGoon") && password.equals("cattosMOM")) {
                    frame.dispose();
                    new Goongoon();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        gbc.gridx = 0; 
        gbc.gridy = 0; 
        subPanel.add(usernameLabel, gbc);
        gbc.gridx = 1; 
        subPanel.add(usernameField, gbc);

        
        gbc.gridx = 0; 
        gbc.gridy = 1; 
        subPanel.add(passwordLabel, gbc);
        gbc.gridx = 1; 
        subPanel.add(passwordField, gbc);

        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        subPanel.add(clearButton, gbc);
        gbc.gridx = 1;
        subPanel.add(submitButton, gbc);

        
        panel.add(subPanel, BorderLayout.CENTER);

        
        frame.add(panel);

       
        frame.setLocationRelativeTo(null);

        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
 new Welcome();
            }
        });
    }
}
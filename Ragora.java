import javax.swing.*;
import java.awt.*;

public class Ragora {
    private JFrame frame;

    public Ragora() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle("Ragora");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("Ragora.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("RAGORA");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);

        // Create a label for the personal details
        JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: black'>Name : Ragora</p><p style='margin-bottom: 20px; color: green'>Age : 5+</p><p style='margin-bottom: 20px; color: black'>BirthYear : 2019</p><p style='color: black'>Favourite memories : his favourite thing in the whole world is his mum. He get very clingy with her. Goes everywhere she goes and with that love comes a lot of jealousy ;) he hates when his mum gives attention to other cats and he’s not afraid to show it. Also he hates fish.</p></body></html>");
        detailsLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        detailsLabel.setBounds(100, 150, 600, 350);



        // Add the details label to the main panel
        panel.add(detailsLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    
    
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ragora();
            }
        });
    }
}
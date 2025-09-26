import javax.swing.*;
import java.awt.*;

public class Choroi {
    private JFrame frame;

    public Choroi() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" CHOROI ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_choroi.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("CHOROI");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
  // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name : choroi</p><p style='margin-bottom: 20px; color: white'>Age : 2+</p><p style='margin-bottom: 20px; color: white'>Birth Year : 2022</p><p style='margin-bottom: 20px; color: black'>Favourite Things//:  I am  as sweet as my name. I  also very small and round. Like a ball. Sometime I  sleeps like humans do. My mommy  wonder am i  even has bones in her. I loves the song “shada shada kala kala” and will start walking in circles the moment I hears it . I love my momma also .She is Queen . She is my world. Thank you mommma you are very sweet i love you so much .</p><p style='margin-bottom: 20px; color: white'>Yours Choroi</p></body></html>");
detailsLabel.setFont(new Font("Arial", Font.PLAIN, 18));
detailsLabel.setBounds(100, 150, 600, 400);

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
                new Choroi();
            }
        });
    }
}
import javax.swing.*;
import java.awt.*;

public class Hazel{
    private JFrame frame;

    public Hazel() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" HAZEL ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_hazel.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("HAZEL");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
 // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name : Hazel</p><p style='margin-bottom: 20px; color: white'>Age : 2+</p><p style='margin-bottom: 20px; color: white'>Birth Year : 2022</p><p style='margin-bottom: 20px; color: white'>Favourite Things: I am very evil. I hates every other cat (except Milo).I smacks other cats for no reason. I loves to be a bully. I was also a different cat at night. I am the most snuggly and cutie baby while sleeping but as soon as I wakes up it’s back to terrorising other cats. lol. I love to see my personality grow from shy to a real angry cat. I know this lady who now read this text she is my momma . I know she loves me but you know mommma i love you more .. I am very proud of you Momma and momma i want to told you one thing which is CONGRATULATIONS and Best of Luck for your University life.</p><p style='margin-bottom: 20px; color: black'>Yours Hazel</p></body></html>");
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
                new Hazel();
            }
        });
    }
}
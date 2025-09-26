import javax.swing.*;
import java.awt.*;

public class Ligo {
    private JFrame frame;

    public Ligo() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" LIGO ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_1ligo.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel(" LIGO ");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);

       // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name : ligo</p><p style='margin-bottom: 20px; color: green'>Age : 4+</p><p style='margin-bottom: 20px; color: blue'>Birth Year : 2020</p><p style='margin-bottom: 20px; color: white'>Favourite Things : Am I a cat? My mum sometimes doubt about it .I  ALWAYS BUSY. Always screaming and always jumping from one place to another. I also knows how to open doors. I am a  intelligent monkey. I  also loves food and I also willing to snatch the bite you were about to put in your mouth but all of this put in others side the main part is i love my mommy .She is my World to me . The way she loves me this make me more confident that i am the best of best to my mother .Thank you mommy .I love you .</p><p style='margin-bottom: 20px; color: white'>Yours Ligo</p></body></html>");
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
                new Ligo();
            }
        });
    }
}
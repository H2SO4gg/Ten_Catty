import javax.swing.*;
import java.awt.*;

public class Zaimo{
    private JFrame frame;

    public Zaimo() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle("ZAIMO ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_1zaimo.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel(" ZAIMO ");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
  // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name: Zaimo</p><p style='margin-bottom: 20px; color: blue'>Age: 4+</p><p style='margin-bottom: 20px; color: white'>Birth year: 2020</p><p style='margin-bottom: 20px; color: yellow'>Favourite : Hi Mom, I am  a very  gentle soul. I also very attached to  human. I  mostly loved to stay in my  own bubble. I doesn’t like food that much but I am  very expressive. You will know me when you made me  mad or sad. I  shows my emotions like a human does. But mom you know what?  I love you I love you very very much mom thank you for taking care of me everyday. Thank you GOD giving me this Girl as my Mother.</p><p style='margin-bottom: 20px; color: white'>Yours Zaimo</p></body></html>");
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
                new Zaimo();
            }
        });
    }
}
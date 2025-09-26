import javax.swing.*;
import java.awt.*;

public class Fea{
    private JFrame frame;

    public Fea() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" FEA ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_1fea.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("FEA");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
 // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: black'>Name : Fea</p><p style='margin-bottom: 20px; color: black'>Age : 4+</p><p style='margin-bottom: 20px; color: blue'>Birth Year : 2020</p><p style='margin-bottom: 20px; color: yellow'>Favourite Things: if you imagine a working,independent and strong woman that’s what fea is but as a cat. I am  very opinionated. My mother has another human daughter whom I hates. I does not want to share my mother. I also loves kittens so much. I am  everything you will ever imagine. Also I  breaks up fights between other cats. I ’ll slap the one who started the fight right in the face but  my mothers always see me what am i doing this is cute right?? Hi momma I am FEA . You know na i love you so much?? Thank you momma .</p><p style='margin-bottom: 20px; color: green'>Yours  FEA</p></body></html>");
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
                new Fea();
            }
        });
    }
}
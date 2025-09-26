import javax.swing.*;
import java.awt.*;

public class Milo {
    private JFrame frame;

    public Milo() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" MILO ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("Milo.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("MILO");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);

  // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name : Milo </p><p style='margin-bottom: 20px; color: white'>Age : 3+</p><p style='margin-bottom: 20px; color: white'>Birth Year : 2021</p><p style='margin-bottom: 20px; color: red'>Favourite Things: oh Hiee,where do I start? I HATES EVERY OTHER MAN THAT WALKS ON THIS EARTH. I was built very strong and will guard my  house from other male intruders (visitors). I loves my family so much. I am  very well built and strong so men who visit his house are often chased out by me. I am  also a sweet boy to my mother. I love you 3000 MA.</p><p style='margin-bottom: 20px; color: yellow'>Yours MILO</p></body></html>");
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
                new Milo();
            }
        });
    }
}
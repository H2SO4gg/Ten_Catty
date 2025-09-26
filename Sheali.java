import javax.swing.*;
import java.awt.*;

public class Sheali {
    private JFrame frame;

    public Sheali() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle("SHEALI ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_sheali.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("SHEALI");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
       // Create a label for the personal details
       JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: red'>Name : Sheali</p><p style='margin-bottom: 20px; color: white'>Age : 5+</p><p style='margin-bottom: 20px; color: white'>Birth Year : 2019</p><p style='margin-bottom: 20px; color: white'>Favourite Things: I am  a real diva. I won’t sit somewhere that I deems “too filthy”. I  wouldn’t eat my food near other cats. I  also would not tolerate anything but my favourite things. When I give birth, the first thing I did was bring my kittens to my dad. My dad is my whole world. I  does mark my territory by sitting on my humans chest only coming down to eat and use the litter box. I always know one thing that I have a best mom The beautiful lady in the world . She is very talented she know me what i need what i dont need .. You are my power mom . Thank You Momma.</p><p style='margin-bottom: 20px; color: green'>Yours Sheali</p></body></html>");
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
                new Sheali();
            }
        });
    }
}
import javax.swing.*;
import java.awt.*;

public class Nufi {
    private JFrame frame;

    public Nufi() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" NUFI ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_nufi.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("NUFI");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
  // Create a label for the personal details
JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name :Nufi </p><p style='margin-bottom: 20px; color: white'>Age : 4+</p><p style='margin-bottom: 20px; color: white'>Birth Year : 2020</p><p style='margin-bottom: 20px; color: black'>Favourite: FOOD. FOOD. FOOD.  The only thing I needs and wants is food. I will make sure you know what I wants to eat. If I needs dry food I will drag you to the container and if I wants chicken i wil drag you to the fridge coz I  knows there boiled chicken in there for me.I  also  very very affectionate and I love my beautiest mom . I never seen any beautiful ladies like my mom . she care for me ,make food for me . She is my everything . I love you in my every universe mom .</p><p style='margin-bottom: 20px; color: red'>Yours Nufi</p></body></html>");
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
                new Nufi();
            }
        });
    }
}
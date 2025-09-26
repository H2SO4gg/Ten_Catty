import javax.swing.*;
import java.awt.*;

public class Sado {
    private JFrame frame;

    public Sado() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Set background color to sky blue
        frame.getContentPane().setBackground(Color.decode("#87CEEB"));

        // Set title of the frame
        frame.setTitle(" SADO ");

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("rsz_1sado.png");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null);

        // Create a label for the title
        JLabel titleLabel = new JLabel("SADO");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.decode("#0000FF")); // Blue color
        titleLabel.setBounds(325, 50, 150, 50);

        // Add the title label to the main panel
        panel.add(titleLabel);
  // Create a label for the personal details
        JLabel detailsLabel = new JLabel("<html><body><p style='margin-bottom: 20px; color: white'>Name : Sado</p><p style='margin-bottom: 20px; color: white'>Age : 2+</p><p style='margin-bottom: 20px; color: purple'>Birth Year : 2022</p><p style='color: black'>Favourite Things: I am  nufi’s son so FOOD FOOD AND FOOD.I  loves food but you know mum i am also very emotional. Sometimes i  also very nervous. I  faints every time i gets a shower. My family  have to be very very careful around me . I also gets mad and will show my anger by ignoring my family . My  name is sad-o coz from the moment I  was born I had a sad face. But you know Mum I love you very very much. I feel very lucky to have a mum like you. Thank you ma.</p><p style='color: green'>Yours SAD-O</p></body></html>");
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
                new Sado();
            }
        });
    }
}
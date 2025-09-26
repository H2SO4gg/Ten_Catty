import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Table {
    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField[] fields;
    private final String DATA_FILE = "table_data.csv"; // File to store data

    public Table() {
        createGUI();
        loadData(); // Load data from file when the frame is opened
    }

    private void createGUI() {
        // Create the main frame
        frame = new JFrame("User Information");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the table window
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Input panel for user details
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        // Create input fields and labels
        JLabel[] labels = {
            new JLabel("Name:"),
            new JLabel("Age:"),
            new JLabel("Birth Year:"),
            new JLabel("Father's Name:"),
            new JLabel("Mother's Name:"),
            new JLabel("Vaccination Date:"),
            new JLabel("Weight:"),
            new JLabel("Deworming Date:")
        };

        fields = new JTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            JPanel panel = new JPanel();
            panel.add(labels[i]);
            fields[i] = new JTextField(20);
            panel.add(fields[i]);
            inputPanel.add(panel);
        }

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton backButton = new JButton("Back");
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");
        JButton updateButton = new JButton("Update");
        buttonPanel.add(backButton);
        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(updateButton);
        inputPanel.add(buttonPanel);

        // Adding the input panel to the north of the main frame
        frame.add(inputPanel, BorderLayout.NORTH);

        // Table model to hold user data
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        // Adding columns to the table
        tableModel.addColumn("S.No");
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Birth Year");
        tableModel.addColumn("Father's Name");
        tableModel.addColumn("Mother's Name");
        tableModel.addColumn("Vaccination Date");
        tableModel.addColumn("Weight");
        tableModel.addColumn("Deworming Date");

        // Adding the table to the center of the main frame
        JPanel tablePanel = new JPanel();
       tablePanel.setBorder(BorderFactory.createTitledBorder("The Cats Information"));
        tablePanel.add(new JScrollPane(table));

        // Add the table to the center
        frame.add(tablePanel, BorderLayout.CENTER);

        // Action listener for the "Submit" button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get data from input fields
                String[] data = new String[fields.length + 1];
                data[0] = String.valueOf(tableModel.getRowCount() + 1); // Serial number
                for (int i = 0; i < fields.length; i++) {
                    data[i + 1] = fields[i].getText();
                }

                // Add data to table if all fields are filled
                if (allFieldsFilled(data)) {
                    tableModel.addRow(data);
                    saveData(); // Save data to file after adding a new row
                    clearFields(); // Clear input fields after adding
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields before submitting.");
                }
            }
        });

        // Action listener for the "Clear" button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Action listener for the "Update" button
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get selected row
                int row = table.getSelectedRow();
                if (row != -1) {
                    // Get data from input fields
                    String[] data = new String[fields.length + 1];
                    data[0] = String.valueOf(row + 1); // Serial number stays the same
                    for (int i = 0; i < fields.length; i++) {
                        data[i + 1] = fields[i].getText();
                    }

                    // Update data in table
                    for (int i = 0; i < data.length; i++) {
                        tableModel.setValueAt(data[i], row, i);
                    }

                    saveData(); // Save updated data to file
                    clearFields(); // Clear input fields after updating
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to update.");
                }
            }
        });

        // Action listener for the "Back" button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the Table window
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Helper method to clear all input fields
    private void clearFields() {
        for (JTextField field : fields) {
            field.setText("");
        }
    }

    // Helper method to check if all fields are filled
    private boolean allFieldsFilled(String[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // Method to save table data to a CSV file
    private void saveData() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(DATA_FILE))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    pw.print(tableModel.getValueAt(i, j));
                    if (j < tableModel.getColumnCount() - 1) {
                        pw.print(","); // Separate values by commas
                    }
                }
                pw.println(); // New line after each row
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private void loadData() {
        try (Scanner scanner = new Scanner(new File(DATA_FILE))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                tableModel.addRow(data);
            }
        } catch (FileNotFoundException e) {
            
        }
    }
}

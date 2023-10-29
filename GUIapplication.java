import javax.swing.*;

public class GUIapplication {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple GUI Application");

        // Create label
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(10, 10, 100, 30);

        // Create text field
        JTextField textField = new JTextField();
        textField.setBounds(120, 10, 200, 30);

        // Create button
        JButton button = new JButton("Submit");
        button.setBounds(120, 50, 80, 30);

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Set frame layout and size
        frame.setLayout(null);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

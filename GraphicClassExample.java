import javax.swing.*;

public class GraphicClassExample {
    public static void main(String[] args) {
        // Creating instance of JFrame
        JFrame frame = new JFrame("Simple GUI");

        // Creating instance of JButton
        JButton button = new JButton("Click Me");

        // Setting the position of the button
        button.setBounds(130, 100, 100, 40);

        // Adding button to the frame
        frame.add(button);

        // Setting frame size
        frame.setSize(400, 300);

        // Setting layout of the frame
        frame.setLayout(null);

        // Setting the visibility of the frame
        frame.setVisible(true);
    }
}


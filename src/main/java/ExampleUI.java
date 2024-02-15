import javax.swing.*;

public class ExampleUI extends JFrame {
    private JPanel mainPanel;
    private JLabel label1;
    private JButton sayHiButton;
    private JTextField nameField;

    public ExampleUI() {
        this.setContentPane(mainPanel);
        this.setTitle("Hello World");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(400, 200);

        sayHiButton.addActionListener((e) -> {
            var name = nameField.getText();
            label1.setText("Hello " + name);
            nameField.requestFocus();
        });


    }
}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Task_2 extends JFrame implements ActionListener{
	private JTextField inputField;
    private JLabel resultLabel;

    public Task_2() {
   
        setTitle("Word Counter");
        setBounds(200,200,800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JLabel inputLabel = new JLabel("Enter Text or File Path:");
        inputField = new JTextField(20);
        inputField.setBounds(300,300,500,100);
        JButton countButton = new JButton("Count Words");
        countButton.addActionListener(this);
        resultLabel = new JLabel("");

        add(inputLabel);
        add(inputField);
        add(countButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Count Words")) {
            String inputText = inputField.getText();
            int wordCount = countWords(inputText);
            resultLabel.setText("Word Count: " + wordCount);
        }
    }

    private int countWords(String text) {
        String[] words = text.split("[\\s\\p{Punct}]+"); 
        return words.length;
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Task_2 app = new Task_2();
                app.setVisible(true);
            }
        });
    }
}

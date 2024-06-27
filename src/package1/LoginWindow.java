package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LoginWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frame.setSize(screenwith, screenheight);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Century", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(253, 698, 382, 26);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_4 = new JLabel("Password  :-");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1_4.setBounds(56, 691, 198, 36);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("UserName  :-");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1_3.setBounds(56, 626, 198, 36);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(253, 633, 382, 26);
		frame.getContentPane().add(textField_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pramod Yadav\\Nifty50_logo.jpg"));
		lblNewLabel.setBounds(0, 0, 1512, 827);
		frame.getContentPane().add(lblNewLabel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

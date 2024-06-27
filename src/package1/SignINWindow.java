package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import javax.swing.ImageIcon;

public class SignINWindow {

	private JFrame frmSigninwindow;
	private JTextField textName;
	private JTextField textGmail;
	private JTextField textMobile;
	private JTextField textUser;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignINWindow window = new SignINWindow();
					window.frmSigninwindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignINWindow() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmSigninwindow.setSize(screenwith, screenheight);
		frmSigninwindow.setLocationRelativeTo(null);
		frmSigninwindow.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(69, 417, 599, 335);
		frmSigninwindow.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Full_Name  :-");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1.setBounds(10, 10, 198, 36);
		panel.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Century", Font.BOLD, 20));
		textName.setColumns(10);
		textName.setBounds(207, 17, 382, 26);
		panel.add(textName);
		
		JLabel lblNewLabel_1_1 = new JLabel("    Gmail      :-");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1_1.setBounds(10, 82, 198, 36);
		panel.add(lblNewLabel_1_1);
		
		textGmail = new JTextField();
		textGmail.setFont(new Font("Century", Font.BOLD, 20));
		textGmail.setColumns(10);
		textGmail.setBounds(207, 92, 382, 26);
		panel.add(textGmail);
		
		JLabel lblNewLabel_1_2 = new JLabel("MobileNo.  :-");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1_2.setBounds(10, 148, 198, 36);
		panel.add(lblNewLabel_1_2);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Century", Font.BOLD, 20));
		textMobile.setColumns(10);
		textMobile.setBounds(207, 155, 382, 26);
		panel.add(textMobile);
		
		JLabel lblNewLabel_1_3 = new JLabel("UserName  :-");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1_3.setBounds(10, 216, 198, 36);
		panel.add(lblNewLabel_1_3);
		
		textUser = new JTextField();
		textUser.setFont(new Font("Century", Font.BOLD, 20));
		textUser.setColumns(10);
		textUser.setBounds(207, 223, 382, 26);
		panel.add(textUser);
		
		JLabel lblNewLabel_1_4 = new JLabel("Password  :-");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_1_4.setBounds(10, 281, 198, 36);
		panel.add(lblNewLabel_1_4);
		
		textPassword = new JTextField();
		textPassword.setFont(new Font("Century", Font.BOLD, 20));
		textPassword.setColumns(10);
		textPassword.setBounds(207, 288, 382, 26);
		panel.add(textPassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(678, 417, 135, 335);
		frmSigninwindow.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSigninwindow.setVisible(false);
				
			}
		});
		btnBack.setForeground(Color.BLUE);
		btnBack.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnBack.setBounds(10, 20, 115, 36);
		panel_1.add(btnBack);
		
		JButton btnSignin = new JButton("SIGNIN");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=textName.getText();
				String Gmail=textGmail.getText();
				String Mobile=textMobile.getText();
				String UserName=textUser.getText();
				String Pass_Word=textPassword.getText();
				
				JDBCNIFTY50 j=new JDBCNIFTY50();
				int status=j.insertData1(Name, Gmail, Mobile, UserName, Pass_Word);
				
				 if(status==1) {
						JOptionPane.showMessageDialog(null, "SignUp");
						
					}else {
						JOptionPane.showMessageDialog(null, "SignUp Failed");
					}
						
						
				
				
			}
		});
		btnSignin.setForeground(Color.ORANGE);
		btnSignin.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnSignin.setBounds(10, 112, 115, 36);
		panel_1.add(btnSignin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSigninwindow =new JFrame("EXIT");
				
				if(JOptionPane.showConfirmDialog(frmSigninwindow, "Confirm Do You want to exit","NiftyStockAnalyzer",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.BLUE);
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnExit.setBounds(10, 289, 115, 36);
		panel_1.add(btnExit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText(null);
				textGmail.setText(null);
				textMobile.setText(null);
				textUser.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setForeground(Color.ORANGE);
		btnReset.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnReset.setBounds(10, 198, 115, 36);
		panel_1.add(btnReset);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pramod Yadav\\Nifty50_logo.jpg"));
		lblNewLabel.setBounds(0, 0, 1522, 827);
		frmSigninwindow.getContentPane().add(lblNewLabel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSigninwindow = new JFrame();
		frmSigninwindow.setTitle("SignInWindow");
		frmSigninwindow.setBounds(100, 100, 450, 200);
		frmSigninwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

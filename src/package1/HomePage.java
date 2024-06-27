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
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class HomePage {

	private JFrame frmHomePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmHomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
//		JLable lable=new JLable();
//		ImageIcon img= ImageIcon(this.getClass().getResource("/Nifty50 image1.png "));
		
		frmHomePage.setSize(screenwith, screenheight);;
		frmHomePage.setLocationRelativeTo(null);
		frmHomePage.getContentPane().setLayout(null);
		frmHomePage.getContentPane().setLayout(null);
		
		JLabel lblHomePage = new JLabel("Home Page");
		lblHomePage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage.setForeground(Color.WHITE);
		lblHomePage.setFont(new Font("Times New Roman", Font.ITALIC, 64));
		lblHomePage.setBounds(562, 35, 373, 78);
		frmHomePage.getContentPane().add(lblHomePage);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 123, 1512, 2);
		frmHomePage.getContentPane().add(separator);
		
		JButton btnStockList = new JButton("COMPANY LIST");
		btnStockList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockList.main(null);
			}
		});
		btnStockList.setFont(new Font("Arial Black", Font.BOLD, 26));
		btnStockList.setBackground(Color.ORANGE);
		btnStockList.setBounds(165, 526, 304, 78);
		frmHomePage.getContentPane().add(btnStockList);
		
		JButton btnCompaniesData = new JButton("COMPANIES DATA");
		btnCompaniesData.setForeground(Color.BLACK);
		btnCompaniesData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyData.main(null);
			}
		});
		btnCompaniesData.setFont(new Font("Arial Black", Font.BOLD, 25));
		btnCompaniesData.setBackground(Color.ORANGE);
		btnCompaniesData.setBounds(1046, 527, 304, 78);
		frmHomePage.getContentPane().add(btnCompaniesData);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 640, 1522, 2);
		frmHomePage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHomePage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 35));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(101, 662, 261, 85);
		frmHomePage.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHomePage =new JFrame("EXIT");
				
				if(JOptionPane.showConfirmDialog(frmHomePage, "Confirm Do You want to exit","NiftyStockAnalyzer",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					     System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 35));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(1152, 667, 261, 80);
		frmHomePage.getContentPane().add(btnExit);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Pramod Yadav\\Comapanydata.png"));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(930, 135, 483, 333);
		frmHomePage.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\Pramod Yadav\\Companylist.jpg"));
		btnNewButton_1_1_1.setBounds(86, 135, 483, 333);
		frmHomePage.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pramod Yadav\\Hompage.jpg"));
		lblNewLabel.setBounds(0, 0, 1522, 827);
		frmHomePage.getContentPane().add(lblNewLabel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomePage = new JFrame();
		frmHomePage.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\sem4\\Sem 4\\PBLSyllabus\\PBLProject\\What-is-Nifty-50-Basics-of-Nifty-Meaning-Explained.jpg"));
		frmHomePage.setTitle("Home Page");
		frmHomePage.setBounds(100, 100, 450, 300);
		frmHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

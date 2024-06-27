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
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class datacontaine{

	private JFrame frmDatacontain;
	private JTextField textPrice;
	private JTextField textShares;
	private JTextField textName;
	private JTextField textNumber;
	private JTextField textCap;
	private JTextField textDebt;
	private JTextField textHolding;
	private JTextField textRoe;
	private JTextField textRoce;
	private JTextField textEarning;
	private JTextField textPriceEarnings;
	private JTextField textBook;
	private JTextField textFace;
	private JTextField textGrowth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datacontaine window = new datacontaine();
					window.frmDatacontain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public datacontaine() {
		initialize();	
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmDatacontain.setSize(screenwith, screenheight);
		frmDatacontain.setLocationRelativeTo(null);
		frmDatacontain.getContentPane().setLayout(null);
		
		JLabel lblCompanyData = new JLabel("Company's Info");
		lblCompanyData.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyData.setForeground(Color.RED);
		lblCompanyData.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblCompanyData.setBounds(546, 11, 373, 46);
		frmDatacontain.getContentPane().add(lblCompanyData);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 65, 1512, 2);
		frmDatacontain.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Number :");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblNewLabel.setBounds(504, 89, 143, 36);
		frmDatacontain.getContentPane().add(lblNewLabel);
		
		JLabel lblCompanyname = new JLabel("Company_Name :-");
		lblCompanyname.setForeground(Color.BLACK);
		lblCompanyname.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblCompanyname.setBounds(91, 199, 255, 36);
		frmDatacontain.getContentPane().add(lblCompanyname);
		
		JLabel lblTotalshare = new JLabel("Share_Price   :-");
		lblTotalshare.setForeground(SystemColor.desktop);
		lblTotalshare.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblTotalshare.setBounds(91, 279, 255, 36);
		frmDatacontain.getContentPane().add(lblTotalshare);
		
		textPrice = new JTextField();
		textPrice.setForeground(Color.BLUE);
		textPrice.setBackground(Color.WHITE);
		textPrice.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textPrice.setColumns(10);
		textPrice.setBounds(335, 281, 233, 34);
		frmDatacontain.getContentPane().add(textPrice);
		
		JLabel lblShareprice = new JLabel("Total_Shares   :-");
		lblShareprice.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblShareprice.setBounds(91, 362, 255, 36);
		frmDatacontain.getContentPane().add(lblShareprice);
		
		textShares = new JTextField();
		textShares.setForeground(Color.BLUE);
		textShares.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textShares.setColumns(10);
		textShares.setBackground(Color.WHITE);
		textShares.setBounds(335, 364, 233, 34);
		frmDatacontain.getContentPane().add(textShares);
		
		textName = new JTextField();
		textName.setForeground(Color.BLUE);
		textName.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textName.setColumns(10);
		textName.setBackground(Color.WHITE);
		textName.setBounds(335, 201, 233, 34);
		frmDatacontain.getContentPane().add(textName);
		
		textNumber = new JTextField();
		textNumber.setForeground(Color.BLUE);
		textNumber.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textNumber.setColumns(10);
		textNumber.setBackground(Color.WHITE);
		textNumber.setBounds(650, 91, 81, 34);
		frmDatacontain.getContentPane().add(textNumber);
		
		JLabel lblMarketcap = new JLabel("Market_Cap   :-");
		lblMarketcap.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblMarketcap.setBounds(91, 444, 227, 36);
		frmDatacontain.getContentPane().add(lblMarketcap);
		
		textCap = new JTextField();
		textCap.setForeground(Color.BLUE);
		textCap.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textCap.setColumns(10);
		textCap.setBackground(Color.WHITE);
		textCap.setBounds(335, 446, 233, 34);
		frmDatacontain.getContentPane().add(textCap);
		
		JLabel lblPriceearning = new JLabel("Debt     :-");
		lblPriceearning.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblPriceearning.setBounds(91, 524, 240, 36);
		frmDatacontain.getContentPane().add(lblPriceearning);
		
		textDebt = new JTextField();
		textDebt.setForeground(Color.BLUE);
		textDebt.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textDebt.setColumns(10);
		textDebt.setBackground(Color.WHITE);
		textDebt.setBounds(335, 526, 233, 34);
		frmDatacontain.getContentPane().add(textDebt);
		
		JLabel lblDividendyield = new JLabel("Dividend_YIELD    :- ");
		lblDividendyield.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblDividendyield.setBounds(692, 184, 281, 36);
		frmDatacontain.getContentPane().add(lblDividendyield);
		
		JTextField textDividend = new JTextField();
		textDividend.setForeground(Color.BLUE);
		textDividend.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textDividend.setColumns(10);
		textDividend.setBackground(Color.WHITE);
		textDividend.setBounds(985, 186, 233, 34);
		frmDatacontain.getContentPane().add(textDividend);
		
		textHolding = new JTextField();
		textHolding.setForeground(Color.BLUE);
		textHolding.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textHolding.setColumns(10);
		textHolding.setBackground(Color.WHITE);
		textHolding.setBounds(985, 281, 233, 34);
		frmDatacontain.getContentPane().add(textHolding);
		
		JLabel lblPromoterholding = new JLabel("Promoter_Holding  :-  ");
		lblPromoterholding.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblPromoterholding.setBounds(692, 279, 288, 36);
		frmDatacontain.getContentPane().add(lblPromoterholding);
		
		textRoe = new JTextField();
		textRoe.setForeground(Color.BLUE);
		textRoe.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textRoe.setColumns(10);
		textRoe.setBackground(Color.WHITE);
		textRoe.setBounds(335, 608, 233, 34);
		frmDatacontain.getContentPane().add(textRoe);
		
		JLabel lblRoe = new JLabel("R   O   E     :-");
		lblRoe.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblRoe.setBounds(91, 606, 227, 36);
		frmDatacontain.getContentPane().add(lblRoe);
		
		JLabel lblROC = new JLabel("R   O   C    E     :-");
		lblROC.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblROC.setBounds(91, 683, 227, 36);
		frmDatacontain.getContentPane().add(lblROC);
		
		textRoce = new JTextField();
		textRoce.setForeground(Color.BLUE);
		textRoce.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textRoce.setColumns(10);
		textRoce.setBackground(Color.WHITE);
		textRoce.setBounds(335, 685, 233, 34);
		frmDatacontain.getContentPane().add(textRoce);
		
		textEarning = new JTextField();
		textEarning.setForeground(Color.BLUE);
		textEarning.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textEarning.setColumns(10);
		textEarning.setBackground(Color.WHITE);
		textEarning.setBounds(985, 364, 233, 34);
		frmDatacontain.getContentPane().add(textEarning);
		
		JLabel lblearning = new JLabel("Earning_Per_Share  :- ");
		lblearning.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblearning.setBounds(692, 362, 288, 36);
		frmDatacontain.getContentPane().add(lblearning);
		
		textPriceEarnings = new JTextField();
		textPriceEarnings.setForeground(Color.BLUE);
		textPriceEarnings.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textPriceEarnings.setColumns(10);
		textPriceEarnings.setBackground(Color.WHITE);
		textPriceEarnings.setBounds(985, 446, 233, 34);
		frmDatacontain.getContentPane().add(textPriceEarnings);
		
		JLabel lblDebt = new JLabel("Price_Earning     :-");
		lblDebt.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblDebt.setBounds(692, 444, 281, 36);
		frmDatacontain.getContentPane().add(lblDebt);
		
		textBook = new JTextField();
		textBook.setForeground(Color.BLUE);
		textBook.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textBook.setColumns(10);
		textBook.setBackground(Color.WHITE);
		textBook.setBounds(985, 526, 233, 34);
		frmDatacontain.getContentPane().add(textBook);
		
		JLabel lblBookvalue = new JLabel("Book_Value    :-  ");
		lblBookvalue.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblBookvalue.setBounds(692, 524, 281, 36);
		frmDatacontain.getContentPane().add(lblBookvalue);
		
		textFace = new JTextField();
		textFace.setForeground(Color.BLUE);
		textFace.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textFace.setColumns(10);
		textFace.setBackground(Color.WHITE);
		textFace.setBounds(985, 608, 233, 34);
		frmDatacontain.getContentPane().add(textFace);
		
		JLabel lblFacevalue = new JLabel("Face_Value     :-  ");
		lblFacevalue.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblFacevalue.setBounds(692, 606, 281, 36);
		frmDatacontain.getContentPane().add(lblFacevalue);
		
		textGrowth = new JTextField();
		textGrowth.setForeground(Color.BLUE);
		textGrowth.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textGrowth.setColumns(10);
		textGrowth.setBackground(Color.WHITE);
		textGrowth.setBounds(985, 685, 233, 34);
		frmDatacontain.getContentPane().add(textGrowth);
		
		JLabel lblProfitgrowth = new JLabel("Profit_Growth    :- ");
		lblProfitgrowth.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblProfitgrowth.setBounds(692, 683, 281, 36);
		frmDatacontain.getContentPane().add(lblProfitgrowth);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 67, 1272, 726);
		frmDatacontain.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(636, 5, 0, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 702, 1272, 2);
		panel.add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1278, 65, 234, 722);
		frmDatacontain.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatacontain.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(43, 102, 156, 48);
		panel_1.add(btnNewButton);
		
		JButton btnAddData = new JButton("ADD DATA");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number=Integer.parseInt(textNumber.getText());
				String Stock_Name=textName.getText();
				String Total_Share=textShares.getText();
				String Share_Price=textPrice.getText();
				String Market_Cap=textCap.getText();
				String Price_Earnings=textPriceEarnings.getText();
				String Promoter_Holding=textHolding.getText();
				String Dividend=textDividend.getText();
				String EPS=textPriceEarnings.getText();
				String Debt=textDebt.getText();
				String ROE=textRoe.getText();
				String ROCE=textRoce.getText();
				String Book_Value=textBook.getText();
			    String Face_Value=textFace.getText();
			    String Profit_Growth=textGrowth.getText();
			    
			    
			    JDBCNIFTY50 j=new JDBCNIFTY50();
			    int status=j.insertdata(Number, Stock_Name, Total_Share, Share_Price, Market_Cap, Price_Earnings, Promoter_Holding, Dividend, EPS, Debt, ROE, ROCE, Book_Value, Face_Value, Profit_Growth);
			    if(status==1) {
					JOptionPane.showMessageDialog(null, "Data Added");
					
				}else {
					JOptionPane.showMessageDialog(null, "Problem in adding ");
				}
				
				
				
				
				 

			}
		});
		btnAddData.setBackground(Color.CYAN);
		btnAddData.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnAddData.setBounds(43, 263, 156, 48);
		panel_1.add(btnAddData);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNumber.setText(null);
				textName.setText(null);
				textShares.setText(null);
				textPrice.setText(null);
				textCap.setText(null);
				textEarning.setText(null);
				textHolding.setText(null);
				textDividend.setText(null);
				textPriceEarnings.setText(null);
				textDebt.setText(null);
				textRoe.setText(null);
				textRoce.setText(null);
				textBook.setText(null);
				textFace.setText(null);
				textGrowth.setText(null);
			}
		});
		btnReset.setBackground(Color.CYAN);
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(43, 430, 156, 48);
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatacontain =new JFrame("EXIT");		
				if(JOptionPane.showConfirmDialog(frmDatacontain, "Confirm Do You want to exit","NiftyStockAnalyzer",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(Color.CYAN);
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(43, 578, 156, 48);
		panel_1.add(btnExit);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDatacontain = new JFrame();
		frmDatacontain.getContentPane().setBackground(Color.WHITE);
		frmDatacontain.setTitle("Datacontain");
		frmDatacontain.setBounds(100, 100, 450, 300);
		frmDatacontain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

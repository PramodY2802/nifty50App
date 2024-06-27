package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;



import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CompanyData {

	private JFrame frmCompanyData;
	private JTextField textNumber;
	private JTextField textName;
	private JTextField textPrice;
	private JTextField textShares;
	private JTextField textCap;
	private JTextField textDebt;
	private JTextField textROE;
	private JTextField textROCE;
	private JTextField textDividend;
	private JTextField textHolding;
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
					CompanyData window = new CompanyData();
					window.frmCompanyData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CompanyData() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmCompanyData.setSize(screenwith, screenheight);
		frmCompanyData.setLocationRelativeTo(null);
		frmCompanyData.getContentPane().setLayout(null);
		
		JLabel lblTotalshare = new JLabel("Share_Price   :-");
		lblTotalshare.setForeground(Color.RED);
		lblTotalshare.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblTotalshare.setBounds(66, 311, 255, 36);
		frmCompanyData.getContentPane().add(lblTotalshare);
		
		textPrice = new JTextField();
		textPrice.setForeground(Color.BLUE);
		textPrice.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textPrice.setColumns(10);
		textPrice.setBackground(Color.WHITE);
		textPrice.setBounds(310, 313, 233, 34);
		frmCompanyData.getContentPane().add(textPrice);
		
		JLabel lblShareprice = new JLabel("Total_Shares   :-");
		lblShareprice.setForeground(Color.RED);
		lblShareprice.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblShareprice.setBounds(66, 394, 255, 36);
		frmCompanyData.getContentPane().add(lblShareprice);
		
		textShares = new JTextField();
		textShares.setForeground(Color.BLUE);
		textShares.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textShares.setColumns(10);
		textShares.setBackground(Color.WHITE);
		textShares.setBounds(310, 396, 233, 34);
		frmCompanyData.getContentPane().add(textShares);
		
		textCap = new JTextField();
		textCap.setForeground(Color.BLUE);
		textCap.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textCap.setColumns(10);
		textCap.setBackground(Color.WHITE);
		textCap.setBounds(310, 478, 233, 34);
		frmCompanyData.getContentPane().add(textCap);
		
		JLabel lblMarketcap = new JLabel("Market_Cap   :-");
		lblMarketcap.setForeground(Color.RED);
		lblMarketcap.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblMarketcap.setBounds(66, 476, 227, 36);
		frmCompanyData.getContentPane().add(lblMarketcap);
		
		JLabel lblPriceearning = new JLabel("Debt     :-");
		lblPriceearning.setForeground(Color.RED);
		lblPriceearning.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblPriceearning.setBounds(66, 556, 240, 36);
		frmCompanyData.getContentPane().add(lblPriceearning);
		
		textDebt = new JTextField();
		textDebt.setForeground(Color.BLUE);
		textDebt.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textDebt.setColumns(10);
		textDebt.setBackground(Color.WHITE);
		textDebt.setBounds(310, 558, 233, 34);
		frmCompanyData.getContentPane().add(textDebt);
		
		textROE = new JTextField();
		textROE.setForeground(Color.BLUE);
		textROE.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textROE.setColumns(10);
		textROE.setBackground(Color.WHITE);
		textROE.setBounds(310, 640, 233, 34);
		frmCompanyData.getContentPane().add(textROE);
		
		JLabel lblRoe = new JLabel("R   O   E     :-");
		lblRoe.setForeground(Color.RED);
		lblRoe.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblRoe.setBounds(66, 638, 227, 36);
		frmCompanyData.getContentPane().add(lblRoe);
		
		JLabel lblROC = new JLabel("R   O   C    E     :-");
		lblROC.setForeground(Color.RED);
		lblROC.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblROC.setBounds(66, 715, 227, 36);
		frmCompanyData.getContentPane().add(lblROC);
		
		textROCE = new JTextField();
		textROCE.setForeground(Color.BLUE);
		textROCE.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textROCE.setColumns(10);
		textROCE.setBackground(Color.WHITE);
		textROCE.setBounds(310, 717, 233, 34);
		frmCompanyData.getContentPane().add(textROCE);
		
		textDividend = new JTextField();
		textDividend.setForeground(Color.BLUE);
		textDividend.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textDividend.setColumns(10);
		textDividend.setBackground(Color.WHITE);
		textDividend.setBounds(960, 218, 233, 34);
		frmCompanyData.getContentPane().add(textDividend);
		
		JLabel lblDividendyield = new JLabel("Dividend_YIELD    :- ");
		lblDividendyield.setForeground(Color.RED);
		lblDividendyield.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblDividendyield.setBounds(667, 216, 281, 36);
		frmCompanyData.getContentPane().add(lblDividendyield);
		
		JLabel lblPromoterholding = new JLabel("Promoter_Holding  :-  ");
		lblPromoterholding.setForeground(Color.RED);
		lblPromoterholding.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblPromoterholding.setBounds(667, 311, 288, 36);
		frmCompanyData.getContentPane().add(lblPromoterholding);
		
		textHolding = new JTextField();
		textHolding.setForeground(Color.BLUE);
		textHolding.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textHolding.setColumns(10);
		textHolding.setBackground(Color.WHITE);
		textHolding.setBounds(960, 313, 233, 34);
		frmCompanyData.getContentPane().add(textHolding);
		
		textEarning = new JTextField();
		textEarning.setForeground(Color.BLUE);
		textEarning.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textEarning.setColumns(10);
		textEarning.setBackground(Color.WHITE);
		textEarning.setBounds(960, 396, 233, 34);
		frmCompanyData.getContentPane().add(textEarning);
		
		JLabel lblearning = new JLabel("Earning_Per_Share  :- ");
		lblearning.setForeground(Color.RED);
		lblearning.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblearning.setBounds(667, 394, 288, 36);
		frmCompanyData.getContentPane().add(lblearning);
		
		JLabel lblDebt = new JLabel("Price_Earning     :-");
		lblDebt.setForeground(Color.RED);
		lblDebt.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblDebt.setBounds(667, 476, 281, 36);
		frmCompanyData.getContentPane().add(lblDebt);
		
		textPriceEarnings = new JTextField();
		textPriceEarnings.setForeground(Color.BLUE);
		textPriceEarnings.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textPriceEarnings.setColumns(10);
		textPriceEarnings.setBackground(Color.WHITE);
		textPriceEarnings.setBounds(960, 478, 233, 34);
		frmCompanyData.getContentPane().add(textPriceEarnings);
		
		textBook = new JTextField();
		textBook.setForeground(Color.BLUE);
		textBook.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textBook.setColumns(10);
		textBook.setBackground(Color.WHITE);
		textBook.setBounds(960, 558, 233, 34);
		frmCompanyData.getContentPane().add(textBook);
		
		JLabel lblBookvalue = new JLabel("Book_Value    :-  ");
		lblBookvalue.setForeground(Color.RED);
		lblBookvalue.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblBookvalue.setBounds(667, 556, 281, 36);
		frmCompanyData.getContentPane().add(lblBookvalue);
		
		JLabel lblFacevalue = new JLabel("Face_Value     :-  ");
		lblFacevalue.setForeground(Color.RED);
		lblFacevalue.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblFacevalue.setBounds(667, 638, 281, 36);
		frmCompanyData.getContentPane().add(lblFacevalue);
		
		textFace = new JTextField();
		textFace.setForeground(Color.BLUE);
		textFace.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textFace.setColumns(10);
		textFace.setBackground(Color.WHITE);
		textFace.setBounds(960, 640, 233, 34);
		frmCompanyData.getContentPane().add(textFace);
		
		textGrowth = new JTextField();
		textGrowth.setForeground(Color.BLUE);
		textGrowth.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textGrowth.setColumns(10);
		textGrowth.setBackground(Color.WHITE);
		textGrowth.setBounds(960, 717, 233, 34);
		frmCompanyData.getContentPane().add(textGrowth);
		
		JLabel lblProfitgrowth = new JLabel("Profit_Growth    :- ");
		lblProfitgrowth.setForeground(Color.RED);
		lblProfitgrowth.setFont(new Font("Cambria", Font.PLAIN, 30));
		lblProfitgrowth.setBounds(667, 715, 281, 36);
		frmCompanyData.getContentPane().add(lblProfitgrowth);
		
		JLabel lblCompanysData = new JLabel("Company's Data");
		lblCompanysData.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanysData.setForeground(Color.GREEN);
		lblCompanysData.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblCompanysData.setBounds(556, 11, 373, 46);
		frmCompanyData.getContentPane().add(lblCompanysData);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(380, 55, 1, 2);
		frmCompanyData.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 87, 1542, 2);
		frmCompanyData.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 85, 1253, 732);
		frmCompanyData.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(621, 5, 0, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 695, 1243, 2);
		panel.add(separator_3);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 int Number=Integer.parseInt(textNumber.getText());
//				String Stock_Name=textName.getText(); 
				JDBCNIFTY50 j=new JDBCNIFTY50();
                 ResultSet result=null; 
				result=j.getrow(Number);
				try {
					while(result.next()) {
//					 textField.setText(result.getString(1));
				     textName.setText(result.getString(2));
				     textPrice.setText(result.getString(4));
				     textShares.setText(result.getString(3
				    		 ));
				     textCap.setText(result.getString(5));
				     textDebt.setText(result.getString(10));
				     textROE.setText(result.getString(11));
				     textROCE.setText(result.getString(12));
				     textDividend.setText(result.getString(8));
				     textHolding.setText(result.getString(7));
				     textEarning.setText(result.getString(9));
				     textPriceEarnings.setText(result.getString(6));
				     textBook.setText(result.getString(13));
				     textFace.setText(result.getString(14));
				     textGrowth.setText(result.getString(15));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSearch.setBounds(736, 33, 181, 36);
		panel.add(btnSearch);
		btnSearch.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSearch.setBackground(Color.ORANGE);
		
		JLabel lblNumber = new JLabel("Number :-");
		lblNumber.setForeground(Color.RED);
		lblNumber.setBounds(413, 33, 143, 36);
		panel.add(lblNumber);
		lblNumber.setFont(new Font("Cambria", Font.PLAIN, 30));
		
		textNumber = new JTextField();
		textNumber.setBounds(595, 36, 90, 34);
		panel.add(textNumber);
		textNumber.setForeground(Color.BLUE);
		textNumber.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textNumber.setColumns(10);
		textNumber.setBackground(Color.WHITE);
		
		textName = new JTextField();
		textName.setBounds(301, 143, 233, 34);
		panel.add(textName);
		textName.setForeground(Color.BLUE);
		textName.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		textName.setColumns(10);
		textName.setBackground(Color.WHITE);
		
		JLabel lblCompanyname = new JLabel("Company_Name :-");
		lblCompanyname.setBounds(53, 137, 255, 36);
		panel.add(lblCompanyname);
		lblCompanyname.setForeground(Color.RED);
		lblCompanyname.setFont(new Font("Cambria", Font.PLAIN, 30));
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 87, 1253, 2);
		panel.add(separator_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(1272, 87, 240, 730);
		frmCompanyData.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCompanyData.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(Color.ORANGE);
		btnBack.setBounds(39, 72, 156, 48);
		panel_1.add(btnBack);
		
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
				textROE.setText(null);
                textROCE.setText(null);
				textBook.setText(null);
				textFace.setText(null);
				textGrowth.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBackground(Color.ORANGE);
		btnReset.setBounds(39, 433, 156, 48);
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCompanyData =new JFrame("EXIT");		
				if(JOptionPane.showConfirmDialog(frmCompanyData, "Confirm Do You want to exit","NiftyStockAnalyzer",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBackground(Color.ORANGE);
		btnExit.setBounds(39, 600, 156, 48);
		panel_1.add(btnExit);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 693, 230, 2);
		panel_1.add(separator_4);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number=Integer.parseInt(textNumber.getText());
				String Stock_Name=textName.getText();
				String Total_Share=textShares.getText();
				String Share_Price=textPrice.getText();
				String Market_Cap=textCap.getText();
				String Price_Earning=textPriceEarnings.getText();
				String Promoter_Holding=textHolding.getText();
				String Dividend=textDividend.getText();
				String EPS=textPriceEarnings.getText();
				String Debt=textDebt.getText();
				String ROE=textROE.getText();
				String ROCE=textROCE.getText();
				String Book_Value=textBook.getText();
			    String Face_Value=textFace.getText();
			    String Profit_Growth=textGrowth.getText();
			    
			    JDBCNIFTY50 j=new JDBCNIFTY50();
			   int status= j.insertupdate(Number, Stock_Name, Total_Share, Share_Price, Market_Cap, Price_Earning, Promoter_Holding, Dividend, EPS, Debt, ROE, ROCE, Book_Value, Face_Value, Profit_Growth);
			    if(status==1) {
					JOptionPane.showMessageDialog(null, "Updatedddddd");
					
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Update ");
				}
				
			    
			}
		});
		btnUpdate.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnUpdate.setBackground(Color.ORANGE);
		btnUpdate.setBounds(39, 270, 156, 48);
		panel_1.add(btnUpdate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1253, 92, 27, 725);
		frmCompanyData.getContentPane().add(panel_2);
		panel_2.setLayout(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompanyData = new JFrame();
		frmCompanyData.setBackground(Color.RED);
		frmCompanyData.getContentPane().setBackground(Color.BLACK);
		frmCompanyData.setTitle("Company Data");
		frmCompanyData.setBounds(100, 100, 450, 300);
		frmCompanyData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StockList {

	private JFrame frmStocklist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockList window = new StockList();
					window.frmStocklist.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StockList() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmStocklist.setSize(1453, 862);;
		frmStocklist.setLocationRelativeTo(null);
		frmStocklist.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 1502, 752);
		frmStocklist.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		scrollPane.setViewportView(panel);
		panel.setForeground(Color.BLUE);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1.RELIANCE");
		lblNewLabel_1.setBounds(31, 31, 203, 36);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. HDFC");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(31, 97, 203, 36);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3. INFOSYS");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setBounds(31, 160, 203, 36);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4. HDFC FIN");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setBounds(31, 230, 203, 36);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("5. ICICI");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setBounds(31, 296, 203, 36);
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("6. TCS");
		lblNewLabel_1_5.setForeground(Color.RED);
		lblNewLabel_1_5.setBounds(31, 360, 203, 36);
		lblNewLabel_1_5.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("7. KOTAK");
		lblNewLabel_1_5_1.setForeground(Color.RED);
		lblNewLabel_1_5_1.setBounds(31, 425, 203, 36);
		lblNewLabel_1_5_1.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("8. HUL");
		lblNewLabel_1_5_2.setForeground(Color.RED);
		lblNewLabel_1_5_2.setBounds(31, 499, 203, 36);
		lblNewLabel_1_5_2.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("9. AXIS");
		lblNewLabel_1_5_3.setForeground(Color.RED);
		lblNewLabel_1_5_3.setBounds(31, 569, 203, 36);
		lblNewLabel_1_5_3.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_5_4 = new JLabel("10. L&T");
		lblNewLabel_1_5_4.setForeground(Color.RED);
		lblNewLabel_1_5_4.setBounds(31, 632, 203, 36);
		lblNewLabel_1_5_4.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_4);
		
		JLabel lblNewLabel_1_5_5 = new JLabel("11. ITC");
		lblNewLabel_1_5_5.setForeground(Color.RED);
		lblNewLabel_1_5_5.setBounds(281, 31, 203, 36);
		lblNewLabel_1_5_5.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_5);
		
		JLabel lblNewLabel_1_5_6 = new JLabel("12. SBI");
		lblNewLabel_1_5_6.setForeground(Color.RED);
		lblNewLabel_1_5_6.setBounds(281, 97, 203, 36);
		lblNewLabel_1_5_6.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_6);
		
		JLabel lblNewLabel_1_5_7 = new JLabel("13. BAJAJ FIN");
		lblNewLabel_1_5_7.setForeground(Color.RED);
		lblNewLabel_1_5_7.setBounds(281, 160, 223, 36);
		lblNewLabel_1_5_7.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_7);
		
		JLabel lblNewLabel_1_5_8 = new JLabel("14. ASIAN PAINT");
		lblNewLabel_1_5_8.setForeground(Color.RED);
		lblNewLabel_1_5_8.setBounds(281, 230, 203, 36);
		lblNewLabel_1_5_8.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_8);
		
		JLabel lblNewLabel_1_5_9 = new JLabel("15. BHARTIARTL");
		lblNewLabel_1_5_9.setForeground(Color.RED);
		lblNewLabel_1_5_9.setBounds(281, 296, 203, 36);
		lblNewLabel_1_5_9.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_9);
		
		JLabel lblNewLabel_1_5_10 = new JLabel("16. HCLTECH");
		lblNewLabel_1_5_10.setForeground(Color.RED);
		lblNewLabel_1_5_10.setBounds(281, 360, 203, 36);
		lblNewLabel_1_5_10.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_10);
		
		JLabel lblNewLabel_1_5_11 = new JLabel("17. MARUTI");
		lblNewLabel_1_5_11.setForeground(Color.RED);
		lblNewLabel_1_5_11.setBounds(281, 425, 203, 36);
		lblNewLabel_1_5_11.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_11);
		
		JLabel lblNewLabel_1_5_12 = new JLabel("18. TATASTEEL");
		lblNewLabel_1_5_12.setForeground(Color.RED);
		lblNewLabel_1_5_12.setBounds(281, 499, 203, 36);
		lblNewLabel_1_5_12.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_12);
		
		JLabel lblNewLabel_1_5_13 = new JLabel("19. WIPRO");
		lblNewLabel_1_5_13.setForeground(Color.RED);
		lblNewLabel_1_5_13.setBounds(281, 569, 203, 36);
		lblNewLabel_1_5_13.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_13);
		
		JLabel lblNewLabel_1_5_14 = new JLabel("20. ULTRATECH");
		lblNewLabel_1_5_14.setForeground(Color.RED);
		lblNewLabel_1_5_14.setBounds(281, 632, 203, 36);
		lblNewLabel_1_5_14.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_14);
		
		JLabel lblNewLabel_1_5_15 = new JLabel("21. MAHINDRA");
		lblNewLabel_1_5_15.setForeground(Color.RED);
		lblNewLabel_1_5_15.setBounds(545, 31, 203, 36);
		lblNewLabel_1_5_15.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_15);
		
		JLabel lblNewLabel_1_5_16 = new JLabel("22. BAJAJFINSV");
		lblNewLabel_1_5_16.setForeground(Color.RED);
		lblNewLabel_1_5_16.setBounds(545, 97, 203, 36);
		lblNewLabel_1_5_16.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_16);
		
		JLabel lblNewLabel_1_5_17 = new JLabel("23. SUNPHARMA");
		lblNewLabel_1_5_17.setForeground(Color.RED);
		lblNewLabel_1_5_17.setBounds(545, 160, 203, 36);
		lblNewLabel_1_5_17.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_17);
		
		JLabel lblNewLabel_1_5_18 = new JLabel("24. TITAN");
		lblNewLabel_1_5_18.setForeground(Color.RED);
		lblNewLabel_1_5_18.setBounds(545, 230, 203, 36);
		lblNewLabel_1_5_18.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_18);
		
		JLabel lblNewLabel_1_5_19 = new JLabel("25. TECHHM");
		lblNewLabel_1_5_19.setForeground(Color.RED);
		lblNewLabel_1_5_19.setBounds(545, 296, 203, 36);
		lblNewLabel_1_5_19.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_19);
		
		JLabel lblNewLabel_1_5_20 = new JLabel("26. DRREDDY");
		lblNewLabel_1_5_20.setForeground(Color.RED);
		lblNewLabel_1_5_20.setBounds(545, 360, 203, 36);
		lblNewLabel_1_5_20.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_20);
		
		JLabel lblNewLabel_1_5_21 = new JLabel("27. JSWSTEEL");
		lblNewLabel_1_5_21.setForeground(Color.RED);
		lblNewLabel_1_5_21.setBounds(545, 425, 203, 36);
		lblNewLabel_1_5_21.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_21);
		
		JLabel lblNewLabel_1_5_22 = new JLabel("28. NESTLEIND");
		lblNewLabel_1_5_22.setForeground(Color.RED);
		lblNewLabel_1_5_22.setBounds(545, 499, 203, 36);
		lblNewLabel_1_5_22.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_22);
		
		JLabel lblNewLabel_1_5_23 = new JLabel("29. INDUSIND");
		lblNewLabel_1_5_23.setForeground(Color.RED);
		lblNewLabel_1_5_23.setBounds(545, 569, 203, 36);
		lblNewLabel_1_5_23.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_23);
		
		JLabel lblNewLabel_1_5_24 = new JLabel("30. TATAMOTORS");
		lblNewLabel_1_5_24.setForeground(Color.RED);
		lblNewLabel_1_5_24.setBounds(545, 632, 223, 36);
		lblNewLabel_1_5_24.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_24);
		
		JLabel lblNewLabel_1_5_25 = new JLabel("31. POWERGRID");
		lblNewLabel_1_5_25.setForeground(Color.RED);
		lblNewLabel_1_5_25.setBounds(805, 31, 203, 36);
		lblNewLabel_1_5_25.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_25);
		
		JLabel lblNewLabel_1_5_26 = new JLabel("32. GRASIM");
		lblNewLabel_1_5_26.setForeground(Color.RED);
		lblNewLabel_1_5_26.setBounds(805, 97, 203, 36);
		lblNewLabel_1_5_26.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_26);
		
		JLabel lblNewLabel_1_5_27 = new JLabel("33. HDFCLIFE");
		lblNewLabel_1_5_27.setForeground(Color.RED);
		lblNewLabel_1_5_27.setBounds(805, 160, 203, 36);
		lblNewLabel_1_5_27.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_27);
		
		JLabel lblNewLabel_1_5_28 = new JLabel("34. DIVISLAB");
		lblNewLabel_1_5_28.setForeground(Color.RED);
		lblNewLabel_1_5_28.setBounds(805, 230, 203, 36);
		lblNewLabel_1_5_28.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_28);
		
		JLabel lblNewLabel_1_5_29 = new JLabel("35. NTPC");
		lblNewLabel_1_5_29.setForeground(Color.RED);
		lblNewLabel_1_5_29.setBounds(805, 296, 203, 36);
		lblNewLabel_1_5_29.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_29);
		
		JLabel lblNewLabel_1_5_30 = new JLabel("36. HINDALCO");
		lblNewLabel_1_5_30.setForeground(Color.RED);
		lblNewLabel_1_5_30.setBounds(805, 360, 203, 36);
		lblNewLabel_1_5_30.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_30);
		
		JLabel lblNewLabel_1_5_31 = new JLabel("37. BAJAJ-AUTO");
		lblNewLabel_1_5_31.setForeground(Color.RED);
		lblNewLabel_1_5_31.setBounds(805, 425, 203, 36);
		lblNewLabel_1_5_31.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_31);
		
		JLabel lblNewLabel_1_5_32 = new JLabel("38. ADANIPORT");
		lblNewLabel_1_5_32.setForeground(Color.RED);
		lblNewLabel_1_5_32.setBounds(805, 499, 203, 36);
		lblNewLabel_1_5_32.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_32);
		
		JLabel lblNewLabel_1_5_33 = new JLabel("39. CIPLA");
		lblNewLabel_1_5_33.setForeground(Color.RED);
		lblNewLabel_1_5_33.setBounds(805, 569, 203, 36);
		lblNewLabel_1_5_33.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_33);
		
		JLabel lblNewLabel_1_5_34 = new JLabel("40. TATACONSUM");
		lblNewLabel_1_5_34.setForeground(Color.RED);
		lblNewLabel_1_5_34.setBounds(805, 632, 215, 36);
		lblNewLabel_1_5_34.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_34);
		
		JLabel lblNewLabel_1_5_35 = new JLabel("41. SBILIFE");
		lblNewLabel_1_5_35.setForeground(Color.RED);
		lblNewLabel_1_5_35.setBounds(1079, 31, 203, 36);
		lblNewLabel_1_5_35.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_35);
		
		JLabel lblNewLabel_1_5_36 = new JLabel("42. BPCL");
		lblNewLabel_1_5_36.setForeground(Color.RED);
		lblNewLabel_1_5_36.setBounds(1079, 97, 203, 36);
		lblNewLabel_1_5_36.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_36);
		
		JLabel lblNewLabel_1_5_37 = new JLabel("43. UPL");
		lblNewLabel_1_5_37.setForeground(Color.RED);
		lblNewLabel_1_5_37.setBounds(1079, 160, 203, 36);
		lblNewLabel_1_5_37.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_37);
		
		JLabel lblNewLabel_1_5_38 = new JLabel("44. BRITANNIA");
		lblNewLabel_1_5_38.setForeground(Color.RED);
		lblNewLabel_1_5_38.setBounds(1079, 230, 203, 36);
		lblNewLabel_1_5_38.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_38);
		
		JLabel lblNewLabel_1_5_39 = new JLabel("45. ONGC");
		lblNewLabel_1_5_39.setForeground(Color.RED);
		lblNewLabel_1_5_39.setBounds(1079, 296, 203, 36);
		lblNewLabel_1_5_39.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_39);
		
		JLabel lblNewLabel_1_5_40 = new JLabel("46. EICHERMOT");
		lblNewLabel_1_5_40.setForeground(Color.RED);
		lblNewLabel_1_5_40.setBounds(1079, 360, 203, 36);
		lblNewLabel_1_5_40.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_40);
		
		JLabel lblNewLabel_1_5_41 = new JLabel("47. HEROMOTOR");
		lblNewLabel_1_5_41.setForeground(Color.RED);
		lblNewLabel_1_5_41.setBounds(1079, 425, 203, 36);
		lblNewLabel_1_5_41.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_41);
		
		JLabel lblNewLabel_1_5_42 = new JLabel("48. SHREECEM");
		lblNewLabel_1_5_42.setForeground(Color.RED);
		lblNewLabel_1_5_42.setBounds(1079, 499, 203, 36);
		lblNewLabel_1_5_42.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_42);
		
		JLabel lblNewLabel_1_5_43 = new JLabel("49. COALINDIA\r\n");
		lblNewLabel_1_5_43.setForeground(Color.RED);
		lblNewLabel_1_5_43.setBounds(1079, 569, 203, 36);
		lblNewLabel_1_5_43.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_43);
		
		JLabel lblNewLabel_1_5_44 = new JLabel("50. IOC");
		lblNewLabel_1_5_44.setForeground(Color.RED);
		lblNewLabel_1_5_44.setBounds(1079, 632, 203, 36);
		lblNewLabel_1_5_44.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblNewLabel_1_5_44);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(65, 678, 156, 31);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           frmStocklist.setVisible(false); 
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(Color.WHITE);
		panel.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(1138, 678, 144, 31);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					frmStocklist =new JFrame("EXIT");
					
					if(JOptionPane.showConfirmDialog(frmStocklist, "Confirm Do You want to exit","NiftyStockAnalyzer",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						
						     System.exit(0);
					}
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBackground(Color.WHITE);
		panel.add(btnExit);
		
		JLabel lblStocklist = new JLabel("Company  List");
		lblStocklist.setHorizontalAlignment(SwingConstants.CENTER);
		lblStocklist.setForeground(Color.GREEN);
		lblStocklist.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblStocklist.setBounds(440, 10, 486, 46);
		frmStocklist.getContentPane().add(lblStocklist);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStocklist = new JFrame();
		frmStocklist.setBackground(Color.RED);
		frmStocklist.getContentPane().setBackground(Color.BLACK);
		frmStocklist.setTitle("StockList");
		frmStocklist.setBounds(100, 100, 450, 300);
		frmStocklist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

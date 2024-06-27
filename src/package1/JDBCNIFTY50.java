package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCNIFTY50 {

	Connection con=null;
	PreparedStatement p=null;
	Statement stmt=null;
	ResultSet result=null;
                       
	JDBCNIFTY50() {
	          
		 try {
	 			Class.forName("com.mysql.jdbc.Driver");
	 			System.out.println("load succesfull");
	 		} catch (ClassNotFoundException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 			System.out.println("load unsuccesfull");
	 		}
	 		
	 		
	 		try {
	 			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nifty50", "root" ,"root123");
	 			System.out.println("wow: connection get succefull");
	 		} catch (SQLException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 			System.out.println("connection failed");
	 		}
			 
		}
	int insertdata(int Number,String Stock_Name, String Total_Share, String Share_Price, String Market_Cap, String Price_Earning, String Promoter_Holding, String Dividend_Yield, String EPS, String Debt, String ROE, String ROCE, String Book_Value, String Face_value, String Profit_Growth) {
		int status=0;
		
		try {
			p=con.prepareStatement("insert into stockvalues1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			p.setInt(1,Number);
			p.setString(2,Stock_Name);
			p.setString(3,Total_Share);
			p.setString(4,Share_Price);
			p.setString(5,Market_Cap);
			p.setString(6,Price_Earning);
			p.setString(7,Promoter_Holding);
			p.setString(8,Dividend_Yield);
			p.setString(9,EPS);
			p.setString(10,Debt);
			p.setString(11,ROE);
			p.setString(12,ROCE);
			p.setString(13,Book_Value);
			p.setString(14,Face_value);
			p.setString(15,Profit_Growth);
		    status=p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	ResultSet getrow(int Number) {
  	  try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	  
  	  String query="select * from stockvalues1 where Number = "+Number;
  	  try {
			result=stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
  	      return result;  
    }
	
	 int insertupdate(int Number,String Stock_Name, String Total_Share, String Share_Price, String Market_Cap, String Price_Earning, String Promoter_Holding, String Dividend_Yield, String EPS, String Debt, String ROE, String ROCE, String Book_Value, String Face_value, String Profit_Growth) {
		 int status=0;
		 try {
			p=con.prepareStatement("update stockvalues1 set NUmber=?,Stock_Name=?,Total_Share=?,Share_Price=?,Market_Cap=?,Price_Earning=?,Promoter_Holding=?,Dividend_Yield=?,EPS=?,Debt=?,ROE=?,ROCE=?,Book_Value=?,Face_Value=?,Profit_Growth=? where Number= "+Number);
			p.setInt(1,Number);
			p.setString(2,Stock_Name);
			p.setString(3,Total_Share);
			p.setString(4,Share_Price);
			p.setString(5,Market_Cap);
			p.setString(6,Price_Earning);
			p.setString(7,Promoter_Holding);
			p.setString(8,Dividend_Yield);
			p.setString(9,EPS);
			p.setString(10,Debt);
			p.setString(11,ROE);
			p.setString(12,ROCE);
			p.setString(13,Book_Value);
			p.setString(14,Face_value);
			p.setString(15,Profit_Growth);
		    status=p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return status;
	 }
	 
	 int insertData1(String Name,String Gmail,String Mobile,String UserName,String Pass_Word) {
		 int status=0;
		 try {
			p=con.prepareStatement("insert into signup values(?,?,?,?,?)");
			p.setString(1,Name);
			p.setString(2,Gmail);
			p.setString(3,Mobile);
			p.setString(4,UserName);
			p.setString(5,Pass_Word);
			status=p.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 return status;
	 }
	 
	 
}

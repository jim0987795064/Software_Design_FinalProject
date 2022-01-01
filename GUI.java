import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.table.DefaultTableModel;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Label;

public class GUI {
	@FXML
	//must be public to fxml
	public Button Query, Select, Delete, Insert, Update, Count, Sum, Max, Min, Avg, Exist, NotExist, In, NotIn;
	@FXML
	public TextField Query_input, select1, select2, insert1, insert2, insert3, insert4 , delete1, delete2, delete3, update1, update2, update3, update4, update5;
	@FXML
	public TextField count1, count2, count3, count4, sum1, sum2,max1, max2, min1, min2, avg1, avg2;
	//in/exist
	public TextField exist1, exist2, exist3, exist4, exist5, exist6, exist7, exist8, in1, in2, in3, in4, in5, in6, in7;
    public Label textLabel1, textLabel2, textLabel3, textLabel4, textLabel5, textLabel6;
	//Text text = new Text();
	String table = "", table2 = "" ,table3 = "", table4 ="";

	
	
	 DBController con =new DBController();
     Connection connection = con.DBConnection();
     boolean column = true;
    //for buttion
     public void Select_Press(ActionEvent e)throws SQLException{
    	 String head = "";
    	 int head1 = 0, head2=0, head3=0, head4 = 0;
    	 table = "";
    	 table2 = "";
    	 table3 = "";
    	 table4 = "";
    	 Statement statement = connection.createStatement();
    	 String query1 = select1.getText();
     	 String query2 = select2.getText();
     	String query = "SELECT " + query1 + " FROM "+ query2;
     	String sql = query;
     	ResultSet Select_Result = statement.executeQuery(sql);
     	//System.out.println(sql);
     	if(sql.contains("Student")) {
 			
     		while(Select_Result.next()) {   			
     			if(sql.contains("Student_Number")) {
     				if(head1 == 0) {
     					table += "Student_Number"+"\n";
     					head1++;
     				}
     					
                        table += Select_Result.getString("Student_Number")+"  ";				
     			}
     			if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     				}
     			if(sql.contains("Double_Major")) {
     				if(head3 == 0) {
     					table3 += "Double_Major"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Double_Major")+"  ";
     			}
     			if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Student_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Double_Major"+"\n";
     					head3++;
     				}
     				table += Select_Result.getString("Student_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Double_Major")+" ";
     			
     			
     			}
     			table += "\n";
     			table2 += "\n";
     			table3 += "\n";
     			System.out.println();
     		}
     		}
     	//
     	else if(sql.contains("Staff")){
 			while(Select_Result.next()) {
 				if(sql.contains("Staff_Number")) {
 					if(head1 == 0) {
     					table += "Staff_Number"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Staff_Number")+"  ";
 				}
 				if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     			}
 				if(sql.contains("Age")) {
     				if(head3 == 0) {
     					table3 += "Age"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Age")+"  ";
     			}
 				if(sql.contains("Salary")) {
     				if(head4 == 0) {
     					table4 += "Salary"+"\n";
     					head4++;
     				}
     				table4 += Select_Result.getString("Salary")+"  ";
     			}
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Staff_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Age"+"\n";
     					head3++;
     				}
     				if(head4 == 0) {
     					table4 += "Salary"+"\n";
     					head4++;
     				}
     				table += Select_Result.getString("Staff_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Age")+" ";
     				table4 += Select_Result.getString("Salary")+" ";
     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";
     			table4 += "\n";
 			}
 		}//
 		else if(sql.contains("Department")){
 			while(Select_Result.next()) {
 				if(sql.contains("Department_Name")) {
 					if(head1 == 0) {
     					table += "Department_Name"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Department_Name")+"  ";
 				}
 				if(sql.contains("Number_Of_People")) {
     				if(head2 == 0) {
     					table2 += "Number_Of_People"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Number_Of_People")+"  ";
     			}
 				if(sql.contains("Head_Of_Department")) {
     				if(head3 == 0) {
     					table3 += "Head_Of_Department"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Head_Of_Department")+"  ";
     			}
 
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Department_Name"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Number_Of_People"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Head_Of_Department"+"\n";
     					head3++;
     				}
     				
     				table += Select_Result.getString("Department_Name")+" ";
     				table2 += Select_Result.getString("Number_Of_People")+" ";
     				table3 += Select_Result.getString("Head_Of_Department")+" ";

     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";

 			}
 		}//
 		else if(sql.contains("Professor")){
 			while(Select_Result.next()) {
 				if(sql.contains("Teacher_Number")) {
 					if(head1 == 0) {
     					table += "Teacher_Number"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Teacher_Number")+"  ";
 				}
 				if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     			}
 				if(sql.contains("Teaching_Subject")) {
     				if(head3 == 0) {
     					table3 += "Teaching_Subject"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Teaching_Subject")+"  ";
     			}
 
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Teacher_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Teaching_Subject"+"\n";
     					head3++;
     				}
     				
     				table += Select_Result.getString("Teacher_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Teaching_Subject")+" ";

     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";

 			}
 		}//
 		else if(sql.contains("Activity")){
 			while(Select_Result.next()) {
 				if(sql.contains("Activity_Name")) {
 					if(head1 == 0) {
     					table += "Activity_Name"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Activity_Name")+"  ";
 				}
 				if(sql.contains("Activity_Date")) {
     				if(head2 == 0) {
     					table2 += "Activity_Date"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Activity_Date")+"  ";
     			}
 				if(sql.contains("Number_Of_People")) {
     				if(head3 == 0) {
     					table3 += "Number_Of_People"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Number_Of_People")+"  ";
     			}
 
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Activity_Name"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Activity_Date"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Number_Of_People"+"\n";
     					head3++;
     				}
     				
     				table += Select_Result.getString("Activity_Name")+" ";
     				table2 += Select_Result.getString("Activity_Date")+" ";
     				table3 += Select_Result.getString("Number_Of_People")+" ";

     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";

 			}
 		}//
     	//
     	//headlabel.setText(head);
     	textLabel1.setText(table);
     	textLabel2.setText(table2);
     	textLabel3.setText(table3);
     	textLabel4.setText(table4);
     }
     public void Delete_Press(ActionEvent e)throws SQLException{
    	 Statement statement = connection.createStatement();
    	 String query1 = delete1.getText();
     	 String query2 = delete2.getText();
     	 String query3 = delete3.getText();
     	 String query = "DELETE FROM " + query1 + " WHERE " + query2 + "='" + query3 + "';";
     	statement.executeUpdate(query);
     	System.out.println(query);
     	
     }
     
    public void Insert_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = insert1.getText();
    	String query2 = insert2.getText();
    	String query3 = insert3.getText();
    	String query4 = insert4.getText();
    	
    	String query = "INSERT INTO " + query1 + " Values('"+ query2 + "', '" + query3 + "', '" + query4 + "');";
    	statement.executeUpdate(query);
    }
    public void Update_Press(ActionEvent e)throws SQLException{
   	 Statement statement = connection.createStatement();
   	 	String query1 = update1.getText();
    	String query2 = update2.getText();
    	String query3 = update3.getText();
    	String query4 = update4.getText();
    	String query5 = update5.getText();
    	String query = "UPDATE " +query1+ " SET " +query2+ "='"+query3+"' WHERE " +query4+" = '"+query5+"';";
    	statement.executeUpdate(query);
    	System.out.println(query);
    }
    public void COUNT_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = count1.getText();
    	String query2 = count2.getText();
    	String query3 = count3.getText();
    	String query4 = count4.getText();
    	String query ="SELECT COUNT("+query1+") FROM "+query2+" WHERE "+query3+" = '"+query4+"';";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    public void SUM_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = sum1.getText();
    	String query2 = sum2.getText();
    	String query ="SELECT SUM("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    public void MAX_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = max1.getText();
    	String query2 = max2.getText();
    	String query ="SELECT MAX("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    public void MIN_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = min1.getText();
    	String query2 = min2.getText();
    	String query ="SELECT MIN("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    public void AVG_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = avg1.getText();
    	String query2 = avg2.getText();
    	String query ="SELECT AVG("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    public void EXIST_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = exist1.getText();
    	String query2 = exist2.getText();
    	String query3 = exist3.getText();
    	String query4 = exist4.getText();
    	String query5 = exist5.getText();
    	String query6 = exist6.getText();
    	String query7 = exist7.getText();
    	String query8 = exist8.getText();
    	String query ="SELECT "+query1+" FROM "+query2+" WHERE EXISTS (SELECT "+query3+" FROM "+query4+" WHERE "+query5+"."+query6+" = "+query7+"."+query8+");";
    	System.out.println(query);
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }
    
    public void NOTEXIST_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = exist1.getText();
    	String query2 = exist2.getText();
    	String query3 = exist3.getText();
    	String query4 = exist4.getText();
    	String query5 = exist5.getText();
    	String query6 = exist6.getText();
    	String query7 = exist7.getText();
    	String query8 = exist8.getText();
    	String query ="SELECT "+query1+" FROM "+query2+" WHERE NOT EXISTS (SELECT "+query3+" FROM "+query4+" WHERE "+query5+"."+query6+" = "+query7+"."+query8+");";
    	System.out.println(query);
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }
    public void IN_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = in1.getText();
    	String query2 = in2.getText();
    	String query3 = in3.getText();
    	String query4 = in4.getText();
    	String query5 = in5.getText();
    	String query6 = in6.getText();
    	String query7 = in7.getText();
    	String query ="SELECT "+query1+" FROM "+query2+" WHERE "+query3+" IN (SELECT "+query4+" FROM "+query5+" WHERE "+query6+"='"+query7+"');";
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }
    public void NOTIN_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = in1.getText();
    	String query2 = in2.getText();
    	String query3 = in3.getText();
    	String query4 = in4.getText();
    	String query5 = in5.getText();
    	String query6 = in6.getText();
    	String query7 = in7.getText();
    	String query ="SELECT "+query1+" FROM "+query2+" WHERE "+query3+" NOT IN (SELECT "+query4+" FROM "+query5+" WHERE "+query6+"='"+query7+"');";
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }
	public void HAVING_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = in1.getText();
    	String query2 = in2.getText();
    	String query3 = in3.getText();
    	String query4 = in4.getText();
    	String query5 = in5.getText();
    	String query6 = in6.getText();
    	String query ="SELECT "+query1+" FROM "+query2+" WHERE "+query3+" GROUP BY "+query4+" HAVING "+query5+" ORDER BY "+query6+";";
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }

	public void BETWEEN_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = in1.getText();
    	String query2 = in2.getText();
    	String query3 = in3.getText();
    	String query4 = in4.getText();
    	String query5 = in5.getText();
    	String query ="SELECT "+query1+" FROM "+query2+" WHERE "+query3+" BETWEEN "+query4+" AND "+query5";";
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }

	public void Aliases_Press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = in1.getText();
    	String query2 = in2.getText();
    	String query3 = in3.getText();
    	String query ="SELECT "+query1+" AS "+query2+" FROM "+query3+";";
    	int replace = 0;
 		String s = "";
 		ResultSet Select_Result = statement.executeQuery(query);
 		while(Select_Result.next()) {
 			if(replace == 0) {
 				s += "Student_Number\n";
 				replace++;
 			}
 			s += Select_Result.getString("Student_Number") + "\n";
 		}
 		textLabel6.setText(s);
    }
     
     //for query
	public void Query_Press(ActionEvent e) throws SQLException{

		Statement statement = connection.createStatement();
	
	 try {
		 String query = Query_input.getText();
		 System.out.println(query);
     	 String sql = query;
     	 //basic
     	 if(sql.contains("DELETE")) {
     		statement.executeUpdate(sql);
     	 }
     	 else if(sql.contains("INSERT")) {
     		statement.executeUpdate(sql);
     	 }
     	else if(sql.contains("UPDATE")) {
     		statement.executeUpdate(sql);
     	 }
     	 //complex
     	 else if(sql.contains("COUNT")) {

     		System.out.println("count");
     		ResultSet Select_Result = statement.executeQuery(sql);
     		Select_Result.next();
     		int number = Select_Result.getInt(1);
     		String s=Integer.toString(number);
     		textLabel5.setText(s);
     	 }
     	 else if(sql.contains("SUM")) {
     		ResultSet Select_Result = statement.executeQuery(sql);
     		Select_Result.next();
     		int number = Select_Result.getInt(1);
     		String s=Integer.toString(number);
     		textLabel5.setText(s);

     	 }
     	 else if(sql.contains("AVG")) {
     		
     		ResultSet Select_Result = statement.executeQuery(sql);
     		Select_Result.next();
     		int number = Select_Result.getInt(1);
     		String s=Integer.toString(number);
     		textLabel5.setText(s);
     	 }
     	 else if(sql.contains("MAX")) {
     		ResultSet Select_Result = statement.executeQuery(sql);
     		Select_Result.next();
     		int number = Select_Result.getInt(1);
     		String s=Integer.toString(number);
     		textLabel5.setText(s);
     	 }
     	else if(sql.contains("MIN")) {
     		ResultSet Select_Result = statement.executeQuery(sql);
     		Select_Result.next();
     		int number = Select_Result.getInt(1);
     		String s=Integer.toString(number);
     		textLabel5.setText(s);
     	}
     	else if(sql.contains("IN")) {
     		int replace = 0;
     		String s = "";
     		ResultSet Select_Result = statement.executeQuery(sql);
     		while(Select_Result.next()) {
     			if(replace == 0) {
     				s += "Student_Number\n";
     				replace++;
     			}
     			s += Select_Result.getString("Student_Number") + "\n";
     		}
     		textLabel6.setText(s);
     	}

     	else if(sql.contains("EXIST")) {
     		int replace = 0;
     		String s = "";
     		ResultSet Select_Result = statement.executeQuery(sql);
     		while(Select_Result.next()) {
     			if(replace == 0) {
     				s += "Student_Number\n";
     				replace++;
     			}
     			s += Select_Result.getString("Student_Number") + "\n";
     		}
     		textLabel6.setText(s);
     	}

     	else if(sql.contains("HAVING")) {
     		int replace = 0;
     		String s = "";
     		ResultSet Select_Result = statement.executeQuery(sql);
     		while(Select_Result.next()) {
     			if(replace == 0) {
     				s += "Student_Number\n";
     				replace++;
     			}
     			s += Select_Result.getString("Student_Number") + "\n";
     		}
     		textLabel6.setText(s);
     	}

		else if(sql.contains("BETWEEN")) {
     		int replace = 0;
     		String s = "";
     		ResultSet Select_Result = statement.executeQuery(sql);
     		while(Select_Result.next()) {
     			if(replace == 0) {
     				s += "Student_Number\n";
     				replace++;
     			}
     			s += Select_Result.getString("Student_Number") + "\n";
     		}
     		textLabel6.setText(s);
     	}
		
		else if(sql.contains("ALIASES")) {
     		int replace = 0;
     		String s = "";
     		ResultSet Select_Result = statement.executeQuery(sql);
     		while(Select_Result.next()) {
     			if(replace == 0) {
     				s += "Student_Number\n";
     				replace++;
     			}
     			s += Select_Result.getString("Student_Number") + "\n";
     		}
     		textLabel6.setText(s);
     	}

     	 else if(sql.substring(0,1).equals("S")) {
     		 System.out.println("Select");
     		int head1 = 0, head2 = 0, head3 = 0, head4 = 0;
     		 table = "";
     	   	 table2 = "";
     	   	 table3 = "";
     	   	 table4 = "" ;
     		ResultSet Select_Result = statement.executeQuery(sql);

     		if(sql.contains("Student")) {
     			
     		while(Select_Result.next()) {   			
     			if(sql.contains("Student_Number")) {
     				if(head1 == 0) {
     					table += "Student_Number"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Student_Number")+"  ";				
     			}
     			if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     				}
     			if(sql.contains("Double_Major")) {
     				if(head3 == 0) {
     					table3 += "Double_Major"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Double_Major")+"  ";
     			}
     			if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Student_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Double_Major"+"\n";
     					head3++;
     				}
     				table += Select_Result.getString("Student_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Double_Major")+" ";
     			
     			}
     			table += "\n";
     			table2 += "\n";
     			table3 += "\n";
     			System.out.println();
     		}
     		}
     		else if(sql.contains("Staff")){
     			while(Select_Result.next()) {
     				if(sql.contains("Staff_Number")) {
     					if(head1 == 0) {
         					table += "Staff_Number"+"\n";
         					head1++;
         				}
                            table += Select_Result.getString("Staff_Number")+"  ";
     				}
     				if(sql.contains("Department_Name")) {
         				if(head2 == 0) {
         					table2 += "Department_Name"+"\n";
         					head2++;
         				}
         					table2 += Select_Result.getString("Department_Name")+"  ";
         			}
     				if(sql.contains("Age")) {
         				if(head3 == 0) {
         					table3 += "Age"+"\n";
         					head3++;
         				}
         					table3 += Select_Result.getString("Age")+"  ";
         			}
     				if(sql.contains("Salary")) {
         				if(head4 == 0) {
         					table4 += "Salary"+"\n";
         					head4++;
         				}
         				table4 += Select_Result.getString("Salary")+"  ";
         			}
     				if(sql.contains("*")) {
         				if(head1 == 0) {
         					table += "Staff_Number"+"\n";
         					head1++;
         				}
         				if(head2 == 0) {
         					table2 += "Department_Name"+"\n";
         					head2++;
         				}
         				if(head3 == 0) {
         					table3 += "Age"+"\n";
         					head3++;
         				}
         				if(head4 == 0) {
         					table4 += "Salary"+"\n";
         					head4++;
         				}
         				table += Select_Result.getString("Staff_Number")+" ";
         				table2 += Select_Result.getString("Department_Name")+" ";
         				table3 += Select_Result.getString("Age")+" ";
         				table4 += Select_Result.getString("Salary")+" ";
         			}
     				table += "\n";
         			table2 += "\n";
         			table3 += "\n";
         			table4 += "\n";
     			}
     		}//
     		else if(sql.contains("Department")){
     			while(Select_Result.next()) {
     				if(sql.contains("Department_Name")) {
     					if(head1 == 0) {
         					table += "Department_Name"+"\n";
         					head1++;
         				}
                            table += Select_Result.getString("Department_Name")+"  ";
     				}
     				if(sql.contains("Number_Of_People")) {
         				if(head2 == 0) {
         					table2 += "Number_Of_People"+"\n";
         					head2++;
         				}
         					table2 += Select_Result.getString("Number_Of_People")+"  ";
         			}
     				if(sql.contains("Head_Of_Department")) {
         				if(head3 == 0) {
         					table3 += "Head_Of_Department"+"\n";
         					head3++;
         				}
         					table3 += Select_Result.getString("Head_Of_Department")+"  ";
         			}
     
     				if(sql.contains("*")) {
         				if(head1 == 0) {
         					table += "Department_Name"+"\n";
         					head1++;
         				}
         				if(head2 == 0) {
         					table2 += "Number_Of_People"+"\n";
         					head2++;
         				}
         				if(head3 == 0) {
         					table3 += "Head_Of_Department"+"\n";
         					head3++;
         				}
         				
         				table += Select_Result.getString("Department_Name")+" ";
         				table2 += Select_Result.getString("Number_Of_People")+" ";
         				table3 += Select_Result.getString("Head_Of_Department")+" ";

         			}
     				table += "\n";
         			table2 += "\n";
         			table3 += "\n";

     			}
     		}//
     		else if(sql.contains("Professor")){
     			while(Select_Result.next()) {
     				if(sql.contains("Teacher_Number")) {
     					if(head1 == 0) {
         					table += "Teacher_Number"+"\n";
         					head1++;
         				}
                            table += Select_Result.getString("Teacher_Number")+"  ";
     				}
     				if(sql.contains("Department_Name")) {
         				if(head2 == 0) {
         					table2 += "Department_Name"+"\n";
         					head2++;
         				}
         					table2 += Select_Result.getString("Department_Name")+"  ";
         			}
     				if(sql.contains("Teaching_Subject")) {
         				if(head3 == 0) {
         					table3 += "Teaching_Subject"+"\n";
         					head3++;
         				}
         					table3 += Select_Result.getString("Teaching_Subject")+"  ";
         			}
     
     				if(sql.contains("*")) {
         				if(head1 == 0) {
         					table += "Teacher_Number"+"\n";
         					head1++;
         				}
         				if(head2 == 0) {
         					table2 += "Department_Name"+"\n";
         					head2++;
         				}
         				if(head3 == 0) {
         					table3 += "Teaching_Subject"+"\n";
         					head3++;
         				}
         				
         				table += Select_Result.getString("Teacher_Number")+" ";
         				table2 += Select_Result.getString("Department_Name")+" ";
         				table3 += Select_Result.getString("Teaching_Subject")+" ";

         			}
     				table += "\n";
         			table2 += "\n";
         			table3 += "\n";

     			}
     		}//
     		else if(sql.contains("Activity")){
     			while(Select_Result.next()) {
     				if(sql.contains("Activity_Name")) {
     					if(head1 == 0) {
         					table += "Activity_Name"+"\n";
         					head1++;
         				}
                            table += Select_Result.getString("Activity_Name")+"  ";
     				}
     				if(sql.contains("Activity_Date")) {
         				if(head2 == 0) {
         					table2 += "Activity_Date"+"\n";
         					head2++;
         				}
         					table2 += Select_Result.getString("Activity_Date")+"  ";
         			}
     				if(sql.contains("Number_Of_People")) {
         				if(head3 == 0) {
         					table3 += "Number_Of_People"+"\n";
         					head3++;
         				}
         					table3 += Select_Result.getString("Number_Of_People")+"  ";
         			}
     
     				if(sql.contains("*")) {
         				if(head1 == 0) {
         					table += "Activity_Name"+"\n";
         					head1++;
         				}
         				if(head2 == 0) {
         					table2 += "Activity_Date"+"\n";
         					head2++;
         				}
         				if(head3 == 0) {
         					table3 += "Number_Of_People"+"\n";
         					head3++;
         				}
         				
         				table += Select_Result.getString("Activity_Name")+" ";
         				table2 += Select_Result.getString("Activity_Date")+" ";
         				table3 += Select_Result.getString("Number_Of_People")+" ";

         			}
     				table += "\n";
         			table2 += "\n";
         			table3 += "\n";

     			}
     		}//
     	 }
     	 else {
     		 System.out.println("other");
      		//statement.executeUpdate(sql);		
     	 }
     	textLabel1.setText(table);
     	textLabel2.setText(table2);
     	textLabel3.setText(table3);
     	textLabel4.setText(table4);
     } catch (SQLException e1) {	 
         e1.printStackTrace();
     }
	}
}

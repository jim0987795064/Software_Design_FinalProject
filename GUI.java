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
	public TextField count1, count2, count3, count4, sum1, sum2, max1, max2, min1, min2, avg1, avg2;
	//in/exist
	public TextField exist1, exist2, exist3, exist4, exist5, exist6, exist7, exist8, in1, in2, in3, in4, in5, in6, in7;
    public Label textLabel1, textLabel2, textLabel3, textLabel4, textLabel5, textLabel6;
	//Text text = new Text();
	String table = "", table2 = "" ,table3 = "", table4 ="";

	
	
	DBController con =new DBController();
	Command select = new Select();
	Command delete = new Delete();
	Command insert = new Insert();
	Command update = new Update();
	Command count = new Count();
	Command sum = new Sum();
	Command max = new Max();
	Command min = new Min();
	Command avg = new Avg();
	Command exist = new Exist();
	Command nonExist = new NonExist();
	Command in = new In();
	Command notIn = new NotIn();
	Command having = new Having();
	Command between = new Between();
	Command aliases = new Aliases();
	Command query = new Query();


     Connection connection = con.DBConnection();
     boolean column = true;
    //for buttion
    public void Select_Press(ActionEvent e)throws SQLException{
		String query1 = select1.getText();
     	String query2 = select2.getText();
		select.get(query1, query2);
		select.press();
	}

	public void Delete_Press(ActionEvent e)throws SQLException{
		String query1 = delete1.getText();
     	String query2 = delete2.getText();
		String query3 = delete3.getText();
		delete.get(query1, query2);
		delete.press();
	}

	public void Insert_Press(ActionEvent e)throws SQLException{
		//not complete
		String query1 = insert1.getText();
     	String query2 = insert2.getText();
		String query3 = insert3.getText();
		String query4 = insert4.getText();
		insert.get(query1, query2, query3, query4);
		insert.press();
	}

    public void Update_Press(ActionEvent e)throws SQLException{
   	 	String query1 = update1.getText();
     	String query2 = update2.getText();
		String query3 = update3.getText();
		String query4 = update4.getText();
		String query5 = update5.getText();
		update.get(query1, query2, query3, query4, query5);
		update.press();
    }
    public void COUNT_Press(ActionEvent e)throws SQLException{
    	String query1 = count1.getText();
     	String query2 = count2.getText();
		String query3 = count3.getText();
		String query4 = count4.getText();
		count.get(query1, query2, query3, query4);
		count.press();
    }
    public void SUM_Press(ActionEvent e)throws SQLException{

    	String query1 = sum1.getText();
     	String query2 = sum2.getText();
		sum.get(query1, query2);
		sum.press();
    }
    public void MAX_Press(ActionEvent e)throws SQLException{
    	String query1 = max1.getText();
     	String query2 = max2.getText();
		max.get(query1, query2);
		max.press();
    }
    public void MIN_Press(ActionEvent e)throws SQLException{
    	String query1 = min1.getText();
     	String query2 = min2.getText();
		min.get(query1, query2);
		min.press();
    }

    public void AVG_Press(ActionEvent e)throws SQLException{
    	String query1 = avg1.getText();
     	String query2 = avg2.getText();
		avg.get(query1, query2);
		avg.press();
    }
    public void EXIST_Press(ActionEvent e)throws SQLException{
    	String query1 = exist1.getText();
     	String query2 = exist2.getText();
		String query3 = exist3.getText();
		String query4 = exist4.getText();
     	String query5 = exist5.getText();
		String query6 = exist6.getText();
		String query7 = exist7.getText();
     	String query8 = exist8.getText();

		exist.get(query1, query2, query3, query4, query5, query6, query7, query8);
		exist.press();
    }
    
    public void NOTEXIST_Press(ActionEvent e)throws SQLException{
    	String query1 = exist1.getText();
     	String query2 = exist2.getText();
		String query3 = exist3.getText();
		String query4 = exist4.getText();
     	String query5 = exist5.getText();
		String query6 = exist6.getText();
		String query7 = exist7.getText();
     	String query8 = exist8.getText();

		nonExist.get(query1, query2, query3, query4, query5, query6, query7, query8);
		nonExist.press();
    }
    public void IN_Press(ActionEvent e)throws SQLException{

    	String query1 = in1.getText();
     	String query2 = in2.getText();
		String query3 = in3.getText();
		String query4 = in4.getText();
     	String query5 = in5.getText();
		String query6 = in6.getText();
		String query7 = in7.getText();

		in.get(query1, query2, query3, query4, query5, query6, query7);
		in.press();
    }
    public void NOTIN_Press(ActionEvent e)throws SQLException{
    	String query1 = in1.getText();
     	String query2 = in2.getText();
		String query3 = in3.getText();
		String query4 = in4.getText();
     	String query5 = in5.getText();
		String query6 = in6.getText();
		String query7 = in7.getText();

		notIn.get(query1, query2, query3, query4, query5, query6, query7);
		notIn.press();
    }
     
    //for query
	public void Query_Press(ActionEvent e) throws SQLException{
		
		query.press();	
	}
}

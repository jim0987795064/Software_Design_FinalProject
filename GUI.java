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
		Command select = new Select();
		select.press();
	}

	public void Delete_Press(ActionEvent e)throws SQLException{
		Command delete = new Delete();
		delete.press();
	}

	public void Insert_Press(ActionEvent e)throws SQLException{
		Command insert = new Insert();
		delete.press();
	}

    public void Update_Press(ActionEvent e)throws SQLException{
   	 	Command update = new Update();
		update.press();
    }
    public void COUNT_Press(ActionEvent e)throws SQLException{
    	Command count = new Count();
		count.press();
    }
    public void SUM_Press(ActionEvent e)throws SQLException{
    	Command sum = new Sum();
		sum.press();
    }
    public void MAX_Press(ActionEvent e)throws SQLException{
    	Command max = new Max();
		max.press();
    }
    public void MIN_Press(ActionEvent e)throws SQLException{
    	Command min = new Min();
		min.press();
    }

    public void AVG_Press(ActionEvent e)throws SQLException{
    	Command avg = new Avg();
		avg.press();
    }
    public void EXIST_Press(ActionEvent e)throws SQLException{
    	Command exist = new Exist();
		exist.press();
    }
    
    public void NOTEXIST_Press(ActionEvent e)throws SQLException{
    	Command nonExist = new NonExist();
		nonExist.press();
    }
    public void IN_Press(ActionEvent e)throws SQLException{
    	Command in = new In();
		in.press();
    }
    public void NOTIN_Press(ActionEvent e)throws SQLException{
    	Command notIn = new NotIn();
		notIn.press();
    }
	public void HAVING_Press(ActionEvent e)throws SQLException{
    	Command having = new Having();
		having.press();
    }

	public void BETWEEN_Press(ActionEvent e)throws SQLException{
    	Command between = new Between();
		between.press();
    }

	public void Aliases_Press(ActionEvent e)throws SQLException{
    	Command aliases = new Aliases();
		aliases.press();
    }
     
    //for query
	public void Query_Press(ActionEvent e) throws SQLException{
		Command query = new Query();
		query.press();	
	}
}

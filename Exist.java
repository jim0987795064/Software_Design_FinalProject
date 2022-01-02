public class Exist implements Command{

    public void press(){
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
    
}
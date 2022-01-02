public class Having implements Command{

    public void press(){
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
}
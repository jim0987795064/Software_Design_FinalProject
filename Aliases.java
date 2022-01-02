public class Between implements Command{

    public void press(){
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
}
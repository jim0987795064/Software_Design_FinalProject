public class NotIn implements Command{

	public String query1, query2, query3, query4, query5, query6, query7;

	public void get(String input1, String input2, String input3, String input4, String input5, String input6, String input7){
		query1 = input1;
		query2 = input2;
		query3 = input3;
		query4 = input4;
		query5 = input5;
		query6 = input6;
		query7 = input7;
	}

    public void press(){
        Statement statement = connection.createStatement();
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

}
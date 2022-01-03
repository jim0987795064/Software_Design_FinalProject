public class Insert implements Command{

	private String query1, query2, query3, query4;

	//get function can access user input
	public void get(String input1, String input2, String input3, String input4){
		query1 = input1;
		query2 = input2;
		query3 = input3;
		query4 = input4;
	}

	//press function can update Database with user input
    public void press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query = "INSERT INTO " + query1 + " Values('"+ query2 + "', '" + query3 + "', '" + query4 + "');";
    	statement.executeUpdate(query);
    }
}
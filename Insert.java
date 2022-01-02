public class Insert implements Command{
    public void press(ActionEvent e)throws SQLException{
    	Statement statement = connection.createStatement();
    	String query1 = insert1.getText();
    	String query2 = insert2.getText();
    	String query3 = insert3.getText();
    	String query4 = insert4.getText();
    	
    	String query = "INSERT INTO " + query1 + " Values('"+ query2 + "', '" + query3 + "', '" + query4 + "');";
    	statement.executeUpdate(query);
    }
}
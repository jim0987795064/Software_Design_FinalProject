public class Delete implements Command{

	private String query1, query2, query3;

	//get function can access user input
	public void get(String input1, String input2, String input3){
		query1 = input1;
		query2 = input2;
		query3 = input3;
	}

	//press function can update Database with user input
	public void press(){
    	Statement statement = connection.createStatement();
     	String query = "DELETE FROM " + query1 + " WHERE " + query2 + "='" + query3 + "';";
     	statement.executeUpdate(query);
     	System.out.println(query);
     	
     }

}

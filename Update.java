
public class Update implements Command{

	private String query1, query2, query3, query4, query5;

	//get function can access user input
	public void get(String input1, String input2, String input3, String input4, String input5){
		query1 = input1;
		query2 = input2;
		query3 = input3;
		query4 = input4;
		query5 = input5;
	}


	//press function can update Database with user input
    public void press(){ 
        Statement statement = connection.createStatement();
    	String query = "UPDATE " +query1+ " SET " +query2+ "='"+query3+"' WHERE " +query4+" = '"+query5+"';";
    	statement.executeUpdate(query);
    	System.out.println(query);
    }

}
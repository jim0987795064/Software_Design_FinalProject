public class Avg implements Command{

	private String query1, query2;

	//get function can access user input
	public void get(String input1, String input2){
		query1 = input1;
		query2 = input2;
	}
	
	//press function can update Database with user input
    public void press(){

        Statement statement = connection.createStatement();
    	String query ="SELECT AVG("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);

    }
}
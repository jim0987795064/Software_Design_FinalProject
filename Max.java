public class Max implements Command{

	private String query1, query2;

	public void get(String input1, String input2){
		query1 = input1;
		query2 = input2;
	}

    public void press(){

        Statement statement = connection.createStatement();
    	String query ="SELECT MAX("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);

    }
}
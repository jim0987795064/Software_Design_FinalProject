public class Count implements Command{

	private String query1, query2, query3, query4;

	public void get(String input1, String input2, String input3, String input4){
		query1 = input1;
		query2 = input2;
		query3 = input3;
		query4 = input4;
	}


    public void press(){
        Statement statement = connection.createStatement();
    	String query ="SELECT COUNT("+query1+") FROM "+query2+" WHERE "+query3+" = '"+query4+"';";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    
}
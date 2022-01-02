public class Count implements Command{
    public void press(){
        Statement statement = connection.createStatement();
    	String query1 = count1.getText();
    	String query2 = count2.getText();
    	String query3 = count3.getText();
    	String query4 = count4.getText();
    	String query ="SELECT COUNT("+query1+") FROM "+query2+" WHERE "+query3+" = '"+query4+"';";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);
    }
    
}
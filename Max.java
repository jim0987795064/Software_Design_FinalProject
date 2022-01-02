public class Max implements Command{

    public void press(){

        Statement statement = connection.createStatement();
    	String query1 = max1.getText();
    	String query2 = max2.getText();
    	String query ="SELECT MAX("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);

    }
}
public class Avg implements Command{

    public void press(){

        Statement statement = connection.createStatement();
    	String query1 = avg1.getText();
    	String query2 = avg2.getText();
    	String query ="SELECT AVG("+query1+") FROM "+query2+";";
    	ResultSet Select_Result = statement.executeQuery(query);
 		Select_Result.next();
 		int number = Select_Result.getInt(1);
 		String s=Integer.toString(number);
 		textLabel5.setText(s);

    }
}
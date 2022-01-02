
public class Update implements Command{
    public void press(){ 
        Statement statement = connection.createStatement();
   	 	String query1 = update1.getText();
    	String query2 = update2.getText();
    	String query3 = update3.getText();
    	String query4 = update4.getText();
    	String query5 = update5.getText();
    	String query = "UPDATE " +query1+ " SET " +query2+ "='"+query3+"' WHERE " +query4+" = '"+query5+"';";
    	statement.executeUpdate(query);
    	System.out.println(query);
    }

}
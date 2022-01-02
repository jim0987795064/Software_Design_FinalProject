public class Delete implements Command{

public void press(){
    	 Statement statement = connection.createStatement();
    	 String query1 = delete1.getText();
     	 String query2 = delete2.getText();
     	 String query3 = delete3.getText();
     	 String query = "DELETE FROM " + query1 + " WHERE " + query2 + "='" + query3 + "';";
     	statement.executeUpdate(query);
     	System.out.println(query);
     	
     }

}
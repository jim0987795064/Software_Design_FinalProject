
public class Select implements Command{

	private String query1, query2;

	public void get(String input1, String input2){
		query1 = input1;
		query2 = input2;

	}

    public void press(){
		
		

    	String head = "";
    	int head1 = 0, head2=0, head3=0, head4 = 0;
    	table = "";
    	table2 = "";
    	table3 = "";
    	table4 = "";
    	Statement statement = connection.createStatement();
     	String query = "SELECT " + query1 + " FROM "+ query2;
     	String sql = query;
     	ResultSet Select_Result = statement.executeQuery(sql);
     	//System.out.println(sql);
     	if(sql.contains("Student")) {
 			
     		while(Select_Result.next()) {   			
     			if(sql.contains("Student_Number")) {
     				if(head1 == 0) {
     					table += "Student_Number"+"\n";
     					head1++;
     				}
     					
                        table += Select_Result.getString("Student_Number")+"  ";				
     			}
     			if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     				}
     			if(sql.contains("Double_Major")) {
     				if(head3 == 0) {
     					table3 += "Double_Major"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Double_Major")+"  ";
     			}
     			if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Student_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Double_Major"+"\n";
     					head3++;
     				}
     				table += Select_Result.getString("Student_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Double_Major")+" ";
     			
     			
     			}
     			table += "\n";
     			table2 += "\n";
     			table3 += "\n";
     			System.out.println();
     		}
     		}
     	//
     	else if(sql.contains("Staff")){
 			while(Select_Result.next()) {
 				if(sql.contains("Staff_Number")) {
 					if(head1 == 0) {
     					table += "Staff_Number"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Staff_Number")+"  ";
 				}
 				if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     			}
 				if(sql.contains("Age")) {
     				if(head3 == 0) {
     					table3 += "Age"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Age")+"  ";
     			}
 				if(sql.contains("Salary")) {
     				if(head4 == 0) {
     					table4 += "Salary"+"\n";
     					head4++;
     				}
     				table4 += Select_Result.getString("Salary")+"  ";
     			}
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Staff_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Age"+"\n";
     					head3++;
     				}
     				if(head4 == 0) {
     					table4 += "Salary"+"\n";
     					head4++;
     				}
     				table += Select_Result.getString("Staff_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Age")+" ";
     				table4 += Select_Result.getString("Salary")+" ";
     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";
     			table4 += "\n";
 			}
 		}//
 		else if(sql.contains("Department")){
 			while(Select_Result.next()) {
 				if(sql.contains("Department_Name")) {
 					if(head1 == 0) {
     					table += "Department_Name"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Department_Name")+"  ";
 				}
 				if(sql.contains("Number_Of_People")) {
     				if(head2 == 0) {
     					table2 += "Number_Of_People"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Number_Of_People")+"  ";
     			}
 				if(sql.contains("Head_Of_Department")) {
     				if(head3 == 0) {
     					table3 += "Head_Of_Department"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Head_Of_Department")+"  ";
     			}
 
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Department_Name"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Number_Of_People"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Head_Of_Department"+"\n";
     					head3++;
     				}
     				
     				table += Select_Result.getString("Department_Name")+" ";
     				table2 += Select_Result.getString("Number_Of_People")+" ";
     				table3 += Select_Result.getString("Head_Of_Department")+" ";

     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";

 			}
 		}//
 		else if(sql.contains("Professor")){
 			while(Select_Result.next()) {
 				if(sql.contains("Teacher_Number")) {
 					if(head1 == 0) {
     					table += "Teacher_Number"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Teacher_Number")+"  ";
 				}
 				if(sql.contains("Department_Name")) {
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Department_Name")+"  ";
     			}
 				if(sql.contains("Teaching_Subject")) {
     				if(head3 == 0) {
     					table3 += "Teaching_Subject"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Teaching_Subject")+"  ";
     			}
 
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Teacher_Number"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Department_Name"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Teaching_Subject"+"\n";
     					head3++;
     				}
     				
     				table += Select_Result.getString("Teacher_Number")+" ";
     				table2 += Select_Result.getString("Department_Name")+" ";
     				table3 += Select_Result.getString("Teaching_Subject")+" ";

     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";

 			}
 		}//
 		else if(sql.contains("Activity")){
 			while(Select_Result.next()) {
 				if(sql.contains("Activity_Name")) {
 					if(head1 == 0) {
     					table += "Activity_Name"+"\n";
     					head1++;
     				}
                        table += Select_Result.getString("Activity_Name")+"  ";
 				}
 				if(sql.contains("Activity_Date")) {
     				if(head2 == 0) {
     					table2 += "Activity_Date"+"\n";
     					head2++;
     				}
     					table2 += Select_Result.getString("Activity_Date")+"  ";
     			}
 				if(sql.contains("Number_Of_People")) {
     				if(head3 == 0) {
     					table3 += "Number_Of_People"+"\n";
     					head3++;
     				}
     					table3 += Select_Result.getString("Number_Of_People")+"  ";
     			}
 
 				if(sql.contains("*")) {
     				if(head1 == 0) {
     					table += "Activity_Name"+"\n";
     					head1++;
     				}
     				if(head2 == 0) {
     					table2 += "Activity_Date"+"\n";
     					head2++;
     				}
     				if(head3 == 0) {
     					table3 += "Number_Of_People"+"\n";
     					head3++;
     				}
     				
     				table += Select_Result.getString("Activity_Name")+" ";
     				table2 += Select_Result.getString("Activity_Date")+" ";
     				table3 += Select_Result.getString("Number_Of_People")+" ";

     			}
 				table += "\n";
     			table2 += "\n";
     			table3 += "\n";

 			}
 		}//
     	//
     	//headlabel.setText(head);
     	textLabel1.setText(table);
     	textLabel2.setText(table2);
     	textLabel3.setText(table3);
     	textLabel4.setText(table4);
     }
}
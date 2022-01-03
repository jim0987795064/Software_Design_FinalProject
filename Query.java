public class Query implements Command{

    private string query = "";
	private String table = "", table2 = "" ,table3 = "", table4 ="";


    public void get(String input){
        query = input;
    }

	public void InExist(String sql){
		int replace = 0;
     	String s = "";
     	ResultSet Select_Result = statement.executeQuery(sql);
     	while(Select_Result.next()) {
     		if(replace == 0) {
     			s += "Student_Number\n";
     			replace++;
     		}
     		s += Select_Result.getString("Student_Number") + "\n";
     	}
     	textLabel6.setText(s);
	}
	

	public void Calculate(String sql){
		ResultSet Select_Result = statement.executeQuery(sql);
     	Select_Result.next();
     	int number = Select_Result.getInt(1);
     	String s = Integer.toString(number);
     	textLabel5.setText(s);
	}

    public void press(){
        Statement statement = connection.createStatement();
	
	 try {
     	 String sql = query;
     	 //basic
     	 if(sql.contains("DELETE")) {
     		statement.executeUpdate(sql);
     	 }
     	 else if(sql.contains("INSERT")) {
     		statement.executeUpdate(sql);
     	 }
     	else if(sql.contains("UPDATE")) {
     		statement.executeUpdate(sql);
     	 }
     	 
     	else if(sql.contains("COUNT")) {
     		Calculate(sql);
     	}
     	else if(sql.contains("SUM")) {
     		Calculate(sql);
     	}
     	else if(sql.contains("AVG")) {
     		Calculate(sql);
     	}
     	else if(sql.contains("MAX")) {
     		Calculate(sql);
     	}
     	else if(sql.contains("MIN")) {
     		Calculate(sql);
     	}
     	else if(sql.contains("IN")) {
     		InExist(sql);
     	}

     	else if(sql.contains("EXIST")) {
     		InExist(sql);
     	}

		//Select Command
     	else if(sql.substring(0,1).equals("S")) {
     		 System.out.println("Select");
     		int head1 = 0, head2 = 0, head3 = 0, head4 = 0;
     		 table = "";
     	   	 table2 = "";
     	   	 table3 = "";
     	   	 table4 = "" ;
     		ResultSet Select_Result = statement.executeQuery(sql);

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
     		}
     	 }
     	 else {
     		 System.out.println("other");
      		//statement.executeUpdate(sql);		
     	 }
     	textLabel1.setText(table);
     	textLabel2.setText(table2);
     	textLabel3.setText(table3);
     	textLabel4.setText(table4);
     } catch (SQLException e1) {	 
         e1.printStackTrace();
     }
    }
}
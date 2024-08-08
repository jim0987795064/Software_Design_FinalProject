![image](https://github.com/user-attachments/assets/e245c4f8-f818-4f1b-bf46-630b7b32064c)![image](https://github.com/user-attachments/assets/45d81a10-e882-4836-86a2-eb0fb600f94c)# Implement database of personnel department in school

## Use Mysql to build a relational database system 
![image](https://github.com/user-attachments/assets/bfe6f319-00b6-49bd-b7fe-da7fd1d2677d)

## Use JavaFx to build the following GUI 
The following GUI interface is used to perform SQL commands on the Database
![image](https://github.com/user-attachments/assets/a86adcc4-0cf4-43dc-8371-5c1d0ca7c199)

## Original Class Diagram
Initially, there were three classes: Main, DatabaseController, and GUI. The SQL instruction code was placed within the GUI class, resulting in the GUI class becoming about 1000 lines long. Consequently, adding or modifying SQL instructions became very difficult.
![image](https://github.com/user-attachments/assets/0756daba-3253-40a6-8dfd-346605f9bf8b)


## Modified Class Diagram
After refactoring, the SQL command code was moved out of the GUI class. Subsequently, adding a SQL command only requires creating a new class to implement the Command.
![image](https://github.com/user-attachments/assets/3ad59b86-a9ea-485b-bb36-7ae12d95c3ff)


## Use Strategy Pattern
"Problem": The GUI class had approximately 1000 lines of code, making it difficult to add or remove functionality.

Solution: Introduce an interface Command and extract the SQL code into separate classes, each implementing the Command interface.

Result: The GUI class was reduced to 200 lines of code. Now, adding a new SQL command only requires creating a new class to implement the Command interface.

![image](https://github.com/user-attachments/assets/722ed020-6223-4649-b82e-550189e8f915)

## Example

Original Implementation: The Delete and Insert commands were initially implemented using the Delete_Press and Insert_Press functions, respectively.

Solution: These commands were refactored by introducing an interface Command, and each SQL operation was extracted into separate classes that implement the Command interface.

Result: The refactoring reduced the GUI class to 200 lines of code. Now, adding a new SQL command only requires creating a new class to implement the Command interface.
![image](https://github.com/user-attachments/assets/58640622-821d-4215-b684-80b32924ebbb)


Handling User Input: The press() function is used to process user input SQL commands and outputs the results to the database.

SQL Command Structure: Each SQL command is encapsulated in its own class, which implements the Command interface.
![image](https://github.com/user-attachments/assets/bf1088b4-b156-4f05-bd43-03ee8c30915f)
![image](https://github.com/user-attachments/assets/68c0dd30-fbfc-4e63-9e95-834c7b7ea27c)

![image](https://github.com/user-attachments/assets/76d844f2-3060-4f13-9936-ffb0bb50fe57)





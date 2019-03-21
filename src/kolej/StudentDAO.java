package kolej;

//import java.text.*;
//import java.util.*;
import java.sql.*;

import kolej.ConnectionManager;
import kolej.StudentBean;
//import ExamplePackage.RegisterServlet;

public class StudentDAO 	
{	
   public String registerStudent(StudentBean studentBean) {	    
	
      String studName = studentBean.getStudName();    
      String icNum = studentBean.getICNum(); 
      String matrixID = studentBean.getMatrixID(); 
      String contactNum = studentBean.getContactNum();
      String email = studentBean.getEmail();
      String course = studentBean.getCourse();
	    
      Connection currentCon = null;
      PreparedStatement preparedStatement = null;
      String insertQuery =
            "insert into student (No,studName, icNum, matrixID, contactNum, email, course)"
            + " values (Null, ?, ?, ?, ?, ?, ?)";  
	    
   // "System.out.println" prints in the console; Normally used to trace the process
   System.out.println("Name of new student " + studName);          
   System.out.println("Ic Number for New Student " + icNum);
   System.out.println("Matrix Id for New Student " + matrixID);
   System.out.println("Contact Num for New Student " + contactNum);
   System.out.println("Email for New Student " + email);
   System.out.println("Course for New Student " + course);
   System.out.println("Query: " +insertQuery);
	    
   try 
   {
      //connect to DB 
      currentCon = ConnectionManager.getConnection();        
      String query = "INSERT INTO student(No, studName, icNum, matrixID, contactNum, email, course) VALUES (NULL, ?,?,?,?,?,?)"; //Insert user details into the table 'STUDENT'
      preparedStatement = currentCon.prepareStatement(query);
      preparedStatement.setString(1, studName);
      preparedStatement.setString(2, icNum);
      preparedStatement.setString(3, matrixID);
      preparedStatement.setString(4, contactNum);
      preparedStatement.setString(5, email);
      preparedStatement.setString(6, course);
      
      //String TwoQuery = "INSERT INTO login(icNum, matrixID) VALUES (?,?)"; //Insert user details into the table 'login'
      //preparedStatement = currentCon.prepareStatement(TwoQuery);
      
        //preparedStatement.setString(1, icNum);
        //preparedStatement.setString(2, matrixID);
      
      //Making use of prepared statements here to insert bunch of data
      // if user does not exist set the isValid variable to false
      int i= preparedStatement.executeUpdate();
      
      if (i!=0)  //Just to ensure data has been inserted into the database
      return "SUCCESS"; 
      }

   		catch (SQLException e) 
   		{
   			e.printStackTrace();
   		} 
   			return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
   		}
  }
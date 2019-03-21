package kolej;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class StudentListDAO {
	
	public List<Student> getAllStudent() throws SQLException{
		
		Connection currentCon = null;
		Statement stmt = null; 
        List<Student> stud = new ArrayList<Student>();
        currentCon = ConnectionManager.getConnection();
        stmt=currentCon.createStatement();
     
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next())
        {
            Student studs = new Student();
            studs.setId(rs.getInt("id"));
            studs.setStudName(rs.getString("studName("));
            studs.setICNum(rs.getString("icNum"));
            studs.setMatrixID(rs.getInt("matrixID"));
            studs.setContactNum(rs.getInt("contactNum"));
            stud.add(studs);        
        }       
        return stud;
    }
    public Student getStudentById(int id) throws SQLException {
    	
    	Student studs = new Student();
    	Connection currentCon = ConnectionManager.getConnection(); 
        PreparedStatement stmt = currentCon.prepareStatement("SELECT * FROM student WHERE No=?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
         
        if(rs.next()) {
            studs.setId(rs.getInt("id"));
            studs.setStudName(rs.getString("studName"));
            studs.setICNum(rs.getString("icNum"));
            studs.setMatrixID(rs.getInt("matrixID"));
            studs.setContactNum(rs.getInt("contactNum"));
            studs.setEmail(rs.getString("email"));
            studs.setCourse(rs.getString("course")); 
        }
         
        return studs;
         
    }
}
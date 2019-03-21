package kolej;

import java.sql.*;

import java.util.List;
import java.util.ArrayList;

public class EditDeleteDAO {
	public static void insertDetails(Student sbean) throws SQLException, ClassNotFoundException
    {
        Connection currentCon = ConnectionManager.getConnection();
       
        PreparedStatement stmt = currentCon.prepareStatement("INSERT INTO student values (Null,?,?,?,?,?,?)");
        stmt.setString(1, sbean.getStudName());
        stmt.setString(2, sbean.getICNum());
        stmt.setInt(3, sbean.getMatrixID());
        stmt.setInt(4, sbean.getContactNum());
        stmt.setString(5, sbean.getEmail());
        stmt.setString(6, sbean.getCourse()); 
        stmt.executeUpdate();      
    }

    public List<Student> getAllDetails() throws SQLException, ClassNotFoundException
    {
       Connection currentCon = ConnectionManager.getConnection(); 
       PreparedStatement stmt = currentCon.prepareStatement("SELECT * from student");
       List<Student> list = new ArrayList<Student>();
       ResultSet rs = stmt.executeQuery();
       while(rs.next())
       {
           Student sbean = new Student();
           sbean.setId(rs.getInt(1));
           sbean.setStudName(rs.getString(2));
           sbean.setICNum(rs.getString(3));
           sbean.setMatrixID(rs.getInt(4));
           sbean.setContactNum(rs.getInt(5));
           sbean.setEmail(rs.getString(6));
           sbean.setCourse(rs.getString(7));
           list.add(sbean);
       }
       return list;
    }
    
    public Student getDetails(int id) throws SQLException, ClassNotFoundException
    {
       Connection currentCon = ConnectionManager.getConnection(); 
       PreparedStatement stmt = currentCon.prepareStatement("SELECT * from student WHERE No=?");
       stmt.setInt(1,id);
       Student sbean = new Student();
       ResultSet rs = stmt.executeQuery();
       while(rs.next())
       {
           sbean.setId(rs.getInt(1));
           sbean.setStudName(rs.getString(2));
           sbean.setICNum(rs.getString(3));
           sbean.setMatrixID(rs.getInt(4));
           sbean.setContactNum(rs.getInt(5));
           sbean.setEmail(rs.getString(6));
           sbean.setCourse(rs.getString(7));
       }
       return sbean;
    }
    
    public void deleteDetails(int id) throws SQLException, ClassNotFoundException 
    {
         Connection currentCon = ConnectionManager.getConnection();
         PreparedStatement stmt = currentCon.prepareStatement("DELETE FROM student where No=?");
         stmt.setInt(1, id);
         stmt.executeUpdate();
 
     }
    public void updateDetails(Student sbean) throws SQLException, ClassNotFoundException 
    {
         Connection currentCon = ConnectionManager.getConnection();
         PreparedStatement stmt = currentCon.prepareStatement("UPDATE student SET studName=?,icNum=?,matrixID=?,contactNum=?,email=?,course=? WHERE No=?");
         stmt.setInt(6, sbean.getId());
         stmt.setString(1, sbean.getStudName());
         stmt.setString(2, sbean.getICNum());
         stmt.setInt(3, sbean.getMatrixID());
         stmt.setInt(4, sbean.getContactNum());
         stmt.setString(5, sbean.getEmail());
         stmt.setString(5, sbean.getCourse());
         stmt.executeUpdate();
     }
}
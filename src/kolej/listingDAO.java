package kolej;

import java.util.*;
import java.sql.*;

public class listingDAO {
	
	public static Connection getConnection(){
		Connection currentCon = null;
		try{
			currentCon = ConnectionManager.getConnection(); 
		}catch(Exception e){
			System.out.println(e);
			}  
		return currentCon;  
		}  
	public static int update(Student stud){
		int status=0;
		try{
			Connection currentCon = listingDAO.getConnection();
			PreparedStatement ps = currentCon.prepareStatement("update student set studName=?, icNum=?, matrixID=?, contactNum=?, email=?, course=? where id=?");
			
			ps.setString(1, stud.getStudName());
			ps.setString(2, stud.getICNum());
			ps.setInt(3, stud.getMatrixID());
			ps.setInt(4, stud.getContactNum());
			ps.setString(5, stud.getEmail());
			ps.setString(6, stud.getCourse());
			
			status=ps.executeUpdate();
			
			currentCon.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection currentCon=listingDAO.getConnection();
			PreparedStatement ps=currentCon.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			status=ps.executeUpdate();
			
			currentCon.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	public static Student getStudentById(int id){
		Student stud=new Student();
		
		try{
			Connection currentCon=listingDAO.getConnection();
			PreparedStatement ps=currentCon.prepareStatement("Select * from student where No=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				stud.setId(rs.getInt(1));
				stud.setStudName(rs.getString(2));
				stud.setICNum(rs.getString(3));
				stud.setMatrixID(rs.getInt(4));
				stud.setContactNum(rs.getInt(5));
				stud.setEmail(rs.getString(6));
				stud.setCourse(rs.getString(7));
			}
			currentCon.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return stud;
	}
	public static List<Student> getAllStudents(){
		List<Student> list=new ArrayList<Student>();
		try{
			Connection currentCon=listingDAO.getConnection();
			PreparedStatement ps=currentCon.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Student stud = new Student();
				stud.setId(rs.getInt(1));
				stud.setStudName(rs.getString(2));
				stud.setICNum(rs.getString(3));
				stud.setMatrixID(rs.getInt(4));
				stud.setContactNum(rs.getInt(5));
				stud.setEmail(rs.getString(6));
				stud.setCourse(rs.getString(7));
				list.add(stud);
			}
			currentCon.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
}
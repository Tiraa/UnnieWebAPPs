package kolej;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import kolej.PelajarDao;
import kolej.ConnectionManager;
import kolej.Pelajar;

public class PelajarDaoImplement implements PelajarDao{
 
    private static PelajarDaoImplement pelajarDaoImpl = null;
 
    private Connection connection = ConnectionManager.getConnection();
 
 
    public void updatePelajar(Pelajar pelajar) {
        String sql = "UPDATE student SET"
                    +" studName=?, icNum=?, matrixID=?, contactNum=?, email=?, course=? "
                    + "WHERE No=?";
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, pelajar.getStudName());
            pstmt.setString(2, pelajar.getICNum());
            pstmt.setInt(3, pelajar.getMatrixID());
            pstmt.setInt(4, pelajar.getContactNum());
            pstmt.setString(5, pelajar.getEmail());
            pstmt.setString(6, pelajar.getCourse());
            pstmt.setLong(7, pelajar.getId());

            pstmt.executeUpdate();
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public void deletePelajar(Long id) {
        String sql = "DELETE FROM student WHERE No=?";
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
 
            // Delete Customer Account
            pstmt.executeUpdate();
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public Pelajar findPelajarById(Long id) {
        String sql = "SELECT * FROM student WHERE No=?";
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
 
            // Getting Customer Detail
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                Pelajar pelajar = new Pelajar();
                pelajar.setId(resultSet.getLong(1));
                pelajar.setStudName(resultSet.getString(2));
                pelajar.setICNum(resultSet.getString(3));
                pelajar.setMatrixID(resultSet.getInt(4));
                pelajar.setContactNum(resultSet.getInt(5));
                pelajar.setEmail(resultSet.getString(6));
                pelajar.setCourse(resultSet.getString(7));
 
                return pelajar;
            }
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        return null;
    }
 
    public List<Pelajar> findAllPelajars() {
        String sql = "SELECT * FROM student";
        List<Pelajar> pelajars = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
 
            // Getting Customer's Detail
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                if (pelajars == null)
                	pelajars = new ArrayList<>();
 
                Pelajar pelajar = new Pelajar();
                pelajar.setId(resultSet.getLong(1));
                pelajar.setStudName(resultSet.getString(2));
                pelajar.setICNum(resultSet.getString(3));
                pelajar.setMatrixID(resultSet.getInt(4));
                pelajar.setContactNum(resultSet.getInt(5));
                pelajar.setEmail(resultSet.getString(6));
                pelajar.setCourse(resultSet.getString(7));
 
                pelajars.add(pelajar);
 
            }
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        return pelajars;
    }
 
    public static PelajarDao getInstance() {
        if (pelajarDaoImpl == null)
            pelajarDaoImpl = new PelajarDaoImplement();
 
        return pelajarDaoImpl;
    }
}
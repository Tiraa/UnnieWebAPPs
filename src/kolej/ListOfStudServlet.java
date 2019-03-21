package kolej;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kolej.ConnectionManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.PrintWriter;

@WebServlet("/ListOfStudServlet")
public class ListOfStudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListOfStudServlet(){
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection currentCon = ConnectionManager.getConnection();  
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.print(" <link rel='stylesheet' type='text/css' href='listing.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='hero-image' style='margin-bottom: 5%; background-image: url('header.jpg'); background-size: 100% 100%;'>");
		out.println("</div>");

		out.println("<div class='container'>");
		out.println("<div class='row'>");
		out.println("<div class='col-sm-12'>");
		
		out.println("<h2 class='tjk'>Student's Details</h2><br><br>");
		List<Student> list=listingDAO.getAllStudents();
		
		try{
		    	String sql = "select No, studName, icNum, matrixID, contactNum, email, course from student";
		    	PreparedStatement prepareStatement = (PreparedStatement) currentCon.prepareStatement(sql);
		    	ResultSet rs = prepareStatement.executeQuery();
		    	String str = "<table><tr><th>No</th><th>Student Name</th><th>Student's IC</th><th>Matrix ID</th><th>Contact Number</th><th>Email</th><th>Course</th><th colspan='2'>Actions</th></tr>";
		    	while(rs.next()) {
		    		str += "<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td>";
		    		for(Student stud:list){
		    			out.print("<td><a href='UpdateStudent?id="+stud.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+stud.getId()+"'>Delete</a></td></tr>");
		    		}
		    		out.close();	
		    	}
		    	
		    	str += "</table>";
		    	out.println(str);
		    	currentCon.close();
		    	out.println("</div>");
		    	out.println("</div>");
		    	out.println("</div>");
		    	
			} catch(Exception e){ 
				System.err.println(e);
			} finally{
				out.close();
			}
		
		out.println("<div class='footer' style='margin-top: 25px; background-image: url('footer.png'); background-size: 100% 100%;'>");
		out.println("<div class='container'>");
				out.println("<div class='row'>");
						out.println("<div class='col-md-12'>");
								out.println(" <center>");
										out.println(" <p><br><font> <b> © 2019</b> </font> <font face='Algerian' color='yellow' style='text-shadow: 2px 2px 4px #000000' size='5px'> UnniE </font> <font size='1'><b>UNIVERSITY IN MALAYSIA</b> </font></p>");
												out.println(" </center>");
														out.println(" </div> ");
	             
																out.println(" </div>");
																		out.println("  </div>");
																				out.println("  </div>");
	}
}
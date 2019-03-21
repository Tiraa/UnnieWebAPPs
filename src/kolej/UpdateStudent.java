package kolej;

import java.io.IOException;
//import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import UniPackage.ConnectionManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.io.PrintWriter;

@WebServlet("/UpdateServlet")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateStudent(){
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		out.println("<h2 class='tjk'>Update Student Details</h2><br><br>");
		String Sid = request.getParameter("id");
		int id=Integer.parseInt(Sid);
		
		Student stud = listingDAO.getStudentById(id);
		
				out.print("<form action='EditServlet2' method='post'>");
				out.print("<table>");
				out.print("<tr><td></td><td><input type='hidden' name='id' value='"+stud.getId()+"'/></td></tr>");  
		        out.print("<tr><td>Student Name:</td><td><input type='text' name='studName' value='"+stud.getStudName()+"'/></td></tr>");  
		        out.print("<tr><td>Ic Number:</td><td><input type='text' name='icNum' value='"+stud.getICNum()+"'/></td></tr>");
		        out.print("<tr><td>Matrix ID:</td><td><input type='text' name='matrixID' value='"+stud.getMatrixID()+"'/></td></tr>");
		        out.print("<tr><td>Contact Number:</td><td><input type='text' name='contactNum' value='"+stud.getContactNum()+"'/></td></tr>");
		        out.print("<tr><td>Course:</td><td><input type='text' name='email' value='"+stud.getEmail()+"'/></td></tr>");
		        	
		        out.print("<tr><td>Course:</td><td><input type='text' name='course' value='"+stud.getCourse()+"'/></td></tr>");
		    	
		        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
		        out.print("</table>");  
		        out.print("</form>"); 
		        
		        out.close();
		        out.println("</div>");
		    	out.println("</div>");
		    	out.println("</div>");
		        
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
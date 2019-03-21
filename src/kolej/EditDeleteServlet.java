package kolej;

import java.sql.SQLException;
import java.util.List;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditDeleteServlet
 */
@WebServlet("/EditDeleteServlet")
public class EditDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, boolean name) 
    	    throws ServletException, IOException, SQLException, ClassNotFoundException {
    	        response.setContentType("text/html;charset=UTF-8");
    	        response.setHeader("Cache-control", "no-cache, no-store");
    	        
    	        Student sbean = new Student();
    	        EditDeleteDAO sDAO = new EditDeleteDAO();
    	        
    	        String command = request.getParameter("command");
    	        PrintWriter out = response.getWriter();
    	        out.print(command);
    	        
    	        try{
    	            if(command.equals("Submit")) 
    	            {
    	                String id=request.getParameter("id");
    	                String studName=request.getParameter("studName");
    	                String icNum=request.getParameter("icNum");
    	                String matrixID=request.getParameter("matrixID");
    	                String contactNum=request.getParameter("contactNum");
    	                String email=request.getParameter("email");
    	        		String course=request.getParameter("course");
    	                sbean.setId(Integer.parseInt(id));
    	                sbean.setStudName(studName);
    	                sbean.setICNum(icNum);
    	                sbean.setMatrixID(Integer.parseInt(matrixID));
    	                sbean.setContactNum(Integer.parseInt(contactNum));
    	                sbean.setEmail(email);
    	                sbean.setCourse(course);
    	                EditDeleteDAO.insertDetails(sbean);
    	                List<Student> list = sDAO.getAllDetails();
    	                if(list!=null)
    	                {
    	                	request.setAttribute("list",list);
    	                    RequestDispatcher rd = request.getRequestDispatcher("/studListing.jsp");
    	                    rd.forward(request, response);
    	                }
    	            }
    	            if(command.equals("Update")) 
    	            {
    	                String id=request.getParameter("id");
    	                String studName=request.getParameter("studName");
    	                String icNum=request.getParameter("icNum");
    	                String matrixID=request.getParameter("matrixID");
    	                String contactNum=request.getParameter("contactNum");
    	                String email=request.getParameter("email");
    	                String course=request.getParameter("course");
    	                sbean.setId(Integer.parseInt(id));
    	                sbean.setStudName(studName);
    	                sbean.setICNum(icNum);
    	                sbean.setMatrixID(Integer.parseInt(matrixID));
    	                sbean.setContactNum(Integer.parseInt(contactNum));
    	                sbean.setEmail(email);
    	                sbean.setCourse(course);
    	                sDAO.updateDetails(sbean);
    	                List<Student> list = sDAO.getAllDetails();
    	                if(list!=null)
    	                {
    	                    request.setAttribute("list",list);
    	                    RequestDispatcher rd = request.getRequestDispatcher("/studListing.jsp");
    	                    rd.forward(request, response);
    	                }
    	            }
    	            if (command.equals("edit"))
    	            {
    	                String studName = request.getParameter("studName");
    	                out.print(studName);
    	                Student sbean1 = sDAO.getDetails(String(studName));
    	                request.setAttribute("sbean",sbean1);
    	                out.print(sbean1.getStudName());
    	                RequestDispatcher rd = request.getRequestDispatcher("/StudentUpdateDetails.jsp");
    	                rd.forward(request, response);
    	            }
    	            
    	            if (command.equals("view"))
    	            {
    	                List<Student> list = sDAO.getAllDetails();
    	                if(list!=null)
    	                {
    	                    request.setAttribute("list",list);
    	                    RequestDispatcher rd = request.getRequestDispatcher("/studListing.jsp");
    	                    rd.forward(request, response);
    	                }
    	            }
    	            if (command.equals("delete"))
    	            {
    	                String id = request.getParameter("sid");
    	                out.print(id);
    	                sDAO.deleteDetails(Integer.parseInt(id));
    	                List<Student> list = sDAO.getAllDetails();
    	                if(list!=null)
    	                {
    	                    request.setAttribute("list",list);
    	                    RequestDispatcher rd = request.getRequestDispatcher("/StudListing.jsp");
    	                    rd.forward(request, response);
    	                }
    	            }
    	            if (command.equals("home"))
    	            {
    	                RequestDispatcher rd = request.getRequestDispatcher("/userLogged.jsp");
    	                rd.forward(request, response);
    	            }
    	            
    	                
    	        }
    	        catch (Exception e)
    	        {
    	            out.print(e);
    	        }
    	        finally
    	        {
    	            out.close();
    	        }
    	        
    	    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	processRequest(request, response);
	}
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
       private int String(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

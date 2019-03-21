package kolej;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet2
 */
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String studName = request.getParameter("studName");
		String icNum = request.getParameter("icNum");
		String matRIxID = request.getParameter("matrixID");
		int matrixID=Integer.parseInt(matRIxID);
		String conTActNum = request.getParameter("contactNum");
		int contactNum=Integer.parseInt(conTActNum);
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		
		Student stud = new Student(); 
		stud.setId(id); 
		stud.setStudName(studName); 
		stud.setICNum(icNum);
		stud.setMatrixID(matrixID);
		stud.setContactNum(contactNum);
		stud.setEmail(email);
		stud.setCourse(course);
		
		out.close();
	}
}
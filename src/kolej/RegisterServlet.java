package kolej;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import kolej.StudentBean;
import kolej.StudentDAO;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String studName = request.getParameter("SN");
		String icNum = request.getParameter("IC");
		String matrixID = request.getParameter("MID");
		String contactNum = request.getParameter("CTC");
		String email = request.getParameter("mail");
		String course = request.getParameter("kos");

		StudentBean studentBean = new StudentBean();
		
		studentBean.setStudName(studName);
		studentBean.setICNum(icNum);
		studentBean.setMatrixID(matrixID);
		studentBean.setContactNum(contactNum);
		studentBean.setEmail(email);
		studentBean.setCourse(course);
		
		StudentDAO studentDAO = new StudentDAO();
		
		String studentRegistered = studentDAO.registerStudent(studentBean);
		System.out.println("678");
		if(studentRegistered.equals("SUCCESS"))
		{
			System.out.println("hello");
			request.getRequestDispatcher("studentSuccess.jsp").forward(request, response);
		}
		else
		{
			System.out.println("123");
			request.getRequestDispatcher("invalidRegister.jsp").forward(request, response);
		}
	}
}

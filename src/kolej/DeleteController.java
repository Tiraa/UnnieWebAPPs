package kolej;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import kolej.PelajarDao;
import kolej.PelajarDaoImplement;
 
@WebServlet("/pelajar/delete")
public class DeleteController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DeleteController() {
        // Do Nothing
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String custId = request.getParameter("custId");
 
        if (custId == "" || custId == null)
            request.getRequestDispatcher("/").forward(request, response);
        else {
            Long id = Long.parseLong(custId);
            PelajarDao customerDao = PelajarDaoImplement.getInstance();
 
            customerDao.deletePelajar(id);
 
            response.sendRedirect(request.getContextPath() + "/");
        }
    }
}

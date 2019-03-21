package kolej;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import kolej.PelajarDao;
import kolej.PelajarDaoImplement;
import kolej.Pelajar;
 
@WebServlet("/pelajar/update")
public class UpdateController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public UpdateController() {
        // Do Nothing
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String No = request.getParameter("No");
 
        if (No == "" || No == null)
            request.getRequestDispatcher("/").forward(request, response);
        else {
            Long id = Long.parseLong(No);
            PelajarDao pelajarDao = PelajarDaoImplement.getInstance();
            Pelajar pelajar = pelajarDao.findPelajarById(id);
 
            request.setAttribute("pelajar", pelajar);
 
            request.getRequestDispatcher("/").forward(request, response);
        }
    }
}

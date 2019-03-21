package kolej;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import kolej.PelajarDao;
import kolej.PelajarDaoImplement;
import kolej.Pelajar;
 
@WebServlet("/")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    private PelajarDao pelajarDao = PelajarDaoImplement.getInstance();
     
    public Controller() {
        // Do Nothing
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        List<Pelajar> pelajars = pelajarDao.findAllPelajars();
 
        request.setAttribute("pelajarList", pelajars);
 
        request.getRequestDispatcher("controllerListing.jsp").forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
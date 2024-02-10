package ma.fstm.ilisi.jeetps.tp1.collaboration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletPrincipale extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        int cmpt = 0;

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Message n°"+ ++cmpt +": Je suis dans la servlet principale</h1>");

        req.setAttribute("cmpt", ++cmpt);
        req.getRequestDispatcher("servlet-secondaire").include(req, resp);

        out.println("<h1>Message n°"+ ++cmpt +": De retour dans la servlet principale</h1>");
        out.println("</body></html>");
    }
}

package ma.fstm.ilisi.jeetps.tp1.authentification;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AuthentificationServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>S'authentifier</h1>");
        out.println("<form action='authentification' method='POST'>");
        out.println("Nom: <input type='text' name='nom'><br><br>");
        out.println("Prénom: <input type='text' name='prenom'><br><br>");
        out.println("<input type='submit' value='Se connecter'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("nom", req.getParameter("nom"));
        req.setAttribute("prenom", req.getParameter("prenom"));
        req.getRequestDispatcher("home").forward(req, resp);
    }
}

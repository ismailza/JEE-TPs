package ma.fstm.ilisi.jeetps.tp1.collaboration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletSecondaire extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Integer cmpt = (Integer) req.getAttribute("cmpt");
        if (cmpt == null)
            cmpt = 1;

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Message n°"+ cmpt +": Je suis dans la servlet secondaire</h1>");
        out.println("</body></html>");
    }
}

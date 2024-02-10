package ma.fstm.ilisi.jeetps.tp1.date_servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DateServlet extends HttpServlet {
    private Date sysdate;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Initialisation de la servlet DateServlet");
        this.sysdate = new Date();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Date : " + sysdate + "</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Suppression de la servlet DateServlet");
        super.destroy();
    }
}

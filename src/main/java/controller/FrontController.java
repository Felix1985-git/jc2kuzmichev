package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FrontController extends HttpServlet {
    public static final long serialVersionUID = 1L;

    public FrontController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    private void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp");
//        requestDispatcher.forward(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"UTF-8\">");
        out.println("<title>Title</title>");
        out.println("</head><body>");
        out.println("<h1>Hello FrontController</h1>");
        out.println("<form action=\"index.jsp\" method=\"post\">\n" +
                "        <input type=\"submit\" value=\"Go to index page\"/>\n" +
                "    </form>");
        out.println("</body></html>");
    }
}


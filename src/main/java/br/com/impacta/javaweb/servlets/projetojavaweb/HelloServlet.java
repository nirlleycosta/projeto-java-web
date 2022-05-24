package br.com.impacta.javaweb.servlets.projetojavaweb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nome = request.getParameter("nome");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nome + "</h1>");
        out.println("<h1>" + request.getMethod() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
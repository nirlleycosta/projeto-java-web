package br.com.impacta.javaweb.servlets.projetojavaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        if (login != null && senha != null) {

            if (login.equals("nirlleycosta@gmail.com") && senha.equals("123456789")) {

                RequestDispatcher dispatcher = request.getRequestDispatcher("/sistema");
                dispatcher.forward(request,response);
            }

        }

        PrintWriter out = response.getWriter();
        out.println("Erro login ou senha");
        response.sendRedirect("/projeto_java_web/erroLogin.html");
    }
}

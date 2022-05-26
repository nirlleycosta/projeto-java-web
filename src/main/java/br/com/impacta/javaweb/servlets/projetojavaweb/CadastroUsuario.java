package br.com.impacta.javaweb.servlets.projetojavaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String senhaConfirmada = request.getParameter("senhaConfirmada");


        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro realizado com sucesso!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h4>Nome:</h4> " + nome);
        out.println("<h4>Login:</h4> " + login);
        out.println("<h4>Senha:</h4> " + senha);
        out.println("<h4>SenhaConfirmada:</h4> " + senhaConfirmada);
        out.println("<body>");
        out.println("</html");

    }
}

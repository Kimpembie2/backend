package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class HelloServlet extends HttpServlet {
    HttpSession session = request.getSession(true);
    private String welcome;

    public void init() {
        welcome = "Welcome to our site!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("User Agent: " + response.getHeader("User-Agent"));

        String username = System.out.println(request.getParameter("username"));
        String password = System.out.println(request.getParameter("password"));

        if (username == "Gino" and password == "Pasquale") {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + welcome + "</h1>");
            out.println("</body></html>");
        } else {
            session.setAttribute("Errore", String("Accesso negato"))
            response.sendRedirect("/errore");
        }


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("Host: " + response.getHeader("Host"));
        System.out.println("Accept-Encoding: " + response.getHeader("Accept-Encoding"));
        System.out.println("If-None-Match: " + response.getHeader("If-None-Match"));
        response.setContentType("text/txt");

    }

    public void destroy() {
    }
}
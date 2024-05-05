package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "errore", value = "/errore")
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String attributoSalvato = (String) session.getAttribute("Errore");
        System.out.println(attributoSalvato)

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + attributoSalvato + "</h1>");
        out.println("<h1>" + "404" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

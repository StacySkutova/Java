package com.example.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "redirectServlet", value = "/redirectServlet")
public class redirectServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        if(id == null) {

            String path = "https://iba.by/";
            response.sendRedirect(path);
        }
        else {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            try {
                writer.println("<h2>Hello Id " + id + "</h2>");
            } finally {
                writer.close();
            }
        }

    }

    public void destroy() {
    }
}

package com.example.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorApp", value = "/calculatorApp")
public class calculatorApp extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int x, y, z = 0;
            x = Integer.parseInt(request.getParameter("n1"));
            y = Integer.parseInt(request.getParameter("n2"));
            String amal = request.getParameter("amal");

            if (amal.equals("+")) {
                z = x + y;
            }
            if (amal.equals("-")) {
                z = x - y;
            }
            if (amal.equals("*")) {
                z = x * y;
            }
            if (amal.equals("/")) {
                z = x / y;
            }
            out.println("Результат="+z);
        }
        finally{
            out.close();
        }

    }
}
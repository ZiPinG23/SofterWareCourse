package com.example.pingweb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@WebServlet(name = "Mes", value = "/mes")
public class Mes extends HttpServlet {
    Map<String,String> mes =new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String mess=request.getParameter("mess");
        mes.put(name,mess);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><body>");
        for (String na : mes.keySet()) {
            String co = mes.get(na);
            out.println(na + ":" + co+"<br>");
        }
        out.println("<a href=\"message.html\">返回</a>");
        out.println("</body></html>");
    }
}

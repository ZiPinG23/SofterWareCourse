package com.example.pingweb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "USST", value = "/USST")
public class Usst extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        String mes = "更多课程++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++代替信息";
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.getWriter().write(mes);
        response.getWriter().flush();
        response.getWriter().close();
    }

    public void destroy() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

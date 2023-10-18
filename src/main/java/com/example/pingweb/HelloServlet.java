package com.example.pingweb;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import netscape.javascript.JSObject;

@WebServlet(name = "Hellow",value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        String mes = "[{name:'Kobe',team:'Lakers'},{name:'Tim',team:'Spurs'}]";
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        // Hello
        PrintWriter out = response.getWriter();
        out.println(mes);
        out.flush();
        out.close();
    }

    public void destroy() {
    }
}
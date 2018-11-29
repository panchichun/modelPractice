package com.fishc.web.modular.homePage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomePage extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("加载");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进来入doget");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进来入doPost");
    }

    @Override
    public void destroy() {
        System.out.println("end.....");
    }
}

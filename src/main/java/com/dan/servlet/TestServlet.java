package com.dan.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gborza on 08/04/2014.
 */
@WebServlet(name="TestServlet", urlPatterns = {"/path"})
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().print("<html><head><title>Title</title></head><body>Hello from servlet</body></html>");
    }


}

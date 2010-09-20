package com.mini.servlet;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 11:40:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class BarServlet extends HttpServlet {
    private static Logger log = Logger.getLogger(BarServlet.class);

    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        log.debug("in service (bar)");

        //do something fancy and return view page
        req.getRequestDispatcher("../smr.jsp").forward(req, res);
    }
}

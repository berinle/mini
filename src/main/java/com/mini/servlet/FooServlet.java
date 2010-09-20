package com.mini.servlet;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 10:53:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class FooServlet extends HttpServlet {

    private static Logger log = Logger.getLogger(FooServlet.class);

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log.debug("in service (foo)");
        //do something fancy and return view page
        req.getRequestDispatcher("../reverse.jsp").forward(req, res);
    }
}

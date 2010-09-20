package com.mini.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 11:00:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class AuctionSniffer implements Filter {
    private static Logger log = Logger.getLogger(AuctionSniffer.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        log.debug("filter init.");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.debug("doFilter");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        //determine which controller to go to based on the attributes in the request
        if(req.getParameter("auction_type").equals("smr")){

            log.debug( " doing smr type auctions ");
            req.getRequestDispatcher("/servlet/foo").forward(req, res);
        } else {
            log.debug(" doing reverse type auctions ");
            req.getRequestDispatcher("/servlet/bar").forward(req, res);
        }
    }

    public void destroy() {
        log.debug("destroy");
    }
}

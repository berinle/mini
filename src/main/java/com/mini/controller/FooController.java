package com.mini.controller;

import com.mini.service.FooService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 12:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value="/foo/home")
public class FooController implements BaseController {

    private static Logger log = Logger.getLogger(FooController.class);

    @Autowired
    private FooService fooService;

    @RequestMapping
    public void home(){
        log.debug("home -- foo style");
    }

    @RequestMapping(method = RequestMethod.POST)
    public void placeBid(){
        log.debug(" placing bid -- foo style ");
    }
}

package com.mini.controller;

import com.mini.service.BarService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 12:40:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value="/bar/home")
public class BarController implements BaseController {
    private static Logger log = Logger.getLogger(BarController.class);

    @Autowired
    private BarService barService;

    @RequestMapping
    public void home(Model model) {
        log.debug("home -- bar style");
        model.addAttribute("items", barService.getItems());
    }

    @RequestMapping(method= RequestMethod.POST)
    public void placeBid() {
        log.debug(" placing bids -- bar style");
    }
}

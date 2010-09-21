package com.mini.controller;

import org.springframework.ui.Model;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 12:41:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BaseController {

    void home(Model model);
    void placeBid();
}

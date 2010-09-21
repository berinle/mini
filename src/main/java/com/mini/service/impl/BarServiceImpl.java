package com.mini.service.impl;

import com.mini.domain.Item;
import com.mini.service.BarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 20, 2010
 * Time: 5:35:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BarServiceImpl implements BarService {
    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("chair", 50L));
        items.add(new Item("table", 100L));
        items.add(new Item("pen", 10L));
        return items;  
    }
}

package com.mini.service.impl;

import com.mini.domain.Item;
import com.mini.service.FooService;
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
public class FooServiceImpl implements FooService {
    public List<Item> getItems() {

        //make up some data. Ideally, this will be read from a database via a dao call
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("item1", 100L));
        items.add(new Item("item2", 200L));
        items.add(new Item("item3", 150L));
        items.add(new Item("item4", 300L));
        items.add(new Item("item5", 180L));
        items.add(new Item("item6", 220L));
        return items;
    }
}

package com.mini.domain;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 21, 2010
 * Time: 5:07:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    public Item(){
        this.name = "default";
        this.price = 0L;
    }

    public Item(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    private String name;
    private Long price;


}

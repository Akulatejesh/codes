package com.demo;

import java.util.Date;
import java.util.Vector;

class Pizza {
    private String name;
    private int price;

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Bill {
    private int billNo;
    private String custName;
    private Date date;
    private int total;
    private Vector<Pizza> pizzas;

    public Bill(int billNo, String custName, Date date) {
        this.billNo = billNo;
        this.custName = custName;
        this.date = date;
        this.total = 0;
        this.pizzas = new Vector<>();
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public Vector<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        total += pizza.getPrice();
    }
}


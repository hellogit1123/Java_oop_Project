/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;
import java.util.ArrayList;

public class Price 
{
    private ArrayList<PriceFormat> prices = new ArrayList<PriceFormat>();
    
    Price()
    {
        prices.add(new PriceFormat("pepperoni", 1.0));
        prices.add(new PriceFormat("mushrooms", 1.0));
        prices.add(new PriceFormat("onions", 0.5));
        prices.add(new PriceFormat("sausage", 2.0));
        prices.add(new PriceFormat("bacon", 2.0));
        prices.add(new PriceFormat("extra cheese", 1.0));
        prices.add(new PriceFormat("black olives", 0.5));
        prices.add(new PriceFormat("green peppers", 1.0));
        prices.add(new PriceFormat("pineapple", 1.5));
        prices.add(new PriceFormat("spinach", 1.5));
        prices.add(new PriceFormat("chicken", 2.0));
        prices.add(new PriceFormat("s", 6.99));
        prices.add(new PriceFormat("m", 8.99));
        prices.add(new PriceFormat("l", 10.99));
    }
    
    public double getPrice(String name)
    {
        double price = 0;
        for(int i = 0;i<prices.size();i++)
        {
            if(prices.get(i).getName().equals(name))
                return prices.get(i).getPrice();
        }
        return price;
    }
    
}


class PriceFormat
{
    private String name;
    private double price;
    
    PriceFormat(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(Double price)
    {
        this.price = price;
    }
    public void setPrice()
    {
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
}
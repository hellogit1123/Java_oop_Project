/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;
import java.util.ArrayList;

public class Pizza 
{
    private char size;
    private ArrayList<String> toppings = new ArrayList<String>();
    private double price = 0;
    private String sauce;
    private String pizzaName;
    private Price p = new Price();
    
    public String getSize()
    {
        if(this.size == 's')
            return "Small";
        else if(this.size == 'm')
            return "Medium";
        else 
            return "Large";
    }
    
    public String getName()
    {
        return this.pizzaName;
    }
    
    public String getToppings()
    {
        String allTopping = "";
        for(String i:toppings)
        {
            allTopping = allTopping + i + " ";
        }
        return allTopping;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public String getSauce()
    {
        return this.sauce;
    }
    public void addToppings(String topping)
    {
        this.price += p.getPrice(topping); 
        toppings.add(topping);
    }
    public void setName(String name)
    {
        this.pizzaName = name;
    }
    public void setSauce(String sauce)
    {
        this.sauce = sauce;
    }
    public void setSize(char s)
    {
        this.price += p.getPrice(Character.toString(s));
        this.size = s;
    }
}

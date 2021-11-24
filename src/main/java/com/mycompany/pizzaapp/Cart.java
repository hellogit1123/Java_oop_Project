/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;
import java.util.ArrayList;

public class Cart 
{
    private ArrayList<Pizza> cart = new ArrayList<Pizza>();
    
    public void insetPizza(Pizza p)
    {
        cart.add(p);
    }
    
    public void removePizza(int index)
    {
        cart.remove(index);
    }
    public String getCurrentPizza()
    {
        int currPizza = cart.size()-1;
        String info = "";
        String PizzaName = cart.get(currPizza).getName();
        String toppings = cart.get(currPizza).getToppings();
        String sauce = cart.get(currPizza).getSauce();
        String price = String.valueOf(cart.get(currPizza).getPrice());

        info  = info + "Name: " + PizzaName + "\n" +
                       "Toppings Used: " + toppings + "\n" +
                       "Sauce Used: " + sauce + "\n" +
                       "Size: " + cart.get(currPizza).getSize() + "\n" +
                       "Price of this Pizza: " + price + "\n\n";
        return info;
    }
    public String getPizzaInfo()
    {
        String info = "";
        for(Pizza p: cart)
        {
            String PizzaName = p.getName();
            String toppings = p.getToppings();
            String sauce = p.getSauce();
            String price = String.valueOf(p.getPrice());
            
            info  = info + "Name: " + PizzaName + "\n" +
                           "Toppings Used: " + toppings + "\n" +
                           "Sauce Used: " + sauce + "\n" +
                           "Size: " + p.getSize() + "\n" +
                           "Price of this Pizza: " + price + "\n\n";
            
        }
        return info;
    }
    public String getAllPizzaName()
    {
        String s = "";
        for(Pizza p:cart)
        {
            s = s + p.getName() + " ";
        }
        return s;
    }
    public String getSize()
    {
        return String.valueOf(cart.size());
    }
    public void emptyCart()
    {
        cart.clear();
    }
}
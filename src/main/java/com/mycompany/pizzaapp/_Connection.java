/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

import java.util.Scanner;

public class _Connection 
{
    Scanner input = new Scanner(System.in);
    Cart cart;
    CustomerData d = new CustomerData();
    Order o = new Order();
    OrderQueue oq = new OrderQueue();
    _Connection(Cart c)
    {
        this.cart = c;
    }
    public void newPizza()
    {
        Pizza p = new Pizza();
        System.out.println("Enter PizzaName");
        p.setName(input.nextLine());
        System.out.println("Enter All Toppings: press # to end");
        String toppings = input.nextLine();
        while(!toppings.equals("#"))
        {
            p.addToppings(toppings.toLowerCase());
            toppings = input.nextLine();
        }
        System.out.println("Enter Sauce:");
        p.setSauce(input.nextLine());
        System.out.println("Pick Size of your Pizza: L/M/S");
        p.setSize(input.nextLine().charAt(0));
        addToCart(p);
    }
    public void addToCart(Pizza p)
    {
        cart.insetPizza(p);
    }
    public void removeFromCart(int index)
    {
        cart.removePizza(index);
    }
    public void ReadyOrder(CustomerData d)
    {
        o.setOrder(cart, d);
        oq.insertOngoingOrder(o);
    }
}

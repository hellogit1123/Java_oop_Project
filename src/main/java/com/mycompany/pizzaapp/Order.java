/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

public class Order 
{
    private Cart cart;
    private CustomerData d;

    Order(){}
    
    public void setOrder(Cart c, CustomerData d)
    {
        this.cart = c;
        this.d = d;
    }

    public CustomerData getCustomerData()
    {
        return this.d;
    }
    public Cart getCart()
    {
        return this.cart;
    }
}

package com.mycompany.pizzaapp;

public class main 
{
    public static void main(String[] args) 
    {
        System.out.println("I am in main");
        System.out.println("hello world");
        //changes made by frank
        Cart cart = new Cart();
        _Connection conn = new _Connection(cart);
        Input i = new Input(conn, cart);
    }
}


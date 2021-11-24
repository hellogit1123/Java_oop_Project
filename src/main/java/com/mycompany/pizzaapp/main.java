/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

public class main 
{
    public static void main(String[] args) 
    {
        System.out.println("I am in main");
        System.out.println("hello world");
        
        Cart cart = new Cart();
        _Connection conn = new _Connection(cart);
        Input i = new Input(conn, cart);
    }
}


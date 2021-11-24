/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

import java.util.Scanner;

public class Input 
{
    _Connection conn;
    Cart cart;
    
    Input(_Connection conn, Cart cart)
    {
        //System.out.println("Hello World");
        this.cart = cart;
        this.conn = conn;
        initPrompt();
    }
    public void initPrompt()
    {
        System.out.println("Select one of the following: ");
        System.out.println("1. Press 1 to Order Pizza");
        System.out.println("2. Press 2 to View Order");
        System.out.println("3. Press 3 to View Cart");
        String in = getInput();
        if(in.equals("1"))
        {
            conn.newPizza();
            afterOrder();
        }else if(in.equals("2"))
            viewOrder();
        else if(in.equals("3"))
            viewCart();
            
    }
    public void afterOrder()
    {
        System.out.println("Your pizza has been successfully added to the cart.\n");
//        System.out.println("Here's all your current order information: ");
//        System.out.println(cart.getCurrentPizza());
        System.out.println("1. Press 1 to return to Main Menu");
        System.out.println("2. Press 2 to view Cart");
        String in = getInput();
        if(in.equals("1"))
            initPrompt();
        else if(in.equals("2"))
            viewCart();
        
    }
    public void viewOrder()
    {
        
    }
    public void viewCart()
    {
        System.out.println("\nAll Pizzas in Cart");
        System.out.println(cart.getPizzaInfo());
        System.out.println("1. Press 1 to return to Main Menu");
        System.out.println("2. Press 2 to continue to checkout");
        String in = getInput();
        if(in.equals("1"))
            initPrompt();
        else if(in.equals("2"))
            checkout();
    }
    public void checkout()
    {
        System.out.println("Enter Order Name:");
        String name = getInput();
        System.out.println("Enter phone Number:");
        String number = getInput();
        System.out.println("Enter Card Number:");
        String card = getInput();
        conn.ReadyOrder(new CustomerData(name,number, card));

        OrderQueueinfo();
        System.out.println("1. Press 1 to return to Main Menu");
        if(getInput().equals("1"))
            main.main(null);
        
    }
    public void OrderQueueinfo()
    {
        OrderQueue oq = new OrderQueue();
        System.out.println(oq.showOngoinOrder());
        System.out.println(oq.showOrderReady());
    }
    public String getInput()
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
    }
}

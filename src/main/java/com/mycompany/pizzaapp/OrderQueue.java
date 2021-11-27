/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;
import java.util.ArrayList;

public class OrderQueue 
{
    private static ArrayList<Order> ongoing_order = new ArrayList<Order>();
    private static ArrayList<Order> readyForPickup_order = new ArrayList<Order>();
    
    public void insertOngoingOrder(Order o)
    {
        ongoing_order.add(o);
    }
    
    public void removeOngoingOrder(int index)
    {
        ongoing_order.remove(index);
    }
    
    public void insetPickup_order(Order o)
    {
        readyForPickup_order.add(o);
    }
    
    public String showOngoinOrder()
    {
        String s = "\nOngoing Order: \n";
        if(ongoing_order.size() != 0)
        {
            for(int i = 0;i<ongoing_order.size();i++)
            {
                s = s + "\nCustomer Name: " + ongoing_order.get(i).getCustomerData().getName() + "\n";
                s = s + "Toal Pizzas: " + ongoing_order.get(i).getCart().getSize() + "\n";
                s = s+"Pizza Names: ";
                s = s + ongoing_order.get(i).getCart().getAllPizzaName();
                s+="\n";
            }
        }else
            s += "Empty";
        s+="\n\n";
        return s;
    }
    public String showOrderReady()
    {
        String s = "\nOrder Ready for Pickup:\n";
        if(readyForPickup_order.size() != 0)
        {
            s = "Customer Name: " + readyForPickup_order.get(0).getCustomerData().getName() + "\n";
            s = s + "Toal Pizzas: " + readyForPickup_order.get(0).getCart().getSize() + "\n";
            s = s+"Pizza Names: ";
            for(int i = 0;i<readyForPickup_order.size();i++)
            {
                s = s + readyForPickup_order.get(i).getCart().getAllPizzaName();
            }
        }else{
            s += "Empty";
        }
        s+="\n\n";
        return s;
        /*
        JOptionPane.showMessageDialog(null, s, "Order");
        */
    }
//    public String getOrderReadyforPickup()
//    {
//        String s = "";
//        return s;
//    }
}

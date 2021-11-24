/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaapp;

public class CustomerData 
{
    private String name;
    private String phoneNumber;
    private String cardNumber;
    
    CustomerData(String name, String phoneNumber, String cardNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
    }
    CustomerData(){}
    public String getName()
    {
        return this.name;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public String getCardNumber()
    {
        return this.cardNumber;
    }
    
    public String getAllinfo()
    {
        String info = "";
        info = info + this.name + " " + this.phoneNumber + " " + this.cardNumber;
        return info;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author lina9
 */
public class Account {
    //instance variables
    private String name;
    private int number;
    private double balance;
    
    // constructor
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    
    // getters
    public String getName(){
        return name;
    }
    
    public int getNumber(){
        return number;
    }
    
    public double getBalance(){
        return balance;
    }
    
    // methods
    public boolean deposit(double amount){
        if (amount <= 0){
            return false;
        } else {
            balance += amount;//balance = balance + amount
            return true;
        }
    }
    
    public boolean withdraw(double amount){
        if (amount <= 0 || amount > balance){
            return false;
        } else {
            balance -= amount; //balance= balance - amount
            return true;
        }
    }
    
    @Override
    public String toString() {
        //DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
    
}

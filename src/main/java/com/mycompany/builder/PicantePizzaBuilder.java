/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author ce.christian
 */
public class PicantePizzaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa(){
        pizza.setMasa("Cocida");
    }
    
     @Override
    public void buildSalsa(){
        pizza.setSalsa("Picante");
    }
    

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Chorizo picante");
    }
}

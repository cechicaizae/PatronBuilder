/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.builder;

/**
 *
 * @author ce.christian
 */
public class Builder {

    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
        
        cocina.setPizzaBuilder( hawai_pizzabuilder );
        cocina.construirPizza();
        
        Pizza pizza = cocina.getPizza();

    }
}

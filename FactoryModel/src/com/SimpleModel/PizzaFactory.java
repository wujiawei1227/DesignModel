package com.SimpleModel;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 11:48
 **/

public class PizzaFactory {
   public Pizza getPizza(String pizza){
       if (pizza.equalsIgnoreCase("bjchesspizza")){
           return new BjchessPizza();
       }else if (pizza.equalsIgnoreCase("ldchesspizza")){
           return new LDPepperPizza();
       }else {
           return null;
       }
   }
}

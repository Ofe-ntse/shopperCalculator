/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppercalculator;

/**
 *
 * @author Ofentse
 */
public class ShopperCalculator {

    public static void main(String[] args) {
        System.out.println("Enter the name of the first item you want to buy: Jam");
        System.out.println("Enter the price of the first item: R10");
        System.out.println("Enter the name of the second item you want to buy: Coffee");
        System.out.println("Enter the price of the second item: R20" );
        System.out.println("Enter the name of the third item you want to buy: Salt");
        System.out.println("Enter the price of the third item: R19.99 ");
        System.out.println("Enter the name of the fourth item you want to buy: Jik");
        System.out.println("Enter the price of the first item: R30");
        System.out.println("Enter the name of the fifth item you want to buy: Bread");
        System.out.println("Enter the price of the second item: R21");
        
        System.out.println("========================================================");
        
        System.out.println("You have selected to buy the following items:");
        
        System.out.println("--------------------------------------------------------");
        
        String[] items = {"Jam", "Coffee","Salt","Jik","Bread"};
        double[] prices = {10.0, 20.0, 19.99, 30.0, 21.0};
        for (int i= 0; i<5; i++){
            System.out.println("Item:"+items[i]+ " at R"+ prices[i]);   
        }
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Total for all items: R"+ 100.99);
    }           
}

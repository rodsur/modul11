/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.Date;

/**
 *
 * @author rodsur
 */
public class opgave1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductDatabase database = new ProductDatabase();
        
        Date dato = new Date();
        
        FoodProduct hummersuppe = new FoodProduct(01, "hummersuppe", 20.0,dato,2);
        FoodProduct æble = new FoodProduct(02, "æble", 10.0, dato,20);
        FoodProduct hest = new FoodProduct(03, "hest", 30.0, dato,37);
        NonFoodProduct dæk = new NonFoodProduct(04, "dæk",10000.0,"Det pureste marmor");
        NonFoodProduct skrald = new NonFoodProduct(05, "bunke af skrald",10000.0,"Skrald");
        NonFoodProduct pizzabakker = new NonFoodProduct(06, "pizzabakker",10000.0,"Pap");
        database.addProduct(hummersuppe);
        database.addProduct(æble);
        database.addProduct(hest);
        database.addProduct(dæk);
        database.addProduct(skrald);
        database.addProduct(pizzabakker);
        
        
        
        System.out.println(hummersuppe.equals(hummersuppe));
        System.out.println(hummersuppe.equals(æble));
        System.out.println(æble.equals(æble));
        database.makeList();
        database.removeProduct(æble);
        database.makeList();
        
        
    }
    
}

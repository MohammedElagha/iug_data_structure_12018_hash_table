/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mohammed El-Agha
 */
public class Main {
    public static void main(String[] args) {
        HashTable<String, String> hash = new HashTable();
        
        hash.put("pssssssssss", "Palestine");
        hash.put("eg", "Egypt");
        hash.put("sa", "Syria");
                
        System.out.println(hash.getValue("pssssssssss"));
        
//        System.out.println("0".hashCode() % HashTable.MOD_BASE);
//        System.out.println("ps".hashCode() % HashTable.MOD_BASE);
//        
//        System.out.println(hash.remove("sa"));
//        
//        System.out.println(hash.size());
//        System.out.println(hash.getValue("sa"));

        
   }
}

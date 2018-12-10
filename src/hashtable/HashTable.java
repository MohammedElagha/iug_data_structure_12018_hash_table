/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohammed El-Agha
 */
public class HashTable<E,T> {
    int limit = 115000;
    Object[] entries;
    Object[] keySet;
    Object[] values;
    int size = 0;
    
    public HashTable() {
        entries = new Object [limit];
        keySet = new Object [limit];
        values = new Object [limit];
    }
    
    public boolean put(E key, T value) {
        Entry<E,T> entry = new Entry(key, value);
        int index = Math.abs(key.hashCode()) % limit;
        
        for(int i = index ; i < entries.length ; i++) {
            if(entries[i] == null) {
                entries[i] = entry;
                return true;
            }
        }
        
        return false;
    }
    
    
    public boolean remove(E key) {
        int index = Math.abs(key.hashCode()) % limit;
        for(int i = index ; i < limit ; i++) {
            if(entries[i] != null) {
                if(key.hashCode() == ((Entry<E,T>) entries[i]).getKey().hashCode()) {
                    entries[i] = null;
                }
            }
        }
        return false;
    }
    
    
    public T getValue(E key) {
        int index = Math.abs(key.hashCode()) % limit;
        for(int i = index ; i < limit ; i++) {
            if(entries[i] != null) {
                if(key.hashCode() == ((Entry<E,T>) entries[i]).getKey().hashCode()) {
                    return ((Entry<E,T>) entries[i]).getValue();
                }
            }
        }
        return null;
    }
       
    
    public Object[] keySet() {
        return keySet;
    }
    
    public Object[] values() {
        return values;
    }
    
    public int size() {
        return size;
    }
}

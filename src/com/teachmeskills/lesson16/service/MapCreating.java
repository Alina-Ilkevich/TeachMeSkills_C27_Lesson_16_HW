package com.teachmeskills.lesson16.service;

import com.teachmeskills.lesson16.client.Client;
import com.teachmeskills.lesson16.fabric.ClientFabric;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This class contains a method for creating a collection of type Map
 * displaying the collection on the display
 */
public class MapCreating {
    public static Map<String, Client> createMap(){
        Map<String, Client> map = new HashMap<>();
        map.put("111", ClientFabric.client1);
        map.put("222", ClientFabric.client2);
        map.put("333", ClientFabric.client3);
        return map;
    }
    public static void showMapFirstWay(Map<String, Client> map){
        for (Map.Entry<String, Client> element : map.entrySet()){
            System.out.println("Key: " + element.getKey() + "\nValue: " + element.getValue());
        }
    }
    public static void showMapSecondWay(Map<String, Client> map){
        Iterator<Map.Entry<String, Client>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            //System.out.println("Key: " + itr.getKey() + "\nValue: " + element.getValue());
        }
    }
    public static void showKey(Map<String, Client> map){
        for (String key : map.keySet()){
            System.out.println("Key: " + key);
        }
    }
    public static void showValue(Map<String, Client> map){
        for (Client value : map.values()){
            System.out.println("Value: " + value);
        }
    }
}

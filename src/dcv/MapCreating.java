package dcv;

import client.Client;
import fabric.ClientFabric;

import java.util.HashMap;
import java.util.Map;

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
}

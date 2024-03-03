package com.teachmeskills.lesson16.run;

import com.teachmeskills.lesson16.service.MapCreating;

/**
 * This class is used to check the written code
 */
public class Runner {
    public static void main(String[] args) {
        MapCreating.showMapFirstWay(MapCreating.createMap());
        System.out.println("_________________");
        MapCreating.showMapSecondWay(MapCreating.createMap());
        System.out.println("_________________");
        MapCreating.showKey(MapCreating.createMap());
        System.out.println("_________________");
        MapCreating.showValue(MapCreating.createMap());
    }
}

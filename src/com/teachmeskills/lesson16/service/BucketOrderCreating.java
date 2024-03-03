package com.teachmeskills.lesson16.service;

import com.teachmeskills.lesson16.fabric.OrderFabric;
import com.teachmeskills.lesson16.order.Order;

import java.util.ArrayList;

/**
 * This class contains methods for creating a customer's order bucket
 */
public class BucketOrderCreating {
    public static ArrayList<Order> createBucketOrderFirst(){
        ArrayList<Order> bucketOrderFirst = new ArrayList<>();
        bucketOrderFirst.add(OrderFabric.order1);
        bucketOrderFirst.add(OrderFabric.order3);
        bucketOrderFirst.add(OrderFabric.order5);
        return bucketOrderFirst;
    }
    public static ArrayList<Order> createBucketOrderSecond(){
        ArrayList<Order> bucketOrderSecond = new ArrayList<>();
        bucketOrderSecond.add(OrderFabric.order2);
        bucketOrderSecond.add(OrderFabric.order4);
        bucketOrderSecond.add(OrderFabric.order6);
        return bucketOrderSecond;
    }
    public static ArrayList<Order> createBucketOrderThird(){
        ArrayList<Order> bucketOrderThird = new ArrayList<>();
        bucketOrderThird.add(OrderFabric.order7);
        return bucketOrderThird;
    }
}

package com.teachmeskills.lesson16.fabric;

import com.teachmeskills.lesson16.client.Client;
import com.teachmeskills.lesson16.service.BucketOrderCreating;

/**
 * This class is used to create objects of the class Client
 */
public class ClientFabric {
    public static Client client1 = new Client("name1", 18, "02.03.2024", BucketOrderCreating.createBucketOrderFirst());
    public static Client client2 = new Client("name2", 28, "12.05.2023", BucketOrderCreating.createBucketOrderSecond());
    public static Client client3 = new Client("name3", 38, "17.12.2022", BucketOrderCreating.createBucketOrderThird());
}
